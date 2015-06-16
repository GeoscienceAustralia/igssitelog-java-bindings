package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/waterVaporSensor.xsd:waterVaporSensor
 */
public class WaterVaporSensor extends SensorEquipment {

    private Integer id;

    protected Double distanceToAntenna;

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
     * Return distance to antenna.
     */
    public Double getDistanceToAntenna() {
        return distanceToAntenna;
    }

    /**
     * Set distance to antenna.
     */
    public void setDistanceToAntenna(Double value) {
        this.distanceToAntenna = value;
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
