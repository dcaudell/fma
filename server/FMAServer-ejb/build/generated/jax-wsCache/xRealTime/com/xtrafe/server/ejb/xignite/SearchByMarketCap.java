
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
 *         &lt;element name="Exchange" type="{http://www.xignite.com/services/}ECNTypes"/>
 *         &lt;element name="PercentChange" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MinimumMarketCap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MaximumMarketCap" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "exchange",
    "percentChange",
    "minimumMarketCap",
    "maximumMarketCap"
})
@XmlRootElement(name = "SearchByMarketCap")
public class SearchByMarketCap {

    @XmlElement(name = "Exchange", required = true)
    protected ECNTypes exchange;
    @XmlElement(name = "PercentChange")
    protected double percentChange;
    @XmlElement(name = "MinimumMarketCap")
    protected double minimumMarketCap;
    @XmlElement(name = "MaximumMarketCap")
    protected double maximumMarketCap;

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link ECNTypes }
     *     
     */
    public ECNTypes getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECNTypes }
     *     
     */
    public void setExchange(ECNTypes value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the percentChange property.
     * 
     */
    public double getPercentChange() {
        return percentChange;
    }

    /**
     * Sets the value of the percentChange property.
     * 
     */
    public void setPercentChange(double value) {
        this.percentChange = value;
    }

    /**
     * Gets the value of the minimumMarketCap property.
     * 
     */
    public double getMinimumMarketCap() {
        return minimumMarketCap;
    }

    /**
     * Sets the value of the minimumMarketCap property.
     * 
     */
    public void setMinimumMarketCap(double value) {
        this.minimumMarketCap = value;
    }

    /**
     * Gets the value of the maximumMarketCap property.
     * 
     */
    public double getMaximumMarketCap() {
        return maximumMarketCap;
    }

    /**
     * Sets the value of the maximumMarketCap property.
     * 
     */
    public void setMaximumMarketCap(double value) {
        this.maximumMarketCap = value;
    }

}
