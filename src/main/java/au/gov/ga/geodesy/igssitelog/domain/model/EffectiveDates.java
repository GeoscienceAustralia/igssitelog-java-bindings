package au.gov.ga.geodesy.igssitelog.domain.model;

import java.util.Date;

import org.apache.commons.lang.ObjectUtils;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/equipment/2004/baseEquipmentLib.xsd:baseSensorEquipmentType.effectiveDates Note: this is an attempt to
 * interpret date values as java dates, rather than as strings as defined in the SOPAC schema (feel free to revert to java strings, if this starts to cause
 * trouble).
 */
public class EffectiveDates {
    private Date from;
    private Date to;

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public boolean equals(Object x) {
        if (x instanceof EffectiveDates && x != null) {
            EffectiveDates dates = (EffectiveDates) x;
            return ObjectUtils.equals(from, dates.getFrom()) && ObjectUtils.equals(to, dates.getTo());
        }
        return false;
    }
}
