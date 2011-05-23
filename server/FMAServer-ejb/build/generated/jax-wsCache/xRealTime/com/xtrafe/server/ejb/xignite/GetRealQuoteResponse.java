
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
 *         &lt;element name="GetRealQuoteResult" type="{http://www.xignite.com/services/}RealTimeQuote" minOccurs="0"/>
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
    "getRealQuoteResult"
})
@XmlRootElement(name = "GetRealQuoteResponse")
public class GetRealQuoteResponse {

    @XmlElement(name = "GetRealQuoteResult")
    protected RealTimeQuote getRealQuoteResult;

    /**
     * Gets the value of the getRealQuoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeQuote }
     *     
     */
    public RealTimeQuote getGetRealQuoteResult() {
        return getRealQuoteResult;
    }

    /**
     * Sets the value of the getRealQuoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeQuote }
     *     
     */
    public void setGetRealQuoteResult(RealTimeQuote value) {
        this.getRealQuoteResult = value;
    }

}
