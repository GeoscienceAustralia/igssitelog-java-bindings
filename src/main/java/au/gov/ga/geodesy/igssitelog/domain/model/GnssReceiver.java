package au.gov.ga.geodesy.igssitelog.domain.model;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/receiver.xsd:gnssReceiverType
 */
public class GnssReceiver {

    private Integer id;

    @Size(max = 200)
    protected String receiverType;

    @Size(max = 200)
    protected String satelliteSystem;

    @Size(max = 200)
    protected String serialNumber;

    @Size(max = 200)
    protected String firmwareVersion;

    @Size(max = 200)
    protected String elevationCutoffSetting;

    @Past
    protected Date dateInstalled;

    @Past
    protected Date dateRemoved;

    @Size(max = 200)
    protected String temperatureStabilization;

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
     * Return receiver type.
     */
    public String getReceiverType() {
        return receiverType;
    }

    /**
     * Set receiver type.
     */
    public void setReceiverType(String value) {
        this.receiverType = value;
    }

    /**
     * Return satellite system type.
     */
    public String getSatelliteSystem() {
        return satelliteSystem;
    }

    /**
     * Set satellite system type.
     */
    public void setSatelliteSystem(String value) {
        this.satelliteSystem = value;
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
     * Return firmware version.
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Set firmware version.
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * Return elevation cut-off setting.
     */
    public String getElevationCutoffSetting() {
        return elevationCutoffSetting;
    }

    /**
     * Set elevation cut-off setting.
     */
    public void setElevationCutoffSetting(String value) {
        this.elevationCutoffSetting = value;
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
     *
     */
    public Date getDateRemoved() {
        return dateRemoved;
    }

    /**
     * Set date removed.
     *
     */
    public void setDateRemoved(Date value) {
        this.dateRemoved = value;
    }

    /**
     * Return temperature stabilization.
     */
    public String getTemperatureStabilization() {
        return temperatureStabilization;
    }

    /**
     * Set temperature stabilization.
     */
    public void setTemperatureStabilization(String value) {
        this.temperatureStabilization = value;
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
