package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import au.gov.ga.geodesy.igssitelog.domain.model.DifferentialFromMarker;

public class DifferentialFromMarkerAdapter extends MandatoryCompositeAdapter<DifferentialFromMarker> {

    @Override
    protected Class<DifferentialFromMarker> getDomainClass() {
        return DifferentialFromMarker.class;
    }
}
