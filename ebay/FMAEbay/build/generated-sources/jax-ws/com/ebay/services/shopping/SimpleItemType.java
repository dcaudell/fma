
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * 
 * 				Contains information for an item.
 * 			
 * 
 * <p>Java class for SimpleItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BestOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyItNowPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyItNowAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConvertedBuyItNowPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ViewItemURLForNaturalSearch" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethods" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GalleryURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Seller" type="{urn:ebay:apis:eBLBaseComponents}SimpleUserType" minOccurs="0"/>
 *         &lt;element name="BidCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConvertedCurrentPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="HighBidder" type="{urn:ebay:apis:eBLBaseComponents}SimpleUserType" minOccurs="0"/>
 *         &lt;element name="ListingStatus" type="{urn:ebay:apis:eBLBaseComponents}ListingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReserveMet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipToLocations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Site" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="TimeLeft" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCostSummary" type="{urn:ebay:apis:eBLBaseComponents}ShippingCostSummaryType" minOccurs="0"/>
 *         &lt;element name="ItemSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="HitCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Subtitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryIDPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryCategoryIDPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charity" type="{urn:ebay:apis:eBLBaseComponents}CharityType" minOccurs="0"/>
 *         &lt;element name="GermanMotorsSearchable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetItFast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Gift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PictureExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecentListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Storefront" type="{urn:ebay:apis:eBLBaseComponents}StorefrontType" minOccurs="0"/>
 *         &lt;element name="DistanceFromBuyer" type="{urn:ebay:apis:eBLBaseComponents}DistanceType" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="WatchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HalfItemCondition" type="{urn:ebay:apis:eBLBaseComponents}HalfItemConditionCodeType" minOccurs="0"/>
 *         &lt;element name="SellerComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnPolicy" type="{urn:ebay:apis:eBLBaseComponents}ReturnPolicyType" minOccurs="0"/>
 *         &lt;element name="MinimumToBid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" minOccurs="0"/>
 *         &lt;element name="AutoPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessSellerDetails" type="{urn:ebay:apis:eBLBaseComponents}BusinessSellerDetailsType" minOccurs="0"/>
 *         &lt;element name="PaymentAllowedSite" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntegratedMerchantCreditCardEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Variations" type="{urn:ebay:apis:eBLBaseComponents}VariationsType" minOccurs="0"/>
 *         &lt;element name="HandlingTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LotSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConditionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConditionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityAvailableHint" type="{urn:ebay:apis:eBLBaseComponents}QuantityAvailableHintCodeType" minOccurs="0"/>
 *         &lt;element name="QuantityThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "SimpleItemType", propOrder = {
    "bestOfferEnabled",
    "buyItNowPrice",
    "description",
    "itemID",
    "buyItNowAvailable",
    "convertedBuyItNowPrice",
    "endTime",
    "startTime",
    "viewItemURLForNaturalSearch",
    "listingType",
    "location",
    "paymentMethods",
    "galleryURL",
    "pictureURL",
    "postalCode",
    "primaryCategoryID",
    "primaryCategoryName",
    "quantity",
    "seller",
    "bidCount",
    "convertedCurrentPrice",
    "currentPrice",
    "highBidder",
    "listingStatus",
    "quantitySold",
    "reserveMet",
    "shipToLocations",
    "site",
    "timeLeft",
    "title",
    "shippingCostSummary",
    "itemSpecifics",
    "hitCount",
    "subtitle",
    "primaryCategoryIDPath",
    "secondaryCategoryID",
    "secondaryCategoryName",
    "secondaryCategoryIDPath",
    "charity",
    "germanMotorsSearchable",
    "getItFast",
    "gift",
    "pictureExists",
    "recentListing",
    "storefront",
    "distanceFromBuyer",
    "country",
    "watchCount",
    "halfItemCondition",
    "sellerComments",
    "returnPolicy",
    "minimumToBid",
    "productID",
    "autoPay",
    "businessSellerDetails",
    "paymentAllowedSite",
    "integratedMerchantCreditCardEnabled",
    "variations",
    "handlingTime",
    "lotSize",
    "conditionID",
    "conditionDisplayName",
    "quantityAvailableHint",
    "quantityThreshold",
    "any"
})
public class SimpleItemType {

