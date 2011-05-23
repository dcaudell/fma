
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
 *         &lt;element name="GetRealChartPresetResult" type="{http://www.xignite.com/services/}IntradayChart" minOccurs="0"/>
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
    "getRealChartPresetResult"
})
@XmlRootElement(name = "GetRealChartPresetResponse")
public class GetRealChartPresetResponse {

    @XmlElement(name = "GetRealChartPresetResult")
    protected IntradayChart getRealChartPresetResult;

    /**
     * Gets the value of the getRealChartPresetResult property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayChart }
     *     
     */
    public IntradayChart getGetRealChartPresetResult() {
        return getRealChartPresetResult;
    }

    /**
     * Sets the value of the getRealChartPresetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayChart }
     *     
     */
    public void setGetRealChartPresetResult(IntradayChart value) {
        this.getRealChartPresetResult = value;
    }

}
