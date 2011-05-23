
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetTickCollectionsResult" type="{http://www.xignite.com/services/}ArrayOfTicks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTickCollectionsResult"
})
@XmlRootElement(name = "GetTickCollectionsResponse")
public class GetTickCollectionsResponse {

    @XmlElement(name = "GetTickCollectionsResult")
    protected ArrayOfTicks getTickCollectionsResult;

    /**
     * Gets the value of the getTickCollectionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTicks }
     *     
     */
    public ArrayOfTicks getGetTickCollectionsResult() {
        return getTickCollectionsResult;
    }

    /**
     * Sets the value of the getTickCollectionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTicks }
     *     
     */
    public void setGetTickCollectionsResult(ArrayOfTicks value) {
        this.getTickCollectionsResult = value;
    }

}
