package au.gov.ga.geodesy.igssitelog.domain.model;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/localInterferences/2004/baseLocalInterferencesLib.xsd:basePossibleProblemSourcesType
 */
public class MultipathSource extends PossibleProblemSource {

    private Integer id;

    @SuppressWarnings("unused")
    private Integer getId() {
        return id;
    }

    @SuppressWarnings("unused")
    private void setId(Integer id) {
        this.id = id;
    }
}
