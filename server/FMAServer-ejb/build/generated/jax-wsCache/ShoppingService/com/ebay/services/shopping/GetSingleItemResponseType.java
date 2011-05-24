
package com.ebay.services.shopping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Response to GetSingleItem request.
 * 			
 * 
 * <p>Java class for GetSingleItemResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSingleItemResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}SimpleItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSingleItemResponseType", propOrder = {
    "item"
})
public class GetSingleItemResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "Item")
    protected SimpleItemType item;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleItemType }
     *     
     */
    public SimpleItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleItemType }
     *     
     */
    public void setItem(SimpleItemType value) {
        this.item = value;
    }

}
