
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Find popular items
 * 			
 * 
 * <p>Java class for FindPopularItemsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindPopularItemsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="QueryKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryIDExclude" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaxEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPopularItemsRequestType", propOrder = {
    "categoryID",
    "queryKeywords",
    "categoryIDExclude",
    "maxEntries"
})
public class FindPopularItemsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "CategoryID")
    protected List<String> categoryID;
    @XmlElement(name = "QueryKeywords")
    protected String queryKeywords;
    @XmlElement(name = "CategoryIDExclude")
    protected List<String> categoryIDExclude;
    @XmlElement(name = "MaxEntries")
    protected Integer maxEntries;

    /**
     * Gets the value of the categoryID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategoryID() {
        if (categoryID == null) {
            categoryID = new ArrayList<String>();
        }
        return this.categoryID;
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
     * Gets the value of the categoryIDExclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryIDExclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryIDExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategoryIDExclude() {
        if (categoryIDExclude == null) {
            categoryIDExclude = new ArrayList<String>();
        }
        return this.categoryIDExclude;
    }

    /**
     * Gets the value of the maxEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxEntries() {
        return maxEntries;
    }

    /**
     * Sets the value of the maxEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxEntries(Integer value) {
        this.maxEntries = value;
    }

}
