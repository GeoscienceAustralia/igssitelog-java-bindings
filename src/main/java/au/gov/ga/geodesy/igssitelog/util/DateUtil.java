package au.gov.ga.geodesy.igssitelog.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.gov.ga.geodesy.igssitelog.interfaces.xml.MarshallingException;

/**
 * Utility class for parsing dates using a set of predefined patterns
 * matching the date patterns that we have observed in the input.
 */
public class DateUtil {

    private static final Logger log = LoggerFactory.getLogger(DateUtil.class);

    private static String[] inputDatePatterns = new String[] {
            "uuuu-MM-dd'T'HH:mm:ssX",
            "uuuu-MM-dd'T'HH:mmX",
            "uuuu-MM-dd'T'HH",
            "uuuu-MM-dd",
            "(uuuu-MM-dd)"
    };

    /**
     * List of input patterns that we interpret as null.
     */
    private static String[] nullDatePatterns = new String[] {
            "(CCYY-MM-DDThh:mmZ)",
            "CCYY-MM-DDThh:mmZ",
            "(CCYY-MM-DD)",
            "(CCYY-MM-DD",
            "CCYY-MM-DD)",
            "CCYY-MM-DD"
    };

    private static List<DateTimeFormatter> inputDateFormats = new ArrayList<DateTimeFormatter>();

    private static DateTimeFormatter outputDateFormat = DateTimeFormatter.ofPattern("uuuu-MM-dd").withZone(ZoneId.of("UTC"));

    static {
        for (String pattern : inputDatePatterns) {
            DateTimeFormatter inputDateFormat = DateTimeFormatter
                .ofPattern(pattern)
                .withZone(ZoneId.of("UTC"))
                .withResolverStyle(ResolverStyle.STRICT);
            inputDateFormats.add(inputDateFormat);
        }
    }

    public static String format(Instant instant) {
        return outputDateFormat.format(instant);
    }

    /**
     * Parse the given string into an Instant using the specified pattern
     * @param dateString
     * @param pattern
     * @return Instant
     * @throws DateTimeParseException if parsing failed with the patterns
     */
    public static Instant parse(String dateString, String pattern) throws DateTimeParseException {

        DateTimeFormatter inputDateFormat =  DateTimeFormatter.ofPattern(pattern).withZone(ZoneId.of("UTC"));

        Instant result = null;
        if (dateString != null) {
            try {
                log.debug("Attempt to parse string " + dateString + " with LocalDateTime using pattern: " + pattern);
                result = LocalDateTime.parse(dateString, inputDateFormat).toInstant(ZoneOffset.UTC);
            } catch (DateTimeParseException e) {
                try {
                    log.debug("Failed. Trying LocalDate");
                    // try parsing the string into a date only (no time fields)
                    result = LocalDate.parse(dateString, inputDateFormat).atStartOfDay(ZoneId.of("UTC")).toInstant();
                } catch (DateTimeParseException e2) {
                    throw e2;
                }
            }
        }
        return result;
    }

    /**
     * Parse the given string into an Instant using all the registered patterns
     * @param dateString
     * @return Instant
     * @throws MarshallingException
     */
    public static Instant parse(String dateString) throws MarshallingException {

        Instant result= null;

        if (ArrayUtils.contains(nullDatePatterns, dateString)) {
            log.debug("interpreting " + dateString + " as an empty date");
            return null;
        }

        for (String pattern: inputDatePatterns) {
            try {
                result = parse(dateString, pattern);
                log.debug("Success!");
                break;
            } catch (DateTimeParseException e) {
                log.debug("Failed.");
            }
        }
        if (result == null) {
            throw new MarshallingException("Failed to parse '" + dateString + "' with any of the registered patterns: " +
                StringUtils.join(inputDatePatterns, ", "));
        }

        return result;
    }
}
