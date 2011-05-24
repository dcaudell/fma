
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
 * 				Contains product reviews written by eBay members.
 * 			 
 * 
 * <p>Java class for ReviewDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviewDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AverageRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Review" type="{urn:ebay:apis:eBLBaseComponents}ReviewType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ReviewDetailsType", propOrder = {
    "averageRating",
    "review",
    "any"
})
public class ReviewDetailsType {

    @XmlElement(name = "AverageRating")
    protected Float averageRating;
    @XmlElement(name = "Review")
    protected List<ReviewType> review;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the averageRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageRating() {
        return averageRating;
    }

    /**
     * Sets the value of the averageRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageRating(Float value) {
        this.averageRating = value;
    }

    /**
     * Gets the value of the review property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the review property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReviewType }
     * 
     * 
     */
    public List<ReviewType> getReview() {
        if (review == null) {
            review = new ArrayList<ReviewType>();
        }
        return this.review;
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
