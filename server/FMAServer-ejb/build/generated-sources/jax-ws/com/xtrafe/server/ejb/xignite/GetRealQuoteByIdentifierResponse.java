
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
 *         &lt;element name="GetRealQuoteByIdentifierResult" type="{http://www.xignite.com/services/}RealTimeQuote" minOccurs="0"/>
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
    "getRealQuoteByIdentifierResult"
})
@XmlRootElement(name = "GetRealQuoteByIdentifierResponse")
public class GetRealQuoteByIdentifierResponse {

    @XmlElement(name = "GetRealQuoteByIdentifierResult")
    protected RealTimeQuote getRealQuoteByIdentifierResult;

    /**
     * Gets the value of the getRealQuoteByIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeQuote }
     *     
     */
    public RealTimeQuote getGetRealQuoteByIdentifierResult() {
        return getRealQuoteByIdentifierResult;
    }

    /**
     * Sets the value of the getRealQuoteByIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeQuote }
     *     
     */
    public void setGetRealQuoteByIdentifierResult(RealTimeQuote value) {
        this.getRealQuoteByIdentifierResult = value;
    }

}
