
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the keyword data for the requested categories. A category's data are contained
 * 				in a CategoryArrayType object if there is no error (one or more CategoryType objects).
 * 				Returns category data as well as related search data.
 * 			
 * 
 * <p>Java class for FindPopularSearchesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindPopularSearchesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PopularSearchResult" type="{urn:ebay:apis:eBLBaseComponents}PopularSearchesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPopularSearchesResponseType", propOrder = {
    "popularSearchResult",
    "pageNumber",
    "totalPages"
})
public class FindPopularSearchesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "PopularSearchResult")
    protected List<PopularSearchesType> popularSearchResult;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "TotalPages")
    protected Integer totalPages;

    /**
     * Gets the value of the popularSearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the popularSearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPopularSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PopularSearchesType }
     * 
     * 
     */
    public List<PopularSearchesType> getPopularSearchResult() {
        if (popularSearchResult == null) {
            popularSearchResult = new ArrayList<PopularSearchesType>();
        }
        return this.popularSearchResult;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

}
