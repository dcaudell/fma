
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
 *         &lt;element name="GetRealTopMoversResult" type="{http://www.xignite.com/services/}Top" minOccurs="0"/>
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
    "getRealTopMoversResult"
})
@XmlRootElement(name = "GetRealTopMoversResponse")
public class GetRealTopMoversResponse {

    @XmlElement(name = "GetRealTopMoversResult")
    protected Top getRealTopMoversResult;

    /**
     * Gets the value of the getRealTopMoversResult property.
     * 
     * @return
     *     possible object is
     *     {@link Top }
     *     
     */
    public Top getGetRealTopMoversResult() {
        return getRealTopMoversResult;
    }

    /**
     * Sets the value of the getRealTopMoversResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Top }
     *     
     */
    public void setGetRealTopMoversResult(Top value) {
        this.getRealTopMoversResult = value;
    }

}
