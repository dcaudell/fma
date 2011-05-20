
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
 *         &lt;element name="GetBookResult" type="{http://www.xignite.com/services/}Book" minOccurs="0"/>
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
    "getBookResult"
})
@XmlRootElement(name = "GetBookResponse")
public class GetBookResponse {

    @XmlElement(name = "GetBookResult")
    protected Book getBookResult;

    /**
     * Gets the value of the getBookResult property.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getGetBookResult() {
        return getBookResult;
    }

    /**
     * Sets the value of the getBookResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setGetBookResult(Book value) {
        this.getBookResult = value;
    }

}
