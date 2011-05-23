
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
 *         &lt;element name="GetExchangeTimeResult" type="{http://www.xignite.com/services/}ExchangeTime" minOccurs="0"/>
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
    "getExchangeTimeResult"
})
@XmlRootElement(name = "GetExchangeTimeResponse")
public class GetExchangeTimeResponse {

    @XmlElement(name = "GetExchangeTimeResult")
    protected ExchangeTime getExchangeTimeResult;

    /**
     * Gets the value of the getExchangeTimeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeTime }
     *     
     */
    public ExchangeTime getGetExchangeTimeResult() {
        return getExchangeTimeResult;
    }

    /**
     * Sets the value of the getExchangeTimeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeTime }
     *     
     */
    public void setGetExchangeTimeResult(ExchangeTime value) {
        this.getExchangeTimeResult = value;
    }

}
