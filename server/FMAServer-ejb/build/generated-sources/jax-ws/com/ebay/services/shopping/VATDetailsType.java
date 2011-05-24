
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
 * 				Container for eBay's Business User features. A business seller can choose
 * 				to offer an item exclusively to bidders and buyers that also represent businesses.
 * 				Only applicable when the item is listed in a B2B-enabled category.
 * 				Currently, the eBay Germany (DE), Austria (AT), and Switzerland (CH) sites support
 * 				B2B business features.
 * 			
 * 
 * <p>Java class for VATDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VATDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RestrictedToBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VATPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="VATSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "VATDetailsType", propOrder = {
    "businessSeller",
    "restrictedToBusiness",
    "vatPercent",
    "vatSite",
    "vatid",
    "any"
})
public class VATDetailsType {

    @XmlElement(name = "BusinessSeller")
    protected Boolean businessSeller;
    @XmlElement(name = "RestrictedToBusiness")
    protected Boolean restrictedToBusiness;
    @XmlElement(name = "VATPercent")
    protected Float vatPercent;
    @XmlElement(name = "VATSite")
    protected String vatSite;
    @XmlElement(name = "VATID")
    protected String vatid;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the businessSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessSeller() {
        return businessSeller;
    }

    /**
     * Sets the value of the businessSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessSeller(Boolean value) {
        this.businessSeller = value;
    }

    /**
     * Gets the value of the restrictedToBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedToBusiness() {
        return restrictedToBusiness;
    }

    /**
     * Sets the value of the restrictedToBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedToBusiness(Boolean value) {
        this.restrictedToBusiness = value;
    }

    /**
     * Gets the value of the vatPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVATPercent() {
        return vatPercent;
    }

    /**
     * Sets the value of the vatPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVATPercent(Float value) {
        this.vatPercent = value;
    }

    /**
     * Gets the value of the vatSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATSite() {
        return vatSite;
    }

    /**
     * Sets the value of the vatSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATSite(String value) {
        this.vatSite = value;
    }

    /**
     * Gets the value of the vatid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATID() {
        return vatid;
    }

    /**
     * Sets the value of the vatid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATID(String value) {
        this.vatid = value;
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
