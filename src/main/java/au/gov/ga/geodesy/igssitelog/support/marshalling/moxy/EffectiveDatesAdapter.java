package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.gov.ga.geodesy.igssitelog.domain.model.EffectiveDates;

public class EffectiveDatesAdapter extends XmlAdapter<String, EffectiveDates> {

    private static final Logger log = LoggerFactory.getLogger(EffectiveDatesAdapter.class);

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final String formatPattern = "(CCYY-MM-DD)";

    @Override
    public String marshal(EffectiveDates dates) throws Exception {
        if (dates == null) {
            return null;
        }
        StringBuilder buf = new StringBuilder();

        if (dates.getFrom() == null) {
            buf.append(formatPattern);
        } else {
            buf.append(dateFormat.format(dates.getFrom()));
        }
        buf.append("/");
        if (dates.getTo() == null) {
            buf.append(formatPattern);
        } else {
            buf.append(dateFormat.format(dates.getTo()));
        }
        return buf.toString();
    }

    private Date parse(String s) {
        try {
            if (s.startsWith("CCYY-MM-DD") || s.startsWith("(CCYY-MM-DD")) {
                return null;
            }
            return dateFormat.parse(s);
        } catch (ParseException e) {
            log.error("Failed to unmarshal date '" + s + "'; returning null and carrying on", e);
            return null;
        }
    }

    @Override
    public EffectiveDates unmarshal(String s) throws Exception {
        if (s == null) {
            return null;
        }
        s = s.trim();
        if (s.equals("")) {
            return null;
        }
        if (s.startsWith("(")) {
            s = s.substring(1, s.length());
        }
        if (s.endsWith(")")) {
            s = s.substring(0, s.length() - 1);
        }
        if (s.equals("CCYY-MM-DD/CCYY-MM-DD")) {
            return null;
        }
        EffectiveDates dates = new EffectiveDates();
        String[] splits = s.split("/");
        dates.setFrom(parse(splits[0]));
        if (splits.length > 1) {
            dates.setTo(parse(splits[1]));
        }
        if (dates.getFrom() != null || dates.getTo() != null) {
            return dates;
        } else {
            log.error("Failed to unmarshal effective dates '" + s + "'; returning null and carrying on");
            return null;
        }
    }
}
