package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/pressureSensor.xsd:pressureSensorType
 */
public class PressureSensor extends SensorEquipment {

    private Integer id;

    @Size(max = 200)
    protected String dataSamplingInterval;

    @Size(max = 200)
    protected String accuracyHPa;

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
     * Return data sampling interval.
     */
    public String getDataSamplingInterval() {
        return dataSamplingInterval;
    }

    /**
     * Set data sampling interval.
     */
    public void setDataSamplingInterval(String value) {
        this.dataSamplingInterval = value;
    }

    /**
     * Return accuracy hPa.
     */
    public String getAccuracyHPa() {
        return accuracyHPa;
    }

    /**
     * Set accuracy hPa.
     */
    public void setAccuracyHPa(String value) {
        this.accuracyHPa = value;
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
