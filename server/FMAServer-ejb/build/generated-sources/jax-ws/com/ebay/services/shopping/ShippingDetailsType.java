
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
 * 				Type for the shipping-related details for an item or transaction.
 * 			
 * 
 * <p>Java class for ShippingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetItFast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
 *         &lt;element name="InternationalShippingServiceOption" type="{urn:ebay:apis:eBLBaseComponents}InternationalShippingServiceOptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesTax" type="{urn:ebay:apis:eBLBaseComponents}SalesTaxType" minOccurs="0"/>
 *         &lt;element name="ShippingRateErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingServiceOption" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceOptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxTable" type="{urn:ebay:apis:eBLBaseComponents}TaxTableType" minOccurs="0"/>
 *         &lt;element name="InternationalInsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InternationalInsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
 *         &lt;element name="CODCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ExcludeShipToLocation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ShippingDetailsType", propOrder = {
    "getItFast",
    "insuranceCost",
    "insuranceOption",
    "internationalShippingServiceOption",
    "salesTax",
    "shippingRateErrorMessage",
    "shippingServiceOption",
    "taxTable",
    "internationalInsuranceCost",
    "internationalInsuranceOption",
    "codCost",
    "excludeShipToLocation",
    "any"
})
public class ShippingDetailsType {

    @XmlElement(name = "GetItFast")
    protected Boolean getItFast;
    @XmlElement(name = "InsuranceCost")
    protected AmountType insuranceCost;
    @XmlElement(name = "InsuranceOption")
    protected InsuranceOptionCodeType insuranceOption;
    @XmlElement(name = "InternationalShippingServiceOption")
    protected List<InternationalShippingServiceOptionType> internationalShippingServiceOption;
    @XmlElement(name = "SalesTax")
    protected SalesTaxType salesTax;
    @XmlElement(name = "ShippingRateErrorMessage")
    protected String shippingRateErrorMessage;
    @XmlElement(name = "ShippingServiceOption")
    protected List<ShippingServiceOptionType> shippingServiceOption;
    @XmlElement(name = "TaxTable")
    protected TaxTableType taxTable;
    @XmlElement(name = "InternationalInsuranceCost")
    protected AmountType internationalInsuranceCost;
    @XmlElement(name = "InternationalInsuranceOption")
    protected InsuranceOptionCodeType internationalInsuranceOption;
    @XmlElement(name = "CODCost")
    protected AmountType codCost;
    @XmlElement(name = "ExcludeShipToLocation")
    protected List<String> excludeShipToLocation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceCost(AmountType value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the insuranceOption property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public InsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }

    /**
     * Sets the value of the insuranceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public void setInsuranceOption(InsuranceOptionCodeType value) {
        this.insuranceOption = value;
    }

    /**
     * Gets the value of the internationalShippingServiceOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internationalShippingServiceOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternationalShippingServiceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalShippingServiceOptionType }
     * 
     * 
     */
    public List<InternationalShippingServiceOptionType> getInternationalShippingServiceOption() {
        if (internationalShippingServiceOption == null) {
            internationalShippingServiceOption = new ArrayList<InternationalShippingServiceOptionType>();
        }
        return this.internationalShippingServiceOption;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxType }
     *     
     */
    public SalesTaxType getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxType }
     *     
     */
    public void setSalesTax(SalesTaxType value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the shippingRateErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingRateErrorMessage() {
        return shippingRateErrorMessage;
    }

    /**
     * Sets the value of the shippingRateErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingRateErrorMessage(String value) {
        this.shippingRateErrorMessage = value;
    }

    /**
     * Gets the value of the shippingServiceOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingServiceOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingServiceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingServiceOptionType }
     * 
     * 
     */
    public List<ShippingServiceOptionType> getShippingServiceOption() {
        if (shippingServiceOption == null) {
            shippingServiceOption = new ArrayList<ShippingServiceOptionType>();
        }
        return this.shippingServiceOption;
    }

    /**
     * Gets the value of the taxTable property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTableType }
     *     
     */
    public TaxTableType getTaxTable() {
        return taxTable;
    }

    /**
     * Sets the value of the taxTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTableType }
     *     
     */
    public void setTaxTable(TaxTableType value) {
        this.taxTable = value;
    }

    /**
     * Gets the value of the internationalInsuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInternationalInsuranceCost() {
        return internationalInsuranceCost;
    }

    /**
     * Sets the value of the internationalInsuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInternationalInsuranceCost(AmountType value) {
        this.internationalInsuranceCost = value;
    }

    /**
     * Gets the value of the internationalInsuranceOption property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public InsuranceOptionCodeType getInternationalInsuranceOption() {
        return internationalInsuranceOption;
    }

    /**
     * Sets the value of the internationalInsuranceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public void setInternationalInsuranceOption(InsuranceOptionCodeType value) {
        this.internationalInsuranceOption = value;
    }

    /**
     * Gets the value of the codCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCODCost() {
        return codCost;
    }

    /**
     * Sets the value of the codCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCODCost(AmountType value) {
        this.codCost = value;
    }

    /**
     * Gets the value of the excludeShipToLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeShipToLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeShipToLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeShipToLocation() {
        if (excludeShipToLocation == null) {
            excludeShipToLocation = new ArrayList<String>();
        }
        return this.excludeShipToLocation;
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
