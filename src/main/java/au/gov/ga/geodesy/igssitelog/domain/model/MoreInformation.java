package au.gov.ga.geodesy.igssitelog.domain.model;

import javax.validation.constraints.Size;

/**
 * http://sopac.ucsd.edu/ns/geodesy/doc/igsSiteLog/monumentInfo/2004/moreInformation.xsd:moreInformationType
 */
public class MoreInformation {

    @Size(max = 200)
    protected String primaryDataCenter;

    @Size(max = 200)
    protected String secondaryDataCenter;

    @Size(max = 200)
    protected String urlForMoreInformation;

    @Size(max = 200)
    protected String hardCopyOnFile;

    @Size(max = 200)
    protected String siteMap;

    @Size(max = 200)
    protected String siteDiagram;

    @Size(max = 200)
    protected String horizonMask;

    @Size(max = 200)
    protected String monumentDescription;

    @Size(max = 200)
    protected String sitePictures;

    @Size(max = 4000)
    protected String notes;

    @Size(max = 200)
    protected String antennaGraphicsWithDimensions;

    @Size(max = 200)
    protected String insertTextGraphicFromAntenna;

    /**
     * Return primary data center.
     */
    public String getPrimaryDataCenter() {
        return primaryDataCenter;
    }

    /**
     * Set primary data center.
     */
    public void setPrimaryDataCenter(String value) {
        this.primaryDataCenter = value;
    }

    /**
     * Return secondary data center.
     */
    public String getSecondaryDataCenter() {
        return secondaryDataCenter;
    }

    /**
     * Set secondary data center.
     */
    public void setSecondaryDataCenter(String value) {
        this.secondaryDataCenter = value;
    }

    /**
     * Return URL for more information.
     */
    public String getUrlForMoreInformation() {
        return urlForMoreInformation;
    }

    /**
     * Set URL for more information.
     */
    public void setUrlForMoreInformation(String value) {
        this.urlForMoreInformation = value;
    }

    /**
     * Return hard copy on file.
     */
    public String getHardCopyOnFile() {
        return hardCopyOnFile;
    }

    /**
     * Set hard copy on file.
     */
    public void setHardCopyOnFile(String value) {
        this.hardCopyOnFile = value;
    }

    /**
     * Return site map.
     */
    public String getSiteMap() {
        return siteMap;
    }

    /**
     * Set site map.
     */
    public void setSiteMap(String value) {
        this.siteMap = value;
    }

    /**
     * Return site diagram.
     */
    public String getSiteDiagram() {
        return siteDiagram;
    }

    /**
     * Set site diagram.
     */
    public void setSiteDiagram(String value) {
        this.siteDiagram = value;
    }

    /**
     * Return horizon mask.
     */
    public String getHorizonMask() {
        return horizonMask;
    }

    /**
     * Set horizon mask.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setHorizonMask(String value) {
        this.horizonMask = value;
    }

    /**
     * Return monument description.
     */
    public String getMonumentDescription() {
        return monumentDescription;
    }

    /**
     * Set monument description.
     */
    public void setMonumentDescription(String value) {
        this.monumentDescription = value;
    }

    /**
     * Return site pictures.
     */
    public String getSitePictures() {
        return sitePictures;
    }

    /**
     * Set site pictures.
     */
    public void setSitePictures(String value) {
        this.sitePictures = value;
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

    /**
     * Return antenna graphics with dimenstions.
     */
    public String getAntennaGraphicsWithDimensions() {
        return antennaGraphicsWithDimensions;
    }

    /**
     * Set antenna graphics with dimenstions.
     */
    public void setAntennaGraphicsWithDimensions(String value) {
        this.antennaGraphicsWithDimensions = value;
    }

    /**
     * Return insert text graphics from antenna.
     */
    public String getInsertTextGraphicFromAntenna() {
        return insertTextGraphicFromAntenna;
    }

    /**
     * Set insert text graphics from antenna.
     */
    public void setInsertTextGraphicFromAntenna(String value) {
        this.insertTextGraphicFromAntenna = value;
    }
}
