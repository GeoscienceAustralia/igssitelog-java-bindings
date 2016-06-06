package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import java.time.Instant;
import java.time.format.DateTimeParseException;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.gov.ga.geodesy.igssitelog.util.DateUtil;

public class DateTimeUTCAdapter extends XmlAdapter<String, Instant> {

    private static final Logger log = LoggerFactory.getLogger(DateTimeUTCAdapter.class);

    @Override
    public String marshal(Instant instant) throws Exception {
        return instant == null ? null : DateUtil.format(instant);
    }

    @Override
    public Instant unmarshal(String dateString) throws Exception {
        Instant result = null;

        if (dateString == null) {
            return null;
        }
        if (dateString.equals("(CCYY-MM-DD)") || dateString.equals("CCYY-MM-DD")) {
            return null;
        }
        try {
            result = DateUtil.parse(dateString);
        } catch (DateTimeParseException e) {
            log.error("Failed to unmarshal date '" + dateString + "; returning null and carrying on");
        }

        return result;
    }
}
