
package com.ebay.services.shopping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Retrieves publicly available data for one or more listings. Use this call to retrieve much of the information that is visible on a listing's View Item page on the eBay Web site, such as title, prices, and basic shipping costs. Provide ItemID for every item for which you want information. This call returns the same minimal information that is returned by GetSingleItem, for each item with no IncludeSelector specified. (Use GetShippingCosts to retrieve more detailed shipping cost information for a given item.) Duplicated items are returned as a single item.
 * 			
 * 
 * <p>Java class for GetMultipleItemsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMultipleItemsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludeSelector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMultipleItemsRequestType", propOrder = {
    "itemID",
    "includeSelector"
})
public class GetMultipleItemsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID")
    protected List<String> itemID;
    @XmlElement(name = "IncludeSelector")
    protected String includeSelector;

    /**
     * Gets the value of the itemID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItemID() {
        if (itemID == null) {
            itemID = new ArrayList<String>();
        }
        return this.itemID;
    }

    /**
     * Gets the value of the includeSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeSelector() {
        return includeSelector;
    }

    /**
     * Sets the value of the includeSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeSelector(String value) {
        this.includeSelector = value;
    }

}
