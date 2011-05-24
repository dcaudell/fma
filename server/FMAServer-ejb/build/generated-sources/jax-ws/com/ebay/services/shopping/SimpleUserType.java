
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * 
 * 				Type to contain the data for one eBay user. Depending on the context, the user
 * 				might be the seller or the buyer in a transaction, or the bidder or winning bidder
 * 				in a listing. An object of this type is returned by a number of calls, including
 * 				the GetUser call.
 * 			
 * 
 * <p>Java class for SimpleUserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleUserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedbackPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeedbackRatingStar" type="{urn:ebay:apis:eBLBaseComponents}FeedbackRatingStarCodeType" minOccurs="0"/>
 *         &lt;element name="FeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserAnonymized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RegistrationSite" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}UserStatusCodeType" minOccurs="0"/>
 *         &lt;element name="SellerBusinessType" type="{urn:ebay:apis:eBLBaseComponents}SellerBusinessCodeType" minOccurs="0"/>
 *         &lt;element name="StoreURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerItemsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="AboutMeURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="MyWorldURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="MyWorldSmallImage" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="MyWorldLargeImage" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ReviewsAndGuidesURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="FeedbackDetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PositiveFeedbackPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="SellerLevel" type="{urn:ebay:apis:eBLBaseComponents}SellerLevelCodeType" minOccurs="0"/>
 *         &lt;element name="TopRatedSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleUserType", propOrder = {
    "userID",
    "feedbackPrivate",
    "feedbackRatingStar",
    "feedbackScore",
    "userAnonymized",
    "newUser",
    "registrationDate",
    "registrationSite",
    "status",
    "sellerBusinessType",
    "storeURL",
    "storeName",
    "sellerItemsURL",
    "aboutMeURL",
    "myWorldURL",
    "myWorldSmallImage",
    "myWorldLargeImage",
    "reviewsAndGuidesURL",
    "feedbackDetailsURL",
    "positiveFeedbackPercent",
    "sellerLevel",
    "topRatedSeller",
    "any"
})
public class SimpleUserType {

    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "FeedbackPrivate")
    protected Boolean feedbackPrivate;
    @XmlElement(name = "FeedbackRatingStar")
    protected FeedbackRatingStarCodeType feedbackRatingStar;
    @XmlElement(name = "FeedbackScore")
    protected Integer feedbackScore;
    @XmlElement(name = "UserAnonymized")
    protected Boolean userAnonymized;
    @XmlElement(name = "NewUser")
    protected Boolean newUser;
    @XmlElement(name = "RegistrationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "RegistrationSite")
    protected SiteCodeType registrationSite;
    @XmlElement(name = "Status")
    protected UserStatusCodeType status;
    @XmlElement(name = "SellerBusinessType")
    protected SellerBusinessCodeType sellerBusinessType;
    @XmlElement(name = "StoreURL")
    @XmlSchemaType(name = "anyURI")
    protected String storeURL;
    @XmlElement(name = "StoreName")
    protected String storeName;
    @XmlElement(name = "SellerItemsURL")
    @XmlSchemaType(name = "anyURI")
    protected String sellerItemsURL;
    @XmlElement(name = "AboutMeURL")
    @XmlSchemaType(name = "anyURI")
    protected String aboutMeURL;
    @XmlElement(name = "MyWorldURL")
    @XmlSchemaType(name = "anyURI")
    protected String myWorldURL;
    @XmlElement(name = "MyWorldSmallImage")
    @XmlSchemaType(name = "anyURI")
    protected String myWorldSmallImage;
    @XmlElement(name = "MyWorldLargeImage")
    @XmlSchemaType(name = "anyURI")
    protected String myWorldLargeImage;
    @XmlElement(name = "ReviewsAndGuidesURL")
    @XmlSchemaType(name = "anyURI")
    protected String reviewsAndGuidesURL;
    @XmlElement(name = "FeedbackDetailsURL")
    @XmlSchemaType(name = "anyURI")
    protected String feedbackDetailsURL;
    @XmlElement(name = "PositiveFeedbackPercent")
    protected Float positiveFeedbackPercent;
    @XmlElement(name = "SellerLevel")
    protected SellerLevelCodeType sellerLevel;
    @XmlElement(name = "TopRatedSeller")
    protected Boolean topRatedSeller;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the feedbackPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeedbackPrivate() {
        return feedbackPrivate;
    }

    /**
     * Sets the value of the feedbackPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeedbackPrivate(Boolean value) {
        this.feedbackPrivate = value;
    }

    /**
     * Gets the value of the feedbackRatingStar property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackRatingStarCodeType }
     *     
     */
    public FeedbackRatingStarCodeType getFeedbackRatingStar() {
        return feedbackRatingStar;
    }

    /**
     * Sets the value of the feedbackRatingStar property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackRatingStarCodeType }
     *     
     */
    public void setFeedbackRatingStar(FeedbackRatingStarCodeType value) {
        this.feedbackRatingStar = value;
    }

    /**
     * Gets the value of the feedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeedbackScore() {
        return feedbackScore;
    }

    /**
     * Sets the value of the feedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeedbackScore(Integer value) {
        this.feedbackScore = value;
    }

    /**
     * Gets the value of the userAnonymized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserAnonymized() {
        return userAnonymized;
    }

    /**
     * Sets the value of the userAnonymized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserAnonymized(Boolean value) {
        this.userAnonymized = value;
    }

    /**
     * Gets the value of the newUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewUser() {
        return newUser;
    }

    /**
     * Sets the value of the newUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewUser(Boolean value) {
        this.newUser = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the registrationSite property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getRegistrationSite() {
        return registrationSite;
    }

    /**
     * Sets the value of the registrationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setRegistrationSite(SiteCodeType value) {
        this.registrationSite = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatusCodeType }
     *     
     */
    public UserStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatusCodeType }
     *     
     */
    public void setStatus(UserStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the sellerBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link SellerBusinessCodeType }
     *     
     */
    public SellerBusinessCodeType getSellerBusinessType() {
        return sellerBusinessType;
    }

    /**
     * Sets the value of the sellerBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerBusinessCodeType }
     *     
     */
    public void setSellerBusinessType(SellerBusinessCodeType value) {
        this.sellerBusinessType = value;
    }

    /**
     * Gets the value of the storeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreURL() {
        return storeURL;
    }

    /**
     * Sets the value of the storeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreURL(String value) {
        this.storeURL = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the sellerItemsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerItemsURL() {
        return sellerItemsURL;
    }

    /**
     * Sets the value of the sellerItemsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerItemsURL(String value) {
        this.sellerItemsURL = value;
    }

    /**
     * Gets the value of the aboutMeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboutMeURL() {
        return aboutMeURL;
    }

    /**
     * Sets the value of the aboutMeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboutMeURL(String value) {
        this.aboutMeURL = value;
    }

    /**
     * Gets the value of the myWorldURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyWorldURL() {
        return myWorldURL;
    }

    /**
     * Sets the value of the myWorldURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyWorldURL(String value) {
        this.myWorldURL = value;
    }

    /**
     * Gets the value of the myWorldSmallImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyWorldSmallImage() {
        return myWorldSmallImage;
    }

    /**
     * Sets the value of the myWorldSmallImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyWorldSmallImage(String value) {
        this.myWorldSmallImage = value;
    }

    /**
     * Gets the value of the myWorldLargeImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyWorldLargeImage() {
        return myWorldLargeImage;
    }

    /**
     * Sets the value of the myWorldLargeImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyWorldLargeImage(String value) {
        this.myWorldLargeImage = value;
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
     * Gets the value of the feedbackDetailsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackDetailsURL() {
        return feedbackDetailsURL;
    }

    /**
     * Sets the value of the feedbackDetailsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackDetailsURL(String value) {
        this.feedbackDetailsURL = value;
    }

    /**
     * Gets the value of the positiveFeedbackPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPositiveFeedbackPercent() {
        return positiveFeedbackPercent;
    }

    /**
     * Sets the value of the positiveFeedbackPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPositiveFeedbackPercent(Float value) {
        this.positiveFeedbackPercent = value;
    }

    /**
     * Gets the value of the sellerLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SellerLevelCodeType }
     *     
     */
    public SellerLevelCodeType getSellerLevel() {
        return sellerLevel;
    }

    /**
     * Sets the value of the sellerLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerLevelCodeType }
     *     
     */
    public void setSellerLevel(SellerLevelCodeType value) {
        this.sellerLevel = value;
    }

    /**
     * Gets the value of the topRatedSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopRatedSeller() {
        return topRatedSeller;
    }

    /**
     * Sets the value of the topRatedSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopRatedSeller(Boolean value) {
        this.topRatedSeller = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
