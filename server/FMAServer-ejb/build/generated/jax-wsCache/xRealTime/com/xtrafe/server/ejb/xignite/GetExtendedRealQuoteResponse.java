
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
 *         &lt;element name="GetExtendedRealQuoteResult" type="{http://www.xignite.com/services/}ExtendedRealTimeQuote" minOccurs="0"/>
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
    "getExtendedRealQuoteResult"
})
@XmlRootElement(name = "GetExtendedRealQuoteResponse")
public class GetExtendedRealQuoteResponse {

    @XmlElement(name = "GetExtendedRealQuoteResult")
    protected ExtendedRealTimeQuote getExtendedRealQuoteResult;

    /**
     * Gets the value of the getExtendedRealQuoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedRealTimeQuote }
     *     
     */
    public ExtendedRealTimeQuote getGetExtendedRealQuoteResult() {
        return getExtendedRealQuoteResult;
    }

    /**
     * Sets the value of the getExtendedRealQuoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedRealTimeQuote }
     *     
     */
    public void setGetExtendedRealQuoteResult(ExtendedRealTimeQuote value) {
        this.getExtendedRealQuoteResult = value;
    }

}
