package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import java.time.Instant;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import au.gov.ga.geodesy.igssitelog.util.DateUtil;

public class DateAdapter extends XmlAdapter<String, Instant> {

    @Override
    public String marshal(Instant dateTime) throws Exception {
        return DateUtil.format(dateTime);
    }

    @Override
    public Instant unmarshal(String dateString) throws Exception {
        return dateString == null ? null : DateUtil.parse(dateString.trim());
    }
}
