package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/monumentInfo/2004/siteLocation.xsd:siteLocationType
 */
public class SiteLocation {

    @Size(max = 200)
    protected String city;

    @Size(max = 200)
    protected String state;

    @Size(max = 200)
    protected String country;

    @Size(max = 200)
    protected String tectonicPlate;

    @Valid
    protected ApproximatePosition approximatePosition;

    @Size(max = 4000)
    protected String notes;

    /**
     * Return city.
     */
    public String getCity() {
        return city;
    }

    /**
     * Set city.
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Return state.
     */
    public String getState() {
        return state;
    }

    /**
     * Set state.
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Return country.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set country.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Return tectonic plate.
     */
    public String getTectonicPlate() {
        return tectonicPlate;
    }

    /**
     * Set tectonic plate.
     */
    public void setTectonicPlate(String value) {
        this.tectonicPlate = value;
    }

    /**
     * Return approximate position (ITRF).
     */
    public ApproximatePosition getApproximatePosition() {
        return approximatePosition;
    }

    /**
     * Set approximate position (ITRF).
     */
    public void setApproximatePosition(ApproximatePosition value) {
        this.approximatePosition = value;
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
