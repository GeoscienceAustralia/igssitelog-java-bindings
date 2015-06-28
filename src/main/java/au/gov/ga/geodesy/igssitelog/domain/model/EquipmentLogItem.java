package au.gov.ga.geodesy.igssitelog.domain.model;

public interface EquipmentLogItem {
    String getType();
    String getSerialNumber();
    EffectiveDates getEffectiveDates();
}

