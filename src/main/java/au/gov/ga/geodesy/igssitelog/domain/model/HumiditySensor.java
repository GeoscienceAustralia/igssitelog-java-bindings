package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/humiditySensor.xsd:humiditySensorType
 */
public class HumiditySensor extends SensorEquipment {

    private Integer id;

    @Size(max = 200)
    protected String dataSamplingInterval;

    @Size(max = 200)
    protected String accuracyPercentRelativeHumidity;

    @Size(max = 200)
    protected String aspiration;

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
     * Return accuracy percent relative humidity.
     */
    public String getAccuracyPercentRelativeHumidity() {
        return accuracyPercentRelativeHumidity;
    }

    /**
     * Set accuracy percent relative humidity.
     */
    public void setAccuracyPercentRelativeHumidity(String value) {
        this.accuracyPercentRelativeHumidity = value;
    }

    /**
     * Return aspiration.
     */
    public String getAspiration() {
        return aspiration;
    }

    /**
     * Set aspiration.
     */
    public void setAspiration(String value) {
        this.aspiration = value;
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
