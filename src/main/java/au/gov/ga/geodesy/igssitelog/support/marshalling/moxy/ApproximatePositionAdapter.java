package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.PrecisionModel;

import au.gov.ga.geodesy.igssitelog.domain.model.ApproximatePosition;

/**
 * Intermediary adapter. Read about the technique <a href="http://www.eclipse.org/eclipselink/documentation/2.5/moxy/advanced_concepts006.htm">here</a>.
 */
public class ApproximatePositionAdapter extends XmlAdapter<AdaptedApproximatePosition, ApproximatePosition> {

    @Override
    public AdaptedApproximatePosition marshal(ApproximatePosition position) throws Exception {
        if (position == null) {
            return null;
        }
        AdaptedApproximatePosition adaptedPosition = new AdaptedApproximatePosition();

        adaptedPosition.setXCoordinateInMeters(position.getItrfX());
        adaptedPosition.setYCoordinateInMeters(position.getItrfY());
        adaptedPosition.setZCoordinateInMeters(position.getItrfZ());

        if (position.getGrs80() != null) {
            Coordinate c = position.getGrs80().getCoordinate();
            adaptedPosition.setLatitude(c.x);
            adaptedPosition.setLongitude(c.y);
        }
        adaptedPosition.setElevation(position.getElevationGrs80());
        return adaptedPosition;
    }

    @Override
    public ApproximatePosition unmarshal(AdaptedApproximatePosition adaptedPosition) throws Exception {
        try {
            if (adaptedPosition == null) {
                return null;
            }
            ApproximatePosition position = new ApproximatePosition();
            if (adaptedPosition.getLatitude() != null && adaptedPosition.getLongitude() != null) {
                Coordinate c = new Coordinate(adaptedPosition.getLatitude(), adaptedPosition.getLongitude());
                Point grs80 = new GeometryFactory(new PrecisionModel(), 4019).createPoint(c);
                position.setGrs80(grs80);
            }
            position.setItrfX(adaptedPosition.getXCoordinateInMeters());
            position.setItrfY(adaptedPosition.getYCoordinateInMeters());
            position.setItrfZ(adaptedPosition.getZCoordinateInMeters());
            position.setElevationGrs80(adaptedPosition.getElevation());
            return position;
        } catch (Exception e) {
            // TODO
            System.out.println("ADAPTER FAILED");
            e.printStackTrace();
            throw e;
        }
    }
}
