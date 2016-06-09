package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

import java.time.Instant;

import static org.junit.Assert.*;

/**
 * Created by brookes on 9/06/16.
 */
public class DateAdapterTest {
    DateAdapter dateAdapter = new DateAdapter();
    @Test
    public void testUnmarshalDateWithWhiteSpace() throws Exception {
        String testDate = "1939-08-12\n    ";
        String expected = "1939-08-12";
        Instant actual = dateAdapter.unmarshal(testDate);
        MatcherAssert.assertThat(actual.toString(), Matchers.containsString(expected));
    }

}
