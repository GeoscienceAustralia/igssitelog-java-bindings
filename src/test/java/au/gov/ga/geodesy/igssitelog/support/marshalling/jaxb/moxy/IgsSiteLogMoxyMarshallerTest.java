package au.gov.ga.geodesy.igssitelog.support.marshalling.jaxb.moxy;

import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;

import org.junit.Assert;
import org.junit.Test;

import au.gov.ga.geodesy.igssitelog.domain.model.IgsSiteLog;
import au.gov.ga.geodesy.igssitelog.support.marshalling.moxy.IgsSiteLogMoxyMarshaller;

public class IgsSiteLogMoxyMarshallerTest {

    private static final String sampleSiteLogsDir = "src/test/resources/sitelog/";
    private IgsSiteLogMoxyMarshaller marshaller;

    public IgsSiteLogMoxyMarshallerTest() throws Exception {
        marshaller = new IgsSiteLogMoxyMarshaller();
    }

    @Test
    public void testMarshallingAndUnmarshalling() throws Exception {
        for (File siteLogFile : getSiteLogFiles()) {
            try {
                IgsSiteLog siteLog = marshaller.unmarshal(getSiteLogReader(siteLogFile));
                marshaller.marshal(siteLog, new PrintWriter(new OutputStream() {
                    public void write(int x) {
                    }
                }));
                System.out.println("Successfully (un)marshalled " + siteLogFile.getAbsolutePath());
            } catch (Exception e) {
                throw new Exception("Failed to test (un)marshalling of " + siteLogFile.getAbsolutePath(), e);
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
