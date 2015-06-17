package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2564/pressureSensor.xsd:pressureSensorType
 */
@Entity
@Table(name = "SITELOG_PRESSURESENSOR")
public class PressureSensor extends SensorEquipment {

    @Id
    @GeneratedValue(generator = "surrogateKeyGenerator")
    @SequenceGenerator(name = "surrogateKeyGenerator", sequenceName = "SEQ_SITELOGPRESSURESENSOR")
    private Integer id;

    @Size(max = 256)
    @Column(name = "DATA_SAMPLING_INTERVAL", length = 256)
    protected String dataSamplingInterval;

    @Size(max = 256)
    @Column(name = "ACCURACY_HPA", length = 256)
    protected String accuracyHPa;

    @Size(max = 4096)
    @Column(name = "NOTES", length = 4096)
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
