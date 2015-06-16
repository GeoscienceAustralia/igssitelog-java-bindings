package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/collocationInformation.xsd:collocationInformationType
 */
public class CollocationInformation {

    private Integer id;

    @Size(max = 200)
    protected String instrumentType;

    @Size(max = 200)
    protected String status;

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
     * Return instrumentation type.
     */
    public String getInstrumentType() {
        return instrumentType;
    }

    /**
     * Set instrumentation type.
     */
    public void setInstrumentType(String value) {
        this.instrumentType = value;
    }

    /**
     * Return status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set status.
     */
    public void setStatus(String value) {
        this.status = value;
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
