
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains the category data for the eBay site specified as input. The category
 * 				data is returned as a CategoryArrayType object, that contains zero, one, or
 * 				multiple CategoryType objects. Each CategoryType object contains the detail data
 * 				for one category. Other fields indicate how many categories are returned in a call, when the category hierarchy was last updated, and the version of the category hierarchy (all three of which can differ from one eBay site to the next).
 * 			
 * 
 * <p>Java class for GetCategoryInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategoryInfoResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CategoryArray" type="{urn:ebay:apis:eBLBaseComponents}CategoryArrayType" minOccurs="0"/>
 *         &lt;element name="CategoryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CategoryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoryInfoResponseType", propOrder = {
    "categoryArray",
    "categoryCount",
    "updateTime",
    "categoryVersion"
})
public class GetCategoryInfoResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "CategoryArray")
    protected CategoryArrayType categoryArray;
    @XmlElement(name = "CategoryCount")
    protected Integer categoryCount;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "CategoryVersion")
    protected String categoryVersion;

    /**
     * Gets the value of the categoryArray property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryArrayType }
     *     
     */
    public CategoryArrayType getCategoryArray() {
        return categoryArray;
    }

    /**
     * Sets the value of the categoryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryArrayType }
     *     
     */
    public void setCategoryArray(CategoryArrayType value) {
        this.categoryArray = value;
    }

    /**
     * Gets the value of the categoryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryCount() {
        return categoryCount;
    }

    /**
     * Sets the value of the categoryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryCount(Integer value) {
        this.categoryCount = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the categoryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryVersion() {
        return categoryVersion;
    }

    /**
     * Sets the value of the categoryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryVersion(String value) {
        this.categoryVersion = value;
    }

}
