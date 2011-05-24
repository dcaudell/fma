
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Retrieves publicly available data for a single listing.
 * 					Use this call to retrieve most of the information that is visible
 * 					on a listing's View Item page on the eBay Web site,
 * 					such as title, description, prices, basic seller and bidder information,
 * 					and other details about the listing.Also returns basic
 * 					shipping costs. For more shipping details, use GetShippingCosts.
 * 			
 * 
 * <p>Java class for GetSingleItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSingleItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariationSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariationSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="IncludeSelector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSingleItemRequestType", propOrder = {
    "itemID",
    "variationSKU",
    "variationSpecifics",
    "includeSelector"
})
public class GetSingleItemRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "VariationSKU")
    protected String variationSKU;
    @XmlElement(name = "VariationSpecifics")
    protected NameValueListArrayType variationSpecifics;
    @XmlElement(name = "IncludeSelector")
    protected String includeSelector;

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
     * Gets the value of the variationSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationSKU() {
        return variationSKU;
    }

    /**
     * Sets the value of the variationSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationSKU(String value) {
        this.variationSKU = value;
    }

    /**
     * Gets the value of the variationSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getVariationSpecifics() {
        return variationSpecifics;
    }

    /**
     * Sets the value of the variationSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setVariationSpecifics(NameValueListArrayType value) {
        this.variationSpecifics = value;
    }

    /**
     * Gets the value of the includeSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeSelector() {
        return includeSelector;
    }

    /**
     * Sets the value of the includeSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeSelector(String value) {
        this.includeSelector = value;
    }

}
