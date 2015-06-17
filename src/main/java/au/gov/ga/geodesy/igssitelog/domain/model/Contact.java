package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/contact/2564/baseContactLib.xsd:contactType
 */
@Entity
@Table(name = "SITELOG_CONTACT")
public class Contact {

    @Id
    @GeneratedValue(generator = "surrogateKeyGenerator")
    @SequenceGenerator(name = "surrogateKeyGenerator", sequenceName = "SEQ_SITELOGCONTACT")
    private Integer id;

    @Size(max = 256)
    @Column(name = "NAME", length = 256)
    protected String name;

    @Size(max = 256)
    @Column(name = "TELEPHONE_PRIMARY", length = 256)
    protected String telephonePrimary;

    @Size(max = 256)
    @Column(name = "TELEPHONE_SECONDARY", length = 256)
    protected String telephoneSecondary;

    @Size(max = 256)
    @Column(name = "FAX", length = 256)
    protected String fax;

    @Size(max = 256)
    @Column(name = "EMAIL", length = 256)
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
