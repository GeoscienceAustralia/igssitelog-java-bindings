package au.gov.ga.geodesy.igssitelog.domain.model;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/monumentInfo/2004/formInformation.xsd:formInformationType
 */
public class FormInformation {

    @Size(min = 0, max = 200)
    protected String preparedBy;

    @Past
    protected Date datePrepared;

    @Size(min = 0, max = 200)
    protected String reportType;

    /**
     * Return prepered by.
     */
    public String getPreparedBy() {
        return preparedBy;
    }

    /**
     * Set prepared by.
     */
    public void setPreparedBy(String value) {
        this.preparedBy = value;
    }

    /**
     * Return date prepared.
     */
    public Date getDatePrepared() {
        return datePrepared;
    }

    /**
     * Set date prepared.
     */
    public void setDatePrepared(Date value) {
        this.datePrepared = value;
    }

    /**
     * Return report type.
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Set report type.
     */
    public void setReportType(String value) {
        this.reportType = value;
    }
}
