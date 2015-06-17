package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/contact/2564/baseContactLib.xsd:contactInformationType
 */
@Entity
@Table(name = "SITELOG_AGENCY")
public class Agency {

    @Id
    @GeneratedValue(generator = "surrogateKeyGenerator")
    @SequenceGenerator(name = "surrogateKeyGenerator", sequenceName = "SEQ_SITELOGAGENCY")
    private Integer id;

    @Size(max = 256)
    @Column(name = "NAME", length = 256)
    protected String name;

    @Size(max = 256)
    @Column(name = "PREFERRED_ABBREVIATION", length = 256)
    protected String preferredAbbreviation;

    @Size(max = 256)
    @Column(name = "MAILING_ADDRESS", length = 256)
    protected String mailingAddress;

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRIMARY_CONTACT_ID")
    protected Contact primaryContact;

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SECONDARY_CONTACT_ID")
    protected Contact secondaryContact;

    @Size(max = 4096)
    @Column(name = "NOTES", length = 4096)
    protected String notes;

    @SuppressWarnings("unused")
    private Integer getId() {
        return id;
    }

    @SuppressWarnings("unused")
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * Return agency name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set agency name.
     */
    public void setName(String agency) {
        this.name = agency;
    }

    /**
     * Return preferred agency abbreviation.
     */
    public String getPreferredAbbreviation() {
        return preferredAbbreviation;
    }

    /**
     * Set preferred agency abbreviation.
     */
    public void setPreferredAbbreviation(String preferredAbbreviation) {
        this.preferredAbbreviation = preferredAbbreviation;
    }

    /**
     * Return mailing address.
     */
    public String getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Set mailling address.
     */
    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    /**
     * Return primary contact details.
     */
    public Contact getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Set primary contact details.
     */
    public void setPrimaryContact(Contact primaryContact) {
        this.primaryContact = primaryContact;
    }

    /**
     * Return secondary contact details.
     */
    public Contact getSecondaryContact() {
        return secondaryContact;
    }

    /**
     * Set secondary contact details.
     */
    public void setSecondaryContact(Contact secondaryContact) {
        this.secondaryContact = secondaryContact;
    }

    /**
     * Set notes.
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Get notes.
     */
    public String getNotes() {
        return notes;
    }
}
