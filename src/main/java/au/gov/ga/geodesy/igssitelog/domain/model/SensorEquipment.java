package au.gov.ga.geodesy.igssitelog.domain.model;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/baseEquipmentLib.xsd:baseSensorEquipmentType"
 */
public class SensorEquipment {

    @Size(max = 200)
    protected String type;

    @Size(max = 200)
    protected String manufacturer;

    @Size(max = 200)
    protected String serialNumber;

    @Size(max = 200)
    protected String heightDiffToAntenna;

    @Past
    protected Date calibrationDate;

    @Valid
    protected EffectiveDates effectiveDates;

    /**
     * Return sensor equipment type.
     */
    public String getType() {
        return type;
    }

    /**
     * Set sensor equipment type.
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Return manufacturer.
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Set manufacturer.
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
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
     * Return height difference to antenna.
     */
    public String getHeightDiffToAntenna() {
        return heightDiffToAntenna;
    }

    /**
     * Seta height difference to antenna.
     */
    public void setHeightDiffToAntenna(String value) {
        this.heightDiffToAntenna = value;
    }

    /**
     * Return calibration date.
     */
    public Date getCalibrationDate() {
        return calibrationDate;
    }

    /**
     * Set calibration date.
     */
    public void setCalibrationDate(Date value) {
        this.calibrationDate = value;
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
