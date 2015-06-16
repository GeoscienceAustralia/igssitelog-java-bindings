package au.gov.ga.geodesy.igssitelog.domain.model;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/surveyedLocalTies.xsd:surveyedLocalTiesType
 */
public class SurveyedLocalTie {

    private Integer id;

    @Size(max = 200)
    protected String tiedMarkerName;

    @Size(max = 200)
    protected String tiedMarkerUsage;

    @Size(max = 200)
    protected String tiedMarkerCdpNumber;

    @Size(max = 200)
    protected String tiedMarkerDomesNumber;

    @Valid
    protected DifferentialFromMarker differentialFromMarker;

    protected String localSiteTieAccuracy;

    @Size(max = 200)
    protected String surveyMethod;

    @Past
    protected Date dateMeasured;

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
     * Return tied marker name.
     */
    public String getTiedMarkerName() {
        return tiedMarkerName;
    }

    /**
     * Set tied marker name.
     */
    public void setTiedMarkerName(String value) {
        this.tiedMarkerName = value;
    }

    /**
     * Return tied marker usage.
     */
    public String getTiedMarkerUsage() {
        return tiedMarkerUsage;
    }

    /**
     * Set tied marker usage.
     */
    public void setTiedMarkerUsage(String value) {
        this.tiedMarkerUsage = value;
    }

    /**
     * Return tied marker CDP number.
     */
    public String getTiedMarkerCdpNumber() {
        return tiedMarkerCdpNumber;
    }

    /**
     * Set tied marker CDP number.
     */
    public void setTiedMarkerCdpNumber(String value) {
        this.tiedMarkerCdpNumber = value;
    }

    /**
     * Return tied marker DOMES number.
     */
    public String getTiedMarkerDomesNumber() {
        return tiedMarkerDomesNumber;
    }

    /**
     * Set tied marker DOMES number.
     */
    public void setTiedMarkerDomesNumber(String value) {
        this.tiedMarkerDomesNumber = value;
    }

    /**
     * Return differential from GNSS marker to tied monument.
     */
    public DifferentialFromMarker getDifferentialFromMarker() {
        return differentialFromMarker;
    }

    /**
     * Set diffential from GNSS marker to tied monument.
     */
    public void setDifferentialFromMarker(DifferentialFromMarker value) {
        this.differentialFromMarker = value;
    }

    /**
     * Return tie accuracy in millimetres.
     */
    public String getLocalSiteTieAccuracy() {
        return localSiteTieAccuracy;
    }

    /**
     * Set tie accuracy (millimeters).
     */
    public void setLocalSiteTieAccuracy(String value) {
        this.localSiteTieAccuracy = value;
    }

    /**
     * Set survey method.
     */
    public String getSurveyMethod() {
        return surveyMethod;
    }

    /**
     * Set survey method.
     */
    public void setSurveyMethod(String value) {
        this.surveyMethod = value;
    }

    /**
     * Return date measured.
     */
    public Date getDateMeasured() {
        return dateMeasured;
    }

    /**
     * Set date measured.
     */
    public void setDateMeasured(Date value) {
        this.dateMeasured = value;
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
