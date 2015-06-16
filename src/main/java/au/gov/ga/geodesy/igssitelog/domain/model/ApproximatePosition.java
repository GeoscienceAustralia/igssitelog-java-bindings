package au.gov.ga.geodesy.igssitelog.domain.model;

import com.vividsolutions.jts.geom.Point;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/monumentInfo/2004/siteLocation.xsd:siteLocationType.approximatePositionITRF
 */
public class ApproximatePosition {

    private Point grs80;
    private String elevationGrs80;
    private Double itrfX;
    private Double itrfY;
    private Double itrfZ;

    /**
     * Return approximate (latidue,longitude) on the GRS80 ellipsoid.
     */
    public Point getGrs80() {
        return grs80;
    }

    /**
     * Set approximate (latitude,longitude) on the GRS80 ellipsoid.
     */
    public void setGrs80(Point p) {
        grs80 = p;
    }

    /**
     * Return approximate elevation in metres from the GRS80 ellipsoid.
     */
    public String getElevationGrs80() {
        return elevationGrs80;
    }

    /**
     * Set approximate elevation in meters from the GRS80 ellipsoid.
     */
    public void setElevationGrs80(String x) {
        elevationGrs80 = x;
    }

    /**
     * Return approximate ITRF x coordinate in meters.
     */
    public Double getItrfX() {
        return itrfX;
    }

    /**
     * Set approximate ITRF x coordinate in meters.
     */
    public void setItrfX(Double x) {
        itrfX = x;
    }

    /**
     * Return approximate ITRF y coordinate in meters.
     */
    public Double getItrfY() {
        return itrfY;
    }

    /**
     * Set approximate ITRF y coordinate in meters.
     */
    public void setItrfY(Double y) {
        itrfY = y;
    }

    /**
     * Return approximate ITRF z coordinate in meters.
     */
    public Double getItrfZ() {
        return itrfZ;
    }

    /**
     * Set approximate ITRF z coordinate in meters.
     */
    public void setItrfZ(Double z) {
        itrfZ = z;
    }
}
