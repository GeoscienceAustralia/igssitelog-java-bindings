package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

/**
 * Intermediary adaptee. Read about the technique <a href="http://www.eclipse.org/eclipselink/documentation/2.5/moxy/advanced_concepts006.htm">here</a>.
 */
public class AdaptedApproximatePosition {

    protected Double xCoordinateInMeters;
    protected Double yCoordinateInMeters;
    protected Double zCoordinateInMeters;
    protected Double latitude;
    protected Double longitude;
    protected String elevation;

    public Double getXCoordinateInMeters() {
        return xCoordinateInMeters;
    }

    public void setXCoordinateInMeters(Double value) {
        this.xCoordinateInMeters = value;
    }

    public Double getYCoordinateInMeters() {
        return yCoordinateInMeters;
    }

    public void setYCoordinateInMeters(Double value) {
        this.yCoordinateInMeters = value;
    }

    public Double getZCoordinateInMeters() {
        return zCoordinateInMeters;
    }

    public void setZCoordinateInMeters(Double value) {
        this.zCoordinateInMeters = value;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double value) {
        this.latitude = value;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double value) {
        this.longitude = value;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String value) {
        this.elevation = value;
    }
}
