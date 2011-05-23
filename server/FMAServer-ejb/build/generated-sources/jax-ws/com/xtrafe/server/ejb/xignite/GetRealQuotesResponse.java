
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
 *         &lt;element name="GetRealQuotesResult" type="{http://www.xignite.com/services/}ArrayOfRealTimeQuote" minOccurs="0"/>
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
    "getRealQuotesResult"
})
@XmlRootElement(name = "GetRealQuotesResponse")
public class GetRealQuotesResponse {

    @XmlElement(name = "GetRealQuotesResult")
    protected ArrayOfRealTimeQuote getRealQuotesResult;

    /**
     * Gets the value of the getRealQuotesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRealTimeQuote }
     *     
     */
    public ArrayOfRealTimeQuote getGetRealQuotesResult() {
        return getRealQuotesResult;
    }

    /**
     * Sets the value of the getRealQuotesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRealTimeQuote }
     *     
     */
    public void setGetRealQuotesResult(ArrayOfRealTimeQuote value) {
        this.getRealQuotesResult = value;
    }

}
