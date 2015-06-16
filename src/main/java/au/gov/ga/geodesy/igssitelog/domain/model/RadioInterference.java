package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/localInterferences/2004/radioInterferences.xsd:radioInterferencesType
 */
public class RadioInterference extends PossibleProblemSource {

    private Integer id;

    @Size(max = 200)
    protected String observedDegradation;

    @SuppressWarnings("unused")
    private Integer getId() {
        return id;
    }

    @SuppressWarnings("unused")
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * Return observed degradation.
     */
    public String getObservedDegradation() {
        return observedDegradation;
    }

    /**
     * Set observed degradation.
     */
    public void setObservedDegradation(String value) {
        this.observedDegradation = value;
    }
}
