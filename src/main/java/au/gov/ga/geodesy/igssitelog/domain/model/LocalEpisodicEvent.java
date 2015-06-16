package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/localInterferences/2004/localEvents.xsd:localEpisodicEventsType
 */
public class LocalEpisodicEvent {

    private Integer id;

    @Size(max = 200)
    protected String date;

    @Size(max = 200)
    protected String event;

    @SuppressWarnings("unused")
    private Integer getId() {
        return id;
    }

    @SuppressWarnings("unused")
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * Return date.
     */
    public String getDate() {
        return date;
    }

    /**
     * Set date.
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Return event.
     */
    public String getEvent() {
        return event;
    }

    /**
     * Set event.
     */
    public void setEvent(String value) {
        this.event = value;
    }
}
