
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
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "symbol",
    "maximumOrders"
})
@XmlRootElement(name = "GetBookDetails")
public class GetBookDetails {

    @XmlElement(name = "Exchange", required = true)
    protected ECNTypes exchange;
    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "MaximumOrders")
    protected int maximumOrders;

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
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the maximumOrders property.
     * 
     */
    public int getMaximumOrders() {
        return maximumOrders;
    }

    /**
     * Sets the value of the maximumOrders property.
     * 
     */
    public void setMaximumOrders(int value) {
        this.maximumOrders = value;
    }

}
