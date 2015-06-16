package au.gov.ga.geodesy.igssitelog.domain.model;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/surveyedLocalTies.xsd:surveyedLocalTiesType.
 * differentialComponentsGNSSMarkerToTiedMonumebtsITRS
 */
public class DifferentialFromMarker {

    protected Double dx;
    protected Double dy;
    protected Double dz;

    /**
     * Return differential component in x-direction.
     */
    public Double getDx() {
        return dx;
    }

    /**
     * Set differential component in x-direction.
     */
    public void setDx(Double value) {
        this.dx = value;
    }

    /**
     * Return differential component in y-direction.
     */
    public Double getDy() {
        return dy;
    }

    /**
     * Set differential component in y-direction.
     *
     */
    public void setDy(Double value) {
        this.dy = value;
    }

    /**
     * Return differential component in z-direction.
     */
    public Double getDz() {
        return dz;
    }

    /**
     * Set differential component in z-direction.
     *
     */
    public void setDz(Double value) {
        this.dz = value;
    }
}
