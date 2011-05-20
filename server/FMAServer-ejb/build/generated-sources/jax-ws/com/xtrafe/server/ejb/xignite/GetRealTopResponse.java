
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
 *         &lt;element name="GetRealTopResult" type="{http://www.xignite.com/services/}ArrayOfTop" minOccurs="0"/>
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
    "getRealTopResult"
})
@XmlRootElement(name = "GetRealTopResponse")
public class GetRealTopResponse {

    @XmlElement(name = "GetRealTopResult")
    protected ArrayOfTop getRealTopResult;

    /**
     * Gets the value of the getRealTopResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTop }
     *     
     */
    public ArrayOfTop getGetRealTopResult() {
        return getRealTopResult;
    }

    /**
     * Sets the value of the getRealTopResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTop }
     *     
     */
    public void setGetRealTopResult(ArrayOfTop value) {
        this.getRealTopResult = value;
    }

}
