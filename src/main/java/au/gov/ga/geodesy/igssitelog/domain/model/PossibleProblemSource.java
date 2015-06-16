package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/localInterferences/2004/baseLocalInterferencesLib.xsd:basePossiblePorblemSourcesType
 */
public class PossibleProblemSource {

    @Size(max = 200)
    protected String possibleProblemSource;

    @Valid
    protected EffectiveDates effectiveDates;

    @Size(max = 4000)
    protected String notes;

    /**
     * Return possible problem source.
     */
    public String getPossibleProblemSource() {
        return possibleProblemSource;
    }

    /**
     * Set possible problem source.
     */
    public void setPossibleProblemSource(String value) {
        this.possibleProblemSource = value;
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
