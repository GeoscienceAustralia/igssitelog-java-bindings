package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.ParseConversionEvent;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.util.ValidationEventCollector;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.eclipse.persistence.sessions.SessionEventListener;

import au.gov.ga.geodesy.igssitelog.domain.model.IgsSiteLog;
import au.gov.ga.geodesy.igssitelog.interfaces.xml.IgsSiteLogXmlMarshaller;
import au.gov.ga.geodesy.igssitelog.interfaces.xml.MarshallingException;

/**
 * EclipseLink Moxy implementation using external mapping files.
 */
public class IgsSiteLogMoxyMarshaller implements IgsSiteLogXmlMarshaller {

    private JAXBContext jaxbContext;

    public IgsSiteLogMoxyMarshaller() throws MarshallingException {
        try {
            Map<String, Source> metadata = new HashMap<String, Source>();
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String mappingFilename = "au/gov/ga/geodesy/igssitelog/support/marshalling/moxy/sitelog.xml";
            Source mapping = new StreamSource(classLoader.getResourceAsStream(mappingFilename));
            metadata.put("au.gov.ga.geodesy.igssitelog.domain.model", mapping);

            // implementation-specific helper classes are packeged under support and mapped seperately
            String infraMappingFilename = "au/gov/ga/geodesy/igssitelog/support/marshalling/moxy/sitelog-infra.xml";
            Source infraMapping = new StreamSource(classLoader.getResourceAsStream(infraMappingFilename));
            metadata.put("au.gov.ga.geodesy.igssitelog.support.marshalling.moxy", infraMapping);

            Map<String, Object> props = new HashMap<String, Object>();
            props.put(JAXBContextProperties.OXM_METADATA_SOURCE, metadata);

            SessionEventListener sessionEventListener = new NullPolicySessionEventListener();
            props.put(JAXBContextProperties.SESSION_EVENT_LISTENER, sessionEventListener);

            jaxbContext = JAXBContextFactory.createContext(new Class[] {IgsSiteLog.class,
                    AdaptedApproximatePosition.class}, props);
        } catch (JAXBException e) {
            throw new MarshallingException("Failed to initialise JAXBContext", e);
        }
    }

    private Marshaller createMarshaller() throws MarshallingException {
        try {
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller
                    .setProperty(
                            Marshaller.JAXB_SCHEMA_LOCATION,
                            "http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/2004 http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/2004/igsSiteLog.xsd");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
            return marshaller;
        } catch (JAXBException e) {
            throw new MarshallingException("Failed to create marshaller", e);
        }
    }

    private Unmarshaller createUnmarshaller() throws MarshallingException {
        try {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller;
        } catch (JAXBException e) {
            throw new MarshallingException("Failed to create unmarshaller", e);
        }
    }

    public void marshal(IgsSiteLog site, Writer writer) throws MarshallingException {
        try {
            createMarshaller().marshal(site, writer);
        } catch (JAXBException e) {
            throw new MarshallingException("Failed to marshal a site log", e);
        }
    }

    public IgsSiteLog unmarshal(Reader reader) throws MarshallingException {
        try {
            Unmarshaller unmarshaller = createUnmarshaller();
            ValidationEventCollector eventCollector = new ValidationEventCollector() {
                public boolean handleEvent(ValidationEvent event) {
                    if (event.getLinkedException() instanceof MarshallingException) {
                        return super.handleEvent(event);
                    }
                    return true;
                }
            };
            unmarshaller.setEventHandler(eventCollector);
            IgsSiteLog siteLog = (IgsSiteLog) unmarshaller.unmarshal(reader);

            if (eventCollector.hasEvents()) {
                throw new MarshallingException(eventCollector.getEvents());
            }
            return siteLog;
        } catch (JAXBException e) {
            throw new MarshallingException("Failed to unmarshal a site log", e);
        }
    }
}
