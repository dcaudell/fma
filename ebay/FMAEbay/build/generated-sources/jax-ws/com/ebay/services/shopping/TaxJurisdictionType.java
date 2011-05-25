
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Tax-related details for a region or jurisdiction.
 * 			
 * 
 * <p>Java class for TaxJurisdictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxJurisdictionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JurisdictionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesTaxPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ShippingIncludedInTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "TaxJurisdictionType", propOrder = {
    "jurisdictionID",
    "salesTaxPercent",
    "shippingIncludedInTax",
    "any"
})
public class TaxJurisdictionType {

    @XmlElement(name = "JurisdictionID")
    protected String jurisdictionID;
    @XmlElement(name = "SalesTaxPercent")
    protected Float salesTaxPercent;
    @XmlElement(name = "ShippingIncludedInTax")
    protected Boolean shippingIncludedInTax;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the jurisdictionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdictionID() {
        return jurisdictionID;
    }

    /**
     * Sets the value of the jurisdictionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdictionID(String value) {
        this.jurisdictionID = value;
    }

    /**
     * Gets the value of the salesTaxPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSalesTaxPercent() {
        return salesTaxPercent;
    }

    /**
     * Sets the value of the salesTaxPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSalesTaxPercent(Float value) {
        this.salesTaxPercent = value;
    }

    /**
     * Gets the value of the shippingIncludedInTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingIncludedInTax() {
        return shippingIncludedInTax;
    }

    /**
     * Sets the value of the shippingIncludedInTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingIncludedInTax(Boolean value) {
        this.shippingIncludedInTax = value;
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
