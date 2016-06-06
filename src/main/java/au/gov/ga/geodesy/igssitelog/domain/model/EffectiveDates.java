package au.gov.ga.geodesy.igssitelog.domain.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/baseEquipmentLib.xsd:baseSensorEquipmentType.effectiveDates Note: this is an attempt to
 * interpret date values as java dates, rather than as strings as defined in the SOPAC schema (feel free to revert to java strings, if this starts to cause
 * trouble).
 */
@Embeddable
public class EffectiveDates {

    @Column(name = "EFFECTIVE_FROM")
    private Instant from;

    @Column(name = "EFFECTIVE_TO")
    private Instant to;

    public EffectiveDates() {
    }

    public EffectiveDates(Instant from) {
        this(from, null);
    }

    public EffectiveDates(Instant from, Instant to) {
        setFrom(from);
        setTo(to);
    }

    public Instant getFrom() {
        return from;
    }

    public void setFrom(Instant from) {
        this.from = from;
    }

    public Instant getTo() {
        return to;
    }

    public void setTo(Instant to) {
        this.to = to;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EffectiveDates that = (EffectiveDates) o;

        return new EqualsBuilder()
                .append(getFrom(), that.getFrom())
                .append(getTo(), that.getTo())
                .isEquals();
    }
}