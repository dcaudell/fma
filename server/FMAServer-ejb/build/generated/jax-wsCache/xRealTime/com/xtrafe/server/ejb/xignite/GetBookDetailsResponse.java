
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
 *         &lt;element name="GetBookDetailsResult" type="{http://www.xignite.com/services/}DetailedBook" minOccurs="0"/>
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
    "getBookDetailsResult"
})
@XmlRootElement(name = "GetBookDetailsResponse")
public class GetBookDetailsResponse {

    @XmlElement(name = "GetBookDetailsResult")
    protected DetailedBook getBookDetailsResult;

    /**
     * Gets the value of the getBookDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedBook }
     *     
     */
    public DetailedBook getGetBookDetailsResult() {
        return getBookDetailsResult;
    }

    /**
     * Sets the value of the getBookDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedBook }
     *     
     */
    public void setGetBookDetailsResult(DetailedBook value) {
        this.getBookDetailsResult = value;
    }

}
