package au.gov.ga.geodesy.igssitelog.support.marshalling.jaxb.moxy;

import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;

import org.junit.Assert;
import org.junit.Test;

import au.gov.ga.geodesy.igssitelog.domain.model.IgsSiteLog;
import au.gov.ga.geodesy.igssitelog.interfaces.xml.MarshallingException;
import au.gov.ga.geodesy.igssitelog.support.marshalling.moxy.IgsSiteLogMoxyMarshaller;

public class IgsSiteLogMoxyMarshallerTest {

    private static final String sampleSiteLogsDir = "src/test/resources/sitelog/";
    private IgsSiteLogMoxyMarshaller marshaller;

    public IgsSiteLogMoxyMarshallerTest() throws Exception {
        marshaller = new IgsSiteLogMoxyMarshaller();
    }

    @Test(expected = MarshallingException.class)
    public void unmarshalInvalidSiteLogText() throws MarshallingException {
        marshaller.unmarshal(new StringReader("foo"));
    }

    @Test(expected = MarshallingException.class)
    public void unmarshalInvalidSiteLogXml() throws MarshallingException {
        marshaller.unmarshal(new StringReader("<foo></foo>"));
    }

    @Test
    public void testUnmarshalling() throws Exception {
        for (File siteLogFile : getSiteLogFiles()) {
            IgsSiteLog siteLog = null;
            try {
                siteLog = marshaller.unmarshal(getSiteLogReader(siteLogFile));
                System.out.println("Successfully unmarshalled " + siteLogFile.getName());
            } catch (MarshallingException e) {
                System.out.println("Failed to unmarshall " + siteLogFile.getName());
                if (e.getValidationMessages().isEmpty()) {
                    System.out.println(e.getMessage());
                } else {
                    for (String s : e.getValidationMessages()) {
                        System.out.println(s);
                    }
                }
            }
            if (siteLog != null) {
                try {
                    marshaller.marshal(siteLog, new PrintWriter(new OutputStream() {
                        public void write(int x) {
                        }
                    }));
                    System.out.println("Successfully marshalled " + siteLogFile.getName());
                } catch (MarshallingException e) {
                    System.out.println("Failed to marshall " + siteLogFile.getName() + ": " + e.getMessage());
                }
            }
        }
    }

    private Reader getSiteLogReader(String fourCharacterId) throws IOException {
        return getSiteLogReader(getSiteLogFile(fourCharacterId));
    }

    private Reader getSiteLogReader(File siteLogFile) throws IOException {
        return new FileReader(siteLogFile);
    }

    private File getSiteLogFile(String fourCharacterId) {
        return new File(sampleSiteLogsDir + fourCharacterId.toUpperCase() + ".xml");
    }

    private File[] getSiteLogFiles() throws Exception {
        return new File(sampleSiteLogsDir).listFiles(new FileFilter() {
            public boolean accept(File f) {
                return f.getName().endsWith(".xml");
            }
        });
    }

    @Test
    public void testEmptyContacts() throws Exception {
        IgsSiteLog siteLog = marshaller.unmarshal(getSiteLogReader("ABRK"));
        Assert.assertNull(siteLog.getResponsibleAgency().getPrimaryContact());
        Assert.assertNull(siteLog.getResponsibleAgency().getSecondaryContact());
    }
}
