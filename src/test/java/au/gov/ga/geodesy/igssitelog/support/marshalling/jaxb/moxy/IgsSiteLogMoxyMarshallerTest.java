package au.gov.ga.geodesy.igssitelog.support.marshalling.jaxb.moxy;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.junit.Test;

import au.gov.ga.geodesy.igssitelog.domain.model.IgsSiteLog;
import au.gov.ga.geodesy.igssitelog.support.marshalling.moxy.IgsSiteLogMoxyMarshaller;

public class IgsSiteLogMoxyMarshallerTest {

    private static final String sampleSiteLogsDir = "src/test/resources/sitelog";
    private IgsSiteLogMoxyMarshaller marshaller;

    public IgsSiteLogMoxyMarshallerTest() throws Exception {
        marshaller = new IgsSiteLogMoxyMarshaller();
    }

    @Test
    public void testMarshallingAndUnmarshalling() throws Exception {
        for (File siteLogFile : getSiteLogFiles()) {
            try {
                IgsSiteLog siteLog = marshaller.unmarshal(new InputStreamReader(new FileInputStream(siteLogFile)));
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

    private File[] getSiteLogFiles() throws Exception {
        return new File(sampleSiteLogsDir).listFiles(new FileFilter() {
            public boolean accept(File f) {
                return f.getName().endsWith(".xml");
            }
        });
    }
}
