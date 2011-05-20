
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
 *         &lt;element name="GetRealTopLosersResult" type="{http://www.xignite.com/services/}Top" minOccurs="0"/>
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
    "getRealTopLosersResult"
})
@XmlRootElement(name = "GetRealTopLosersResponse")
public class GetRealTopLosersResponse {

    @XmlElement(name = "GetRealTopLosersResult")
    protected Top getRealTopLosersResult;

    /**
     * Gets the value of the getRealTopLosersResult property.
     * 
     * @return
     *     possible object is
     *     {@link Top }
     *     
     */
    public Top getGetRealTopLosersResult() {
        return getRealTopLosersResult;
    }

    /**
     * Sets the value of the getRealTopLosersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Top }
     *     
     */
    public void setGetRealTopLosersResult(Top value) {
        this.getRealTopLosersResult = value;
    }

}