    @XmlElement(name = "BestOfferEnabled")
    protected Boolean bestOfferEnabled;
    @XmlElement(name = "BuyItNowPrice")
    protected AmountType buyItNowPrice;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "BuyItNowAvailable")
    protected Boolean buyItNowAvailable;
    @XmlElement(name = "ConvertedBuyItNowPrice")
    protected AmountType convertedBuyItNowPrice;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "ViewItemURLForNaturalSearch")
    @XmlSchemaType(name = "anyURI")
    protected String viewItemURLForNaturalSearch;
    @XmlElement(name = "ListingType")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "PaymentMethods")
    protected List<BuyerPaymentMethodCodeType> paymentMethods;
    @XmlElement(name = "GalleryURL")
    @XmlSchemaType(name = "anyURI")
    protected String galleryURL;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> pictureURL;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PrimaryCategoryID")
    protected String primaryCategoryID;
    @XmlElement(name = "PrimaryCategoryName")
    protected String primaryCategoryName;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "Seller")
    protected SimpleUserType seller;
    @XmlElement(name = "BidCount")
    protected Integer bidCount;
    @XmlElement(name = "ConvertedCurrentPrice")
    protected AmountType convertedCurrentPrice;
    @XmlElement(name = "CurrentPrice")
    protected AmountType currentPrice;
    @XmlElement(name = "HighBidder")
    protected SimpleUserType highBidder;
    @XmlElement(name = "ListingStatus")
    protected ListingStatusCodeType listingStatus;
    @XmlElement(name = "QuantitySold")
    protected Integer quantitySold;
    @XmlElement(name = "ReserveMet")
    protected Boolean reserveMet;
    @XmlElement(name = "ShipToLocations")
    protected List<String> shipToLocations;
    @XmlElement(name = "Site")
    protected SiteCodeType site;
    @XmlElement(name = "TimeLeft")
    protected Duration timeLeft;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "ShippingCostSummary")
    protected ShippingCostSummaryType shippingCostSummary;
    @XmlElement(name = "ItemSpecifics")
    protected NameValueListArrayType itemSpecifics;
    @XmlElement(name = "HitCount")
    protected Long hitCount;
    @XmlElement(name = "Subtitle")
    protected String subtitle;
    @XmlElement(name = "PrimaryCategoryIDPath")
    protected String primaryCategoryIDPath;
    @XmlElement(name = "SecondaryCategoryID")
    protected String secondaryCategoryID;
    @XmlElement(name = "SecondaryCategoryName")
    protected String secondaryCategoryName;
    @XmlElement(name = "SecondaryCategoryIDPath")
    protected String secondaryCategoryIDPath;
    @XmlElement(name = "Charity")
    protected CharityType charity;
    @XmlElement(name = "GermanMotorsSearchable")
    protected Boolean germanMotorsSearchable;
    @XmlElement(name = "GetItFast")
    protected Boolean getItFast;
    @XmlElement(name = "Gift")
    protected Boolean gift;
    @XmlElement(name = "PictureExists")
    protected Boolean pictureExists;
    @XmlElement(name = "RecentListing")
    protected Boolean recentListing;
    @XmlElement(name = "Storefront")
    protected StorefrontType storefront;
    @XmlElement(name = "DistanceFromBuyer")
    protected DistanceType distanceFromBuyer;
    @XmlElement(name = "Country")
    protected CountryCodeType country;
    @XmlElement(name = "WatchCount")
    protected Integer watchCount;
    @XmlElement(name = "HalfItemCondition")
    protected HalfItemConditionCodeType halfItemCondition;
    @XmlElement(name = "SellerComments")
    protected String sellerComments;
    @XmlElement(name = "ReturnPolicy")
    protected ReturnPolicyType returnPolicy;
    @XmlElement(name = "MinimumToBid")
    protected AmountType minimumToBid;
    @XmlElement(name = "ProductID")
    protected ProductIDType productID;
    @XmlElement(name = "AutoPay")
    protected Boolean autoPay;
    @XmlElement(name = "BusinessSellerDetails")
    protected BusinessSellerDetailsType businessSellerDetails;
    @XmlElement(name = "PaymentAllowedSite")
    protected List<SiteCodeType> paymentAllowedSite;
    @XmlElement(name = "IntegratedMerchantCreditCardEnabled")
    protected Boolean integratedMerchantCreditCardEnabled;
    @XmlElement(name = "Variations")
    protected VariationsType variations;
    @XmlElement(name = "HandlingTime")
    protected Integer handlingTime;
    @XmlElement(name = "LotSize")
    protected Integer lotSize;
    @XmlElement(name = "ConditionID")
    protected Integer conditionID;
    @XmlElement(name = "ConditionDisplayName")
    protected String conditionDisplayName;
    @XmlElement(name = "QuantityAvailableHint")
    protected QuantityAvailableHintCodeType quantityAvailableHint;
    @XmlElement(name = "QuantityThreshold")
    protected Integer quantityThreshold;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the bestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferEnabled() {
        return bestOfferEnabled;
    }

    /**
     * Sets the value of the bestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferEnabled(Boolean value) {
        this.bestOfferEnabled = value;
    }

    /**
     * Gets the value of the buyItNowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBuyItNowPrice() {
        return buyItNowPrice;
    }

    /**
     * Sets the value of the buyItNowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBuyItNowPrice(AmountType value) {
        this.buyItNowPrice = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the buyItNowAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyItNowAvailable() {
        return buyItNowAvailable;
    }

    /**
     * Sets the value of the buyItNowAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyItNowAvailable(Boolean value) {
        this.buyItNowAvailable = value;
    }

    /**
     * Gets the value of the convertedBuyItNowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedBuyItNowPrice() {
        return convertedBuyItNowPrice;
    }

    /**
     * Sets the value of the convertedBuyItNowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedBuyItNowPrice(AmountType value) {
        this.convertedBuyItNowPrice = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the viewItemURLForNaturalSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewItemURLForNaturalSearch() {
        return viewItemURLForNaturalSearch;
    }

    /**
     * Sets the value of the viewItemURLForNaturalSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewItemURLForNaturalSearch(String value) {
        this.viewItemURLForNaturalSearch = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public ListingTypeCodeType getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public void setListingType(ListingTypeCodeType value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyerPaymentMethodCodeType }
     * 
     * 
     */
    public List<BuyerPaymentMethodCodeType> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<BuyerPaymentMethodCodeType>();
        }
        return this.paymentMethods;
    }

    /**
     * Gets the value of the galleryURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryURL() {
        return galleryURL;
    }

    /**
     * Sets the value of the galleryURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryURL(String value) {
        this.galleryURL = value;
    }

    /**
     * Gets the value of the pictureURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictureURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictureURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPictureURL() {
        if (pictureURL == null) {
            pictureURL = new ArrayList<String>();
        }
        return this.pictureURL;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the primaryCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCategoryID() {
        return primaryCategoryID;
    }

    /**
     * Sets the value of the primaryCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCategoryID(String value) {
        this.primaryCategoryID = value;
    }

    /**
     * Gets the value of the primaryCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCategoryName() {
        return primaryCategoryName;
    }

    /**
     * Sets the value of the primaryCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCategoryName(String value) {
        this.primaryCategoryName = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleUserType }
     *     
     */
    public SimpleUserType getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleUserType }
     *     
     */
    public void setSeller(SimpleUserType value) {
        this.seller = value;
    }

    /**
     * Gets the value of the bidCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidCount() {
        return bidCount;
    }

    /**
     * Sets the value of the bidCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidCount(Integer value) {
        this.bidCount = value;
    }

    /**
     * Gets the value of the convertedCurrentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedCurrentPrice() {
        return convertedCurrentPrice;
    }

    /**
     * Sets the value of the convertedCurrentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedCurrentPrice(AmountType value) {
        this.convertedCurrentPrice = value;
    }

    /**
     * Gets the value of the currentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Sets the value of the currentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentPrice(AmountType value) {
        this.currentPrice = value;
    }

    /**
     * Gets the value of the highBidder property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleUserType }
     *     
     */
    public SimpleUserType getHighBidder() {
        return highBidder;
    }

    /**
     * Sets the value of the highBidder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleUserType }
     *     
     */
    public void setHighBidder(SimpleUserType value) {
        this.highBidder = value;
    }

    /**
     * Gets the value of the listingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ListingStatusCodeType }
     *     
     */
    public ListingStatusCodeType getListingStatus() {
        return listingStatus;
    }

    /**
     * Sets the value of the listingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingStatusCodeType }
     *     
     */
    public void setListingStatus(ListingStatusCodeType value) {
        this.listingStatus = value;
    }

    /**
     * Gets the value of the quantitySold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySold() {
        return quantitySold;
    }

    /**
     * Sets the value of the quantitySold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySold(Integer value) {
        this.quantitySold = value;
    }

    /**
     * Gets the value of the reserveMet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReserveMet() {
        return reserveMet;
    }

    /**
     * Sets the value of the reserveMet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReserveMet(Boolean value) {
        this.reserveMet = value;
    }

    /**
     * Gets the value of the shipToLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShipToLocations() {
        if (shipToLocations == null) {
            shipToLocations = new ArrayList<String>();
        }
        return this.shipToLocations;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setSite(SiteCodeType value) {
        this.site = value;
    }

    /**
     * Gets the value of the timeLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeLeft() {
        return timeLeft;
    }

    /**
     * Sets the value of the timeLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeLeft(Duration value) {
        this.timeLeft = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the shippingCostSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingCostSummaryType }
     *     
     */
    public ShippingCostSummaryType getShippingCostSummary() {
        return shippingCostSummary;
    }

    /**
     * Sets the value of the shippingCostSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCostSummaryType }
     *     
     */
    public void setShippingCostSummary(ShippingCostSummaryType value) {
        this.shippingCostSummary = value;
    }

    /**
     * Gets the value of the itemSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getItemSpecifics() {
        return itemSpecifics;
    }

    /**
     * Sets the value of the itemSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setItemSpecifics(NameValueListArrayType value) {
        this.itemSpecifics = value;
    }

    /**
     * Gets the value of the hitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHitCount() {
        return hitCount;
    }

    /**
     * Sets the value of the hitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHitCount(Long value) {
        this.hitCount = value;
    }

    /**
     * Gets the value of the subtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * Sets the value of the subtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtitle(String value) {
        this.subtitle = value;
    }

    /**
     * Gets the value of the primaryCategoryIDPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCategoryIDPath() {
        return primaryCategoryIDPath;
    }

    /**
     * Sets the value of the primaryCategoryIDPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCategoryIDPath(String value) {
        this.primaryCategoryIDPath = value;
    }

    /**
     * Gets the value of the secondaryCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCategoryID() {
        return secondaryCategoryID;
    }

    /**
     * Sets the value of the secondaryCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCategoryID(String value) {
        this.secondaryCategoryID = value;
    }

    /**
     * Gets the value of the secondaryCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCategoryName() {
        return secondaryCategoryName;
    }

    /**
     * Sets the value of the secondaryCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCategoryName(String value) {
        this.secondaryCategoryName = value;
    }

    /**
     * Gets the value of the secondaryCategoryIDPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCategoryIDPath() {
        return secondaryCategoryIDPath;
    }

    /**
     * Sets the value of the secondaryCategoryIDPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCategoryIDPath(String value) {
        this.secondaryCategoryIDPath = value;
    }

    /**
     * Gets the value of the charity property.
     * 
     * @return
     *     possible object is
     *     {@link CharityType }
     *     
     */
    public CharityType getCharity() {
        return charity;
    }

    /**
     * Sets the value of the charity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharityType }
     *     
     */
    public void setCharity(CharityType value) {
        this.charity = value;
    }

    /**
     * Gets the value of the germanMotorsSearchable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGermanMotorsSearchable() {
        return germanMotorsSearchable;
    }

    /**
     * Sets the value of the germanMotorsSearchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGermanMotorsSearchable(Boolean value) {
        this.germanMotorsSearchable = value;
    }

    /**
     * Gets the value of the getItFast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetItFast() {
        return getItFast;
    }

    /**
     * Sets the value of the getItFast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetItFast(Boolean value) {
        this.getItFast = value;
    }

    /**
     * Gets the value of the gift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGift() {
        return gift;
    }

    /**
     * Sets the value of the gift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGift(Boolean value) {
        this.gift = value;
    }

    /**
     * Gets the value of the pictureExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictureExists() {
        return pictureExists;
    }

    /**
     * Sets the value of the pictureExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictureExists(Boolean value) {
        this.pictureExists = value;
    }

    /**
     * Gets the value of the recentListing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecentListing() {
        return recentListing;
    }

    /**
     * Sets the value of the recentListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecentListing(Boolean value) {
        this.recentListing = value;
    }

    /**
     * Gets the value of the storefront property.
     * 
     * @return
     *     possible object is
     *     {@link StorefrontType }
     *     
     */
    public StorefrontType getStorefront() {
        return storefront;
    }

    /**
     * Sets the value of the storefront property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorefrontType }
     *     
     */
    public void setStorefront(StorefrontType value) {
        this.storefront = value;
    }

    /**
     * Gets the value of the distanceFromBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getDistanceFromBuyer() {
        return distanceFromBuyer;
    }

    /**
     * Sets the value of the distanceFromBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setDistanceFromBuyer(DistanceType value) {
        this.distanceFromBuyer = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

    /**
     * Gets the value of the watchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWatchCount() {
        return watchCount;
    }

    /**
     * Sets the value of the watchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWatchCount(Integer value) {
        this.watchCount = value;
    }

    /**
     * Gets the value of the halfItemCondition property.
     * 
     * @return
     *     possible object is
     *     {@link HalfItemConditionCodeType }
     *     
     */
    public HalfItemConditionCodeType getHalfItemCondition() {
        return halfItemCondition;
    }

    /**
     * Sets the value of the halfItemCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfItemConditionCodeType }
     *     
     */
    public void setHalfItemCondition(HalfItemConditionCodeType value) {
        this.halfItemCondition = value;
    }

    /**
     * Gets the value of the sellerComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerComments() {
        return sellerComments;
    }

    /**
     * Sets the value of the sellerComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerComments(String value) {
        this.sellerComments = value;
    }

    /**
     * Gets the value of the returnPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnPolicyType }
     *     
     */
    public ReturnPolicyType getReturnPolicy() {
        return returnPolicy;
    }

    /**
     * Sets the value of the returnPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnPolicyType }
     *     
     */
    public void setReturnPolicy(ReturnPolicyType value) {
        this.returnPolicy = value;
    }

    /**
     * Gets the value of the minimumToBid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumToBid() {
        return minimumToBid;
    }

    /**
     * Sets the value of the minimumToBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumToBid(AmountType value) {
        this.minimumToBid = value;
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
     * Gets the value of the autoPay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPay() {
        return autoPay;
    }

    /**
     * Sets the value of the autoPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPay(Boolean value) {
        this.autoPay = value;
    }

    /**
     * Gets the value of the businessSellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSellerDetailsType }
     *     
     */
    public BusinessSellerDetailsType getBusinessSellerDetails() {
        return businessSellerDetails;
    }

    /**
     * Sets the value of the businessSellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSellerDetailsType }
     *     
     */
    public void setBusinessSellerDetails(BusinessSellerDetailsType value) {
        this.businessSellerDetails = value;
    }

    /**
     * Gets the value of the paymentAllowedSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentAllowedSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentAllowedSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteCodeType }
     * 
     * 
     */
    public List<SiteCodeType> getPaymentAllowedSite() {
        if (paymentAllowedSite == null) {
            paymentAllowedSite = new ArrayList<SiteCodeType>();
        }
        return this.paymentAllowedSite;
    }

    /**
     * Gets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedMerchantCreditCardEnabled() {
        return integratedMerchantCreditCardEnabled;
    }

    /**
     * Sets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedMerchantCreditCardEnabled(Boolean value) {
        this.integratedMerchantCreditCardEnabled = value;
    }

    /**
     * Gets the value of the variations property.
     * 
     * @return
     *     possible object is
     *     {@link VariationsType }
     *     
     */
    public VariationsType getVariations() {
        return variations;
    }

    /**
     * Sets the value of the variations property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationsType }
     *     
     */
    public void setVariations(VariationsType value) {
        this.variations = value;
    }

    /**
     * Gets the value of the handlingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandlingTime() {
        return handlingTime;
    }

    /**
     * Sets the value of the handlingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandlingTime(Integer value) {
        this.handlingTime = value;
    }

    /**
     * Gets the value of the lotSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLotSize() {
        return lotSize;
    }

    /**
     * Sets the value of the lotSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLotSize(Integer value) {
        this.lotSize = value;
    }

    /**
     * Gets the value of the conditionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConditionID() {
        return conditionID;
    }

    /**
     * Sets the value of the conditionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConditionID(Integer value) {
        this.conditionID = value;
    }

    /**
     * Gets the value of the conditionDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionDisplayName() {
        return conditionDisplayName;
    }

    /**
     * Sets the value of the conditionDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionDisplayName(String value) {
        this.conditionDisplayName = value;
    }

    /**
     * Gets the value of the quantityAvailableHint property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAvailableHintCodeType }
     *     
     */
    public QuantityAvailableHintCodeType getQuantityAvailableHint() {
        return quantityAvailableHint;
    }

    /**
     * Sets the value of the quantityAvailableHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAvailableHintCodeType }
     *     
     */
    public void setQuantityAvailableHint(QuantityAvailableHintCodeType value) {
        this.quantityAvailableHint = value;
    }

    /**
     * Gets the value of the quantityThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityThreshold() {
        return quantityThreshold;
    }

    /**
     * Sets the value of the quantityThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityThreshold(Integer value) {
        this.quantityThreshold = value;
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
     * {@link Object }
     * {@link Element }
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
