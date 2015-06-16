package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/contact/2004/baseContactLib.xsd:contactType
 */
public class Contact {

    private Integer id;

    @Size(max = 200)
    protected String name;

    @Size(max = 200)
    protected String telephonePrimary;

    @Size(max = 200)
    protected String telephoneSecondary;

    @Size(max = 200)
    protected String fax;

    @Size(max = 200)
    protected String email;

    @SuppressWarnings("unused")
    private Integer getId() {
        return id;
    }

    @SuppressWarnings("unused")
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * Return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Return primary telephone number.
     */
    public String getTelephonePrimary() {
        return telephonePrimary;
    }

    /**
     * Set primary telephone number.
     */
    public void setTelephonePrimary(String value) {
        this.telephonePrimary = value;
    }

    /**
     * Return secondary telephone number.
     */
    public String getTelephoneSecondary() {
        return telephoneSecondary;
    }

    /**
     * Set secondary telephone number.
     */
    public void setTelephoneSecondary(String value) {
        this.telephoneSecondary = value;
    }

    /**
     * Return fax number.
     */
    public String getFax() {
        return fax;
    }

    /**
     * Set fax number.
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Return email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email address.
     */
    public void setEmail(String value) {
        this.email = value;
    }
}
