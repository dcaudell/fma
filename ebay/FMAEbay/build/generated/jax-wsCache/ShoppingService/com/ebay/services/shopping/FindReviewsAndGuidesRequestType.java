
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Splitting include reviews and guides from GetProducts.
 * 			
 * 
 * <p>Java class for FindReviewsAndGuidesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindReviewsAndGuidesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxResultsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReviewSort" type="{urn:ebay:apis:eBLBaseComponents}ReviewSortCodeType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindReviewsAndGuidesRequestType", propOrder = {
    "productID",
    "userID",
    "categoryID",
    "maxResultsPerPage",
    "pageNumber",
    "reviewSort",
    "sortOrder"
})
public class FindReviewsAndGuidesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ProductID")
    protected ProductIDType productID;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "MaxResultsPerPage")
    protected Integer maxResultsPerPage;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "ReviewSort")
    protected ReviewSortCodeType reviewSort;
    @XmlElement(name = "SortOrder")
    protected SortOrderCodeType sortOrder;

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIDType }
     *     
     */
    public ProductIDType getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIDType }
     *     
     */
    public void setProductID(ProductIDType value) {
        this.productID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

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
     * Gets the value of the maxResultsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResultsPerPage() {
        return maxResultsPerPage;
    }

    /**
     * Sets the value of the maxResultsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResultsPerPage(Integer value) {
        this.maxResultsPerPage = value;
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
     * Gets the value of the reviewSort property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewSortCodeType }
     *     
     */
    public ReviewSortCodeType getReviewSort() {
        return reviewSort;
    }

    /**
     * Sets the value of the reviewSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewSortCodeType }
     *     
     */
    public void setReviewSort(ReviewSortCodeType value) {
        this.reviewSort = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderCodeType }
     *     
     */
    public SortOrderCodeType getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderCodeType }
     *     
     */
    public void setSortOrder(SortOrderCodeType value) {
        this.sortOrder = value;
    }

}
