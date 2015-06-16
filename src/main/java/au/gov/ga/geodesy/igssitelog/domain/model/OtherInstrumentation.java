package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/otherInstrumentation.xsd
 */
public class OtherInstrumentation {

    private Integer id;

    @Size(max = 4000)
    protected String instrumentation;

    @Valid
    protected EffectiveDates effectiveDates;

    @SuppressWarnings("unused")
    private Integer getId() {
        return id;
    }

    @SuppressWarnings("unused")
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * Return instrumentation.
     */
    public String getInstrumentation() {
        return instrumentation;
    }

    /**
     * Set instrumentation.
     */
    public void setInstrumentation(String value) {
        this.instrumentation = value;
    }

    /**
     * Return effective dates.
     */
    public EffectiveDates getEffectiveDates() {
        return effectiveDates;
    }

    /**
     * Set effective dates.
     */
    public void setEffectiveDates(EffectiveDates value) {
        this.effectiveDates = value;
    }
}
