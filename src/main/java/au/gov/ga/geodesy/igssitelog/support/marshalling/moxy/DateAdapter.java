package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import java.time.Instant;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.commons.lang.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.gov.ga.geodesy.igssitelog.interfaces.xml.MarshallingException;
import au.gov.ga.geodesy.igssitelog.util.DateUtil;

public class DateAdapter extends XmlAdapter<String, Instant> {

    private static final Logger log = LoggerFactory.getLogger(DateAdapter.class);

    @Override
    public String marshal(Instant dateTime) throws Exception {
        return DateUtil.format(dateTime);
    }

    @Override
    public Instant unmarshal(String dateString) throws Exception {
        Instant result = null;

        if (dateString == null) {
            return null;
        }
        try {
            result = DateUtil.parse(dateString);
        } catch (MarshallingException e) {
            log.error("Failed to unmarshal date '" + dateString + "; returning null and carrying on");
        }

        return result;
    }
}
