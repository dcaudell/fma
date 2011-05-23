
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
 *         &lt;element name="GetRealQuotesTickerResult" type="{http://www.xignite.com/services/}TickerTape" minOccurs="0"/>
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
    "getRealQuotesTickerResult"
})
@XmlRootElement(name = "GetRealQuotesTickerResponse")
public class GetRealQuotesTickerResponse {

    @XmlElement(name = "GetRealQuotesTickerResult")
    protected TickerTape getRealQuotesTickerResult;

    /**
     * Gets the value of the getRealQuotesTickerResult property.
     * 
     * @return
     *     possible object is
     *     {@link TickerTape }
     *     
     */
    public TickerTape getGetRealQuotesTickerResult() {
        return getRealQuotesTickerResult;
    }

    /**
     * Sets the value of the getRealQuotesTickerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TickerTape }
     *     
     */
    public void setGetRealQuotesTickerResult(TickerTape value) {
        this.getRealQuotesTickerResult = value;
    }

}
