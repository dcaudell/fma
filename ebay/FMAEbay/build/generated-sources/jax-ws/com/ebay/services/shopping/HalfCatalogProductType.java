
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 			Information about an Half.com catalog product.
 * 			
 * 
 * <p>Java class for HalfCatalogProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HalfCatalogProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="StockPhotoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ShippingCostSummary" type="{urn:ebay:apis:eBLBaseComponents}ShippingCostSummaryType" minOccurs="0"/>
 *         &lt;element name="DisplayStockPhotos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}SimpleItemArrayType" minOccurs="0"/>
 *         &lt;element name="ReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
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
@XmlType(name = "HalfCatalogProductType", propOrder = {
    "title",
    "detailsURL",
    "stockPhotoURL",
    "shippingCostSummary",
    "displayStockPhotos",
    "itemCount",
    "productID",
    "domainName",
    "itemSpecifics",
    "itemArray",
    "reviewCount",
    "minPrice",
    "any"
})
public class HalfCatalogProductType {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "DetailsURL")
    @XmlSchemaType(name = "anyURI")
    protected String detailsURL;
    @XmlElement(name = "StockPhotoURL")
    @XmlSchemaType(name = "anyURI")
    protected String stockPhotoURL;
    @XmlElement(name = "ShippingCostSummary")
    protected ShippingCostSummaryType shippingCostSummary;
    @XmlElement(name = "DisplayStockPhotos")
    protected Boolean displayStockPhotos;
    @XmlElement(name = "ItemCount")
    protected Integer itemCount;
    @XmlElement(name = "ProductID")
    protected List<ProductIDType> productID;
    @XmlElement(name = "DomainName")
    protected String domainName;
    @XmlElement(name = "ItemSpecifics")
    protected NameValueListArrayType itemSpecifics;
    @XmlElement(name = "ItemArray")
    protected SimpleItemArrayType itemArray;
    @XmlElement(name = "ReviewCount")
    protected Integer reviewCount;
    @XmlElement(name = "MinPrice")
    protected AmountType minPrice;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the detailsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsURL() {
        return detailsURL;
    }

    /**
     * Sets the value of the detailsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsURL(String value) {
        this.detailsURL = value;
    }

    /**
     * Gets the value of the stockPhotoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockPhotoURL() {
        return stockPhotoURL;
    }

    /**
     * Sets the value of the stockPhotoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockPhotoURL(String value) {
        this.stockPhotoURL = value;
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
     * Gets the value of the displayStockPhotos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayStockPhotos() {
        return displayStockPhotos;
    }

    /**
     * Sets the value of the displayStockPhotos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayStockPhotos(Boolean value) {
        this.displayStockPhotos = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCount(Integer value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIDType }
     * 
     * 
     */
    public List<ProductIDType> getProductID() {
        if (productID == null) {
            productID = new ArrayList<ProductIDType>();
        }
        return this.productID;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
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
     * Gets the value of the itemArray property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleItemArrayType }
     *     
     */
    public SimpleItemArrayType getItemArray() {
        return itemArray;
    }

    /**
     * Sets the value of the itemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleItemArrayType }
     *     
     */
    public void setItemArray(SimpleItemArrayType value) {
        this.itemArray = value;
    }

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
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinPrice(AmountType value) {
        this.minPrice = value;
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
