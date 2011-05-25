
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Shipping costs and options related to a domestic shipping service.
 * 			
 * 
 * <p>Java class for ShippingServiceOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServiceOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingInsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceAdditionalCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServicePriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpeditedService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingSurcharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShipsTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ShippingServiceOptionType", propOrder = {
    "shippingInsuranceCost",
    "shippingServiceName",
    "shippingServiceCost",
    "shippingServiceAdditionalCost",
    "shippingServicePriority",
    "expeditedService",
    "shippingTimeMin",
    "shippingTimeMax",
    "shippingSurcharge",
    "shipsTo",
    "any"
})
public class ShippingServiceOptionType {

    @XmlElement(name = "ShippingInsuranceCost")
    protected AmountType shippingInsuranceCost;
    @XmlElement(name = "ShippingServiceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingServiceName;
    @XmlElement(name = "ShippingServiceCost")
    protected AmountType shippingServiceCost;
    @XmlElement(name = "ShippingServiceAdditionalCost")
    protected AmountType shippingServiceAdditionalCost;
    @XmlElement(name = "ShippingServicePriority")
    protected Integer shippingServicePriority;
    @XmlElement(name = "ExpeditedService")
    protected Boolean expeditedService;
    @XmlElement(name = "ShippingTimeMin")
    protected Integer shippingTimeMin;
    @XmlElement(name = "ShippingTimeMax")
    protected Integer shippingTimeMax;
    @XmlElement(name = "ShippingSurcharge")
    protected AmountType shippingSurcharge;
    @XmlElement(name = "ShipsTo")
    protected List<String> shipsTo;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the shippingInsuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingInsuranceCost() {
        return shippingInsuranceCost;
    }

    /**
     * Sets the value of the shippingInsuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingInsuranceCost(AmountType value) {
        this.shippingInsuranceCost = value;
    }

    /**
     * Gets the value of the shippingServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingServiceName() {
        return shippingServiceName;
    }

    /**
     * Sets the value of the shippingServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingServiceName(String value) {
        this.shippingServiceName = value;
    }

    /**
     * Gets the value of the shippingServiceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingServiceCost() {
        return shippingServiceCost;
    }

    /**
     * Sets the value of the shippingServiceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingServiceCost(AmountType value) {
        this.shippingServiceCost = value;
    }

    /**
     * Gets the value of the shippingServiceAdditionalCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingServiceAdditionalCost() {
        return shippingServiceAdditionalCost;
    }

    /**
     * Sets the value of the shippingServiceAdditionalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingServiceAdditionalCost(AmountType value) {
        this.shippingServiceAdditionalCost = value;
    }

    /**
     * Gets the value of the shippingServicePriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingServicePriority() {
        return shippingServicePriority;
    }

    /**
     * Sets the value of the shippingServicePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingServicePriority(Integer value) {
        this.shippingServicePriority = value;
    }

    /**
     * Gets the value of the expeditedService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpeditedService() {
        return expeditedService;
    }

    /**
     * Sets the value of the expeditedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpeditedService(Boolean value) {
        this.expeditedService = value;
    }

    /**
     * Gets the value of the shippingTimeMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingTimeMin() {
        return shippingTimeMin;
    }

    /**
     * Sets the value of the shippingTimeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingTimeMin(Integer value) {
        this.shippingTimeMin = value;
    }

    /**
     * Gets the value of the shippingTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingTimeMax() {
        return shippingTimeMax;
    }

    /**
     * Sets the value of the shippingTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingTimeMax(Integer value) {
        this.shippingTimeMax = value;
    }

    /**
     * Gets the value of the shippingSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingSurcharge() {
        return shippingSurcharge;
    }

    /**
     * Sets the value of the shippingSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingSurcharge(AmountType value) {
        this.shippingSurcharge = value;
    }

    /**
     * Gets the value of the shipsTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipsTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipsTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShipsTo() {
        if (shipsTo == null) {
            shipsTo = new ArrayList<String>();
        }
        return this.shipsTo;
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
