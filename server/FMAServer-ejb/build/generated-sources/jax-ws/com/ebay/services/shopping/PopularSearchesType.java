
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
 * 				Contains search word information, as it is related to a category.
 * 			
 * 
 * <p>Java class for PopularSearchesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PopularSearchesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryParentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueryKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternativeSearches" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedSearches" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PopularSearchesType", propOrder = {
    "categoryID",
    "categoryParentID",
    "queryKeywords",
    "alternativeSearches",
    "relatedSearches",
    "categoryName",
    "categoryParentName",
    "any"
})
public class PopularSearchesType {

    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "CategoryParentID")
    protected String categoryParentID;
    @XmlElement(name = "QueryKeywords")
    protected String queryKeywords;
    @XmlElement(name = "AlternativeSearches")
    protected String alternativeSearches;
    @XmlElement(name = "RelatedSearches")
    protected String relatedSearches;
    @XmlElement(name = "CategoryName")
    protected String categoryName;
    @XmlElement(name = "CategoryParentName")
    protected String categoryParentName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the categoryParentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryParentID() {
        return categoryParentID;
    }

    /**
     * Sets the value of the categoryParentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryParentID(String value) {
        this.categoryParentID = value;
    }

    /**
     * Gets the value of the queryKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryKeywords() {
        return queryKeywords;
    }

    /**
     * Sets the value of the queryKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryKeywords(String value) {
        this.queryKeywords = value;
    }

    /**
     * Gets the value of the alternativeSearches property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeSearches() {
        return alternativeSearches;
    }

    /**
     * Sets the value of the alternativeSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeSearches(String value) {
        this.alternativeSearches = value;
    }

    /**
     * Gets the value of the relatedSearches property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedSearches() {
        return relatedSearches;
    }

    /**
     * Sets the value of the relatedSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedSearches(String value) {
        this.relatedSearches = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the categoryParentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryParentName() {
        return categoryParentName;
    }

    /**
     * Sets the value of the categoryParentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryParentName(String value) {
        this.categoryParentName = value;
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
