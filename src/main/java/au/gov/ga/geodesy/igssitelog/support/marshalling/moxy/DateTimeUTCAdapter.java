package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import java.time.Instant;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import au.gov.ga.geodesy.igssitelog.util.DateUtil;

public class DateTimeUTCAdapter extends XmlAdapter<String, Instant> {

    @Override
    public String marshal(Instant instant) throws Exception {
        return instant == null ? null : DateUtil.format(instant);
    }

    @Override
    public Instant unmarshal(String dateString) throws Exception {
        if (dateString == null) {
            return null;
        }
        if (dateString.equals("(CCYY-MM-DD)") || dateString.equals("CCYY-MM-DD")) {
            return null;
        }
        return DateUtil.parse(dateString.trim());
    }
}
