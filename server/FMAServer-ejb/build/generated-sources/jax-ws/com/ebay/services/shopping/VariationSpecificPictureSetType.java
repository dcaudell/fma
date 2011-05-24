
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
 * 			At least one container is required (minOccurs="1") if Pictures container is present in the request.
 * 			
 * 
 * <p>Java class for VariationSpecificPictureSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariationSpecificPictureSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariationSpecificValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GalleryURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
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
@XmlType(name = "VariationSpecificPictureSetType", propOrder = {
    "variationSpecificValue",
    "pictureURL",
    "galleryURL",
    "any"
})
public class VariationSpecificPictureSetType {

    @XmlElement(name = "VariationSpecificValue")
    protected String variationSpecificValue;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> pictureURL;
    @XmlElement(name = "GalleryURL")
    @XmlSchemaType(name = "anyURI")
    protected String galleryURL;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the variationSpecificValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationSpecificValue() {
        return variationSpecificValue;
    }

    /**
     * Sets the value of the variationSpecificValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationSpecificValue(String value) {
        this.variationSpecificValue = value;
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
