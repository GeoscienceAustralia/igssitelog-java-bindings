package au.gov.ga.geodesy.igssitelog.domain.model;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/contact/2004/baseContactLib.xsd:contactInformationType
 */
public class Agency {

    private Integer id;
    protected String name;
    protected String preferredAbbreviation;
    protected String mailingAddress;
    protected Contact primaryContact;
    protected Contact secondaryContact;
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
