
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
 * 				Information about zero or more buying guides and the site's buying guide hub.
 * 				Buying guides contain content about particular product areas, categories, or subjects
 * 				to help buyers decide which type of item to purchase based on their particular interests.
 * 				Multiple buying guides can be returned. See the eBay Web Services Guide for additional information.
 * 			
 * 
 * <p>Java class for BuyingGuideDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyingGuideDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyingGuide" type="{urn:ebay:apis:eBLBaseComponents}BuyingGuideType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BuyingGuideHub" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
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
@XmlType(name = "BuyingGuideDetailsType", propOrder = {
    "buyingGuide",
    "buyingGuideHub",
    "any"
})
public class BuyingGuideDetailsType {

    @XmlElement(name = "BuyingGuide")
    protected List<BuyingGuideType> buyingGuide;
    @XmlElement(name = "BuyingGuideHub")
    @XmlSchemaType(name = "anyURI")
    protected String buyingGuideHub;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the buyingGuide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyingGuide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyingGuide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyingGuideType }
     * 
     * 
     */
    public List<BuyingGuideType> getBuyingGuide() {
        if (buyingGuide == null) {
            buyingGuide = new ArrayList<BuyingGuideType>();
        }
        return this.buyingGuide;
    }

    /**
     * Gets the value of the buyingGuideHub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyingGuideHub() {
        return buyingGuideHub;
    }

    /**
     * Sets the value of the buyingGuideHub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyingGuideHub(String value) {
        this.buyingGuideHub = value;
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
