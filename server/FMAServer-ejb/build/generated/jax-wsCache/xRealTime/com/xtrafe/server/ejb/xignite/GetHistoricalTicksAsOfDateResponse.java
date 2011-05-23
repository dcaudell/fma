
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
 *         &lt;element name="GetHistoricalTicksAsOfDateResult" type="{http://www.xignite.com/services/}Ticks" minOccurs="0"/>
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
    "getHistoricalTicksAsOfDateResult"
})
@XmlRootElement(name = "GetHistoricalTicksAsOfDateResponse")
public class GetHistoricalTicksAsOfDateResponse {

    @XmlElement(name = "GetHistoricalTicksAsOfDateResult")
    protected Ticks getHistoricalTicksAsOfDateResult;

    /**
     * Gets the value of the getHistoricalTicksAsOfDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Ticks }
     *     
     */
    public Ticks getGetHistoricalTicksAsOfDateResult() {
        return getHistoricalTicksAsOfDateResult;
    }

    /**
     * Sets the value of the getHistoricalTicksAsOfDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticks }
     *     
     */
    public void setGetHistoricalTicksAsOfDateResult(Ticks value) {
        this.getHistoricalTicksAsOfDateResult = value;
    }

}
