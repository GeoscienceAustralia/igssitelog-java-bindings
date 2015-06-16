package au.gov.ga.geodesy.igssitelog.domain.model;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/antenna.xsd:gnssAntennaType
 */
public class GnssAntenna {

    private Integer id;

    @Size(max = 200)
    protected String antennaType;

    @Size(max = 200)
    protected String serialNumber;

    @Size(max = 200)
    protected String antennaReferencePoint;

    protected Double markerArpUpEcc;

    protected Double markerArpNorthEcc;

    protected Double markerArpEastEcc;

    @Size(max = 200)
    protected String alignmentFromTrueNorth;

    @Size(max = 200)
    protected String antennaRadomeType;

    @Size(max = 200)
    protected String radomeSerialNumber;

    @Size(max = 200)
    protected String antennaCableType;

    @Size(max = 200)
    protected String antennaCableLength;

    @Past
    protected Date dateInstalled;

    @Past
    protected Date dateRemoved;

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
     * Return antenna type.
     */
    public String getAntennaType() {
        return antennaType;
    }

    /**
     * Set antenna type.
     */
    public void setAntennaType(String value) {
        this.antennaType = value;
    }

    /**
     * Return serial number.
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Set serial number.
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Return antenna reference point.
     */
    public String getAntennaReferencePoint() {
        return antennaReferencePoint;
    }

    /**
     * Set antenna reference point.
     */
    public void setAntennaReferencePoint(String value) {
        this.antennaReferencePoint = value;
    }

    /**
     * Return marker ARP up ecc.
     */
    public Double getMarkerArpUpEcc() {
        return markerArpUpEcc;
    }

    /**
     * Set marker ARP up ecc.
     */
    public void setMarkerArpUpEcc(Double value) {
        this.markerArpUpEcc = value;
    }

    /**
     * Return marker ARP north ecc.
     */
    public Double getMarkerArpNorthEcc() {
        return markerArpNorthEcc;
    }

    /**
     * Set marker ARP north acc.
     */
    public void setMarkerArpNorthEcc(Double value) {
        this.markerArpNorthEcc = value;
    }

    /**
     * Return marker ARP east acc.
     */
    public Double getMarkerArpEastEcc() {
        return markerArpEastEcc;
    }

    /**
     * Set marker ARP east ecc.
     */
    public void setMarkerArpEastEcc(Double value) {
        this.markerArpEastEcc = value;
    }

    /**
     * Return alignment from true north.
     */
    public String getAlignmentFromTrueNorth() {
        return alignmentFromTrueNorth;
    }

    /**
     * Set alignment from true north.
     */
    public void setAlignmentFromTrueNorth(String value) {
        this.alignmentFromTrueNorth = value;
    }

    /**
     * Return IGS radome model code.
     */
    public String getAntennaRadomeType() {
        return antennaRadomeType;
    }

    /**
     * Set IGS radome model code.
     */
    public void setAntennaRadomeType(String value) {
        this.antennaRadomeType = value;
    }

    /**
     * Return radome serial number.
     */
    public String getRadomeSerialNumber() {
        return radomeSerialNumber;
    }

    /**
     * Set radome serial number.
     */
    public void setRadomeSerialNumber(String value) {
        this.radomeSerialNumber = value;
    }

    /**
     * Return antenna cable type.
     */
    public String getAntennaCableType() {
        return antennaCableType;
    }

    /**
     * Set antenna cable type.
     */
    public void setAntennaCableType(String value) {
        this.antennaCableType = value;
    }

    /**
     * Return antenna cable length.
     */
    public String getAntennaCableLength() {
        return antennaCableLength;
    }

    /**
     * Set antenna cable length.
     */
    public void setAntennaCableLength(String value) {
        this.antennaCableLength = value;
    }

    /**
     * Return date installed.
     */
    public Date getDateInstalled() {
        return dateInstalled;
    }

    /**
     * Set date installed.
     */
    public void setDateInstalled(Date value) {
        this.dateInstalled = value;
    }

    /**
     * Return date removed.
     */
    public Date getDateRemoved() {
        return dateRemoved;
    }

    /**
     * Set date removed.
     */
    public void setDateRemoved(Date value) {
        this.dateRemoved = value;
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
