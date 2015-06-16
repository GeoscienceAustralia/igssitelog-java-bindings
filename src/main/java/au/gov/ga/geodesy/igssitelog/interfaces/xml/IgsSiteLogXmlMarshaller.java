package au.gov.ga.geodesy.igssitelog.interfaces.xml;

import au.gov.ga.geodesy.igssitelog.domain.model.IgsSiteLog;

import java.io.Writer;
import java.io.Reader;

public interface IgsSiteLogXmlMarshaller {
    void marshal(IgsSiteLog igsSite, Writer writer) throws MarshallingException;

    IgsSiteLog unmarshal(Reader reader) throws MarshallingException;
}
