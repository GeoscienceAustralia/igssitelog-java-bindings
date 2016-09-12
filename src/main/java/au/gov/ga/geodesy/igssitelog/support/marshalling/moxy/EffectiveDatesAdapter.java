package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.gov.ga.geodesy.igssitelog.domain.model.EffectiveDates;
import au.gov.ga.geodesy.igssitelog.interfaces.xml.MarshallingException;
import au.gov.ga.geodesy.igssitelog.util.DateUtil;

public class EffectiveDatesAdapter extends XmlAdapter<String, EffectiveDates> {

    private static final Logger log = LoggerFactory.getLogger(EffectiveDatesAdapter.class);

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
            buf.append(DateUtil.format(dates.getFrom()));
        }
        buf.append("/");
        if (dates.getTo() == null) {
            buf.append(formatPattern);
        } else {
            buf.append(DateUtil.format(dates.getTo()));
        }
        return buf.toString();
    }

    @Override
    public EffectiveDates unmarshal(String inputDateString) throws MarshallingException {
        if (inputDateString == null) {
            return null;
        }
        inputDateString = inputDateString.trim();
        if (inputDateString.equals("")) {
            return null;
        }
        if (inputDateString.startsWith("(")) {
            inputDateString = inputDateString.substring(1, inputDateString.length());
        }
        if (inputDateString.endsWith(")")) {
            inputDateString = inputDateString.substring(0, inputDateString.length() - 1);
        }
        if (inputDateString.equals("CCYY-MM-DD/CCYY-MM-DD")) {
            return null;
        }
        EffectiveDates dates = new EffectiveDates();
        String[] splits = inputDateString.split("/");
        dates.setFrom(DateUtil.parse(splits[0].trim()));

        if (splits.length > 1) {
            dates.setTo(DateUtil.parse(splits[1].trim()));
        }
        if (dates.getFrom() != null || dates.getTo() != null) {
            return dates;
        } else {
            return null;
        }
    }
}
