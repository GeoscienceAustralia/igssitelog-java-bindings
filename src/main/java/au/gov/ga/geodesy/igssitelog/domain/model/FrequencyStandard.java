package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/frequencyStandard.xsd:frequenceStandardType
 */
public class FrequencyStandard {

    private Integer id;

    @Size(max = 200)
    protected String standardType;

    @Size(max = 200)
    protected String inputFrequency;

    @Valid
    protected EffectiveDates effectiveDates;

    @Size(max = 4000)
    protected String notes;

    @SuppressWarnings("unused")
    private Integer getId() {
        return id;
    }

    @SuppressWarnings("unused")
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * Return standard type.
     */
    public String getStandardType() {
        return standardType;
    }

    /**
     * Set standard type.
     */
    public void setStandardType(String value) {
        this.standardType = value;
    }

    /**
     * Return input frequency.
     */
    public String getInputFrequency() {
        return inputFrequency;
    }

    /**
     * Set input frequency.
     */
    public void setInputFrequency(String value) {
        this.inputFrequency = value;
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

    /**
     * Return notes.
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Set notes.
     */
    public void setNotes(String value) {
        this.notes = value;
    }
}
