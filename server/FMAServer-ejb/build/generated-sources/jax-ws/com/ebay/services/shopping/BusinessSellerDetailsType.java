
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
 * 			  Displays the seller's information (in a business card format) 
 * 			  as part of the data returned in the GetSingleItem call if the 
 * 			  seller's SellerBusinessCodeType is set to 'Commercial'. Note 
 * 			  that this option is only available for sites that have 
 * 			  Business Seller options enabled.
 * 			
 * 
 * <p>Java class for BusinessSellerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessSellerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalContactInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradeRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATDetails" type="{urn:ebay:apis:eBLBaseComponents}VATDetailsType" minOccurs="0"/>
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
@XmlType(name = "BusinessSellerDetailsType", propOrder = {
    "address",
    "fax",
    "email",
    "additionalContactInformation",
    "tradeRegistrationNumber",
    "legalInvoice",
    "termsAndConditions",
    "vatDetails",
    "any"
})
public class BusinessSellerDetailsType {

    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "AdditionalContactInformation")
    protected String additionalContactInformation;
    @XmlElement(name = "TradeRegistrationNumber")
    protected String tradeRegistrationNumber;
    @XmlElement(name = "LegalInvoice")
    protected Boolean legalInvoice;
    @XmlElement(name = "TermsAndConditions")
    protected String termsAndConditions;
    @XmlElement(name = "VATDetails")
    protected VATDetailsType vatDetails;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the additionalContactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalContactInformation() {
        return additionalContactInformation;
    }

    /**
     * Sets the value of the additionalContactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalContactInformation(String value) {
        this.additionalContactInformation = value;
    }

    /**
     * Gets the value of the tradeRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeRegistrationNumber() {
        return tradeRegistrationNumber;
    }

    /**
     * Sets the value of the tradeRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeRegistrationNumber(String value) {
        this.tradeRegistrationNumber = value;
    }

    /**
     * Gets the value of the legalInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalInvoice() {
        return legalInvoice;
    }

    /**
     * Sets the value of the legalInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalInvoice(Boolean value) {
        this.legalInvoice = value;
    }

    /**
     * Gets the value of the termsAndConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets the value of the termsAndConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditions(String value) {
        this.termsAndConditions = value;
    }

    /**
     * Gets the value of the vatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VATDetailsType }
     *     
     */
    public VATDetailsType getVATDetails() {
        return vatDetails;
    }

    /**
     * Sets the value of the vatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VATDetailsType }
     *     
     */
    public void setVATDetails(VATDetailsType value) {
        this.vatDetails = value;
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
