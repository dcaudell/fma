
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Find reviews and guides response type.
 * 			
 * 
 * <p>Java class for FindReviewsAndGuidesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindReviewsAndGuidesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BuyingGuideCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReviewerRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalHelpfulnessVotes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" minOccurs="0"/>
 *         &lt;element name="ReviewsAndGuidesURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BuyingGuideDetails" type="{urn:ebay:apis:eBLBaseComponents}BuyingGuideDetailsType" minOccurs="0"/>
 *         &lt;element name="ReviewDetails" type="{urn:ebay:apis:eBLBaseComponents}ReviewDetailsType" minOccurs="0"/>
 *         &lt;element name="PositiveHelpfulnessVotes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindReviewsAndGuidesResponseType", propOrder = {
    "reviewCount",
    "buyingGuideCount",
    "reviewerRank",
    "totalHelpfulnessVotes",
    "productID",
    "reviewsAndGuidesURL",
    "pageNumber",
    "totalPages",
    "buyingGuideDetails",
    "reviewDetails",
    "positiveHelpfulnessVotes"
})
public class FindReviewsAndGuidesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ReviewCount")
    protected Integer reviewCount;
    @XmlElement(name = "BuyingGuideCount")
    protected Integer buyingGuideCount;
    @XmlElement(name = "ReviewerRank")
    protected Integer reviewerRank;
    @XmlElement(name = "TotalHelpfulnessVotes")
    protected Integer totalHelpfulnessVotes;
    @XmlElement(name = "ProductID")
    protected ProductIDType productID;
    @XmlElement(name = "ReviewsAndGuidesURL")
    @XmlSchemaType(name = "anyURI")
    protected String reviewsAndGuidesURL;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "TotalPages")
    protected Integer totalPages;
    @XmlElement(name = "BuyingGuideDetails")
    protected BuyingGuideDetailsType buyingGuideDetails;
    @XmlElement(name = "ReviewDetails")
    protected ReviewDetailsType reviewDetails;
    @XmlElement(name = "PositiveHelpfulnessVotes")
    protected Integer positiveHelpfulnessVotes;

    /**
     * Gets the value of the reviewCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReviewCount() {
        return reviewCount;
    }

    /**
     * Sets the value of the reviewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReviewCount(Integer value) {
        this.reviewCount = value;
    }

    /**
     * Gets the value of the buyingGuideCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuyingGuideCount() {
        return buyingGuideCount;
    }

    /**
     * Sets the value of the buyingGuideCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuyingGuideCount(Integer value) {
        this.buyingGuideCount = value;
    }

    /**
     * Gets the value of the reviewerRank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReviewerRank() {
        return reviewerRank;
    }

    /**
     * Sets the value of the reviewerRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReviewerRank(Integer value) {
        this.reviewerRank = value;
    }

    /**
     * Gets the value of the totalHelpfulnessVotes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalHelpfulnessVotes() {
        return totalHelpfulnessVotes;
    }

    /**
     * Sets the value of the totalHelpfulnessVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalHelpfulnessVotes(Integer value) {
        this.totalHelpfulnessVotes = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIDType }
     *     
     */
    public ProductIDType getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIDType }
     *     
     */
    public void setProductID(ProductIDType value) {
        this.productID = value;
    }

    /**
     * Gets the value of the reviewsAndGuidesURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewsAndGuidesURL() {
        return reviewsAndGuidesURL;
    }

    /**
     * Sets the value of the reviewsAndGuidesURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewsAndGuidesURL(String value) {
        this.reviewsAndGuidesURL = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the buyingGuideDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BuyingGuideDetailsType }
     *     
     */
    public BuyingGuideDetailsType getBuyingGuideDetails() {
        return buyingGuideDetails;
    }

    /**
     * Sets the value of the buyingGuideDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyingGuideDetailsType }
     *     
     */
    public void setBuyingGuideDetails(BuyingGuideDetailsType value) {
        this.buyingGuideDetails = value;
    }

    /**
     * Gets the value of the reviewDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewDetailsType }
     *     
     */
    public ReviewDetailsType getReviewDetails() {
        return reviewDetails;
    }

    /**
     * Sets the value of the reviewDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewDetailsType }
     *     
     */
    public void setReviewDetails(ReviewDetailsType value) {
        this.reviewDetails = value;
    }

    /**
     * Gets the value of the positiveHelpfulnessVotes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositiveHelpfulnessVotes() {
        return positiveHelpfulnessVotes;
    }

    /**
     * Sets the value of the positiveHelpfulnessVotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositiveHelpfulnessVotes(Integer value) {
        this.positiveHelpfulnessVotes = value;
    }

}
