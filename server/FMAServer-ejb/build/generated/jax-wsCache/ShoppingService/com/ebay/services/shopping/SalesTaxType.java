
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
 * 				Type for expressing sales tax data.
 * 			
 * 
 * <p>Java class for SalesTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesTaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesTaxPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="SalesTaxState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingIncludedInTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesTaxAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
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
@XmlType(name = "SalesTaxType", propOrder = {
    "salesTaxPercent",
    "salesTaxState",
    "shippingIncludedInTax",
    "salesTaxAmount",
    "any"
})
public class SalesTaxType {

    @XmlElement(name = "SalesTaxPercent")
    protected Float salesTaxPercent;
    @XmlElement(name = "SalesTaxState")
    protected String salesTaxState;
    @XmlElement(name = "ShippingIncludedInTax")
    protected Boolean shippingIncludedInTax;
    @XmlElement(name = "SalesTaxAmount")
    protected AmountType salesTaxAmount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the salesTaxState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxState() {
        return salesTaxState;
    }

    /**
     * Sets the value of the salesTaxState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTaxState(String value) {
        this.salesTaxState = value;
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
     * Gets the value of the salesTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalesTaxAmount() {
        return salesTaxAmount;
    }

    /**
     * Sets the value of the salesTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalesTaxAmount(AmountType value) {
        this.salesTaxAmount = value;
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
