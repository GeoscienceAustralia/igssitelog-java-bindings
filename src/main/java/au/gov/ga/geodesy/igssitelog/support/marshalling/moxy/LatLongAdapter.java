package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import java.util.regex.Pattern;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LatLongAdapter extends XmlAdapter<String, Double> {

    private static final Pattern spaces = Pattern.compile("\\s+");

    @Override
    public String marshal(Double d) throws Exception {
        return String.valueOf(d);
    }

    @Override
    public Double unmarshal(String s) throws Exception {
        return s == null ? null : Double.valueOf(spaces.matcher(s).replaceAll(""));
    }
}
