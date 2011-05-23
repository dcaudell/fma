
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
 *         &lt;element name="GetExtendedRealQuotesResult" type="{http://www.xignite.com/services/}ArrayOfExtendedRealTimeQuote" minOccurs="0"/>
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
    "getExtendedRealQuotesResult"
})
@XmlRootElement(name = "GetExtendedRealQuotesResponse")
public class GetExtendedRealQuotesResponse {

    @XmlElement(name = "GetExtendedRealQuotesResult")
    protected ArrayOfExtendedRealTimeQuote getExtendedRealQuotesResult;

    /**
     * Gets the value of the getExtendedRealQuotesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedRealTimeQuote }
     *     
     */
    public ArrayOfExtendedRealTimeQuote getGetExtendedRealQuotesResult() {
        return getExtendedRealQuotesResult;
    }

    /**
     * Sets the value of the getExtendedRealQuotesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedRealTimeQuote }
     *     
     */
    public void setGetExtendedRealQuotesResult(ArrayOfExtendedRealTimeQuote value) {
        this.getExtendedRealQuotesResult = value;
    }

}
