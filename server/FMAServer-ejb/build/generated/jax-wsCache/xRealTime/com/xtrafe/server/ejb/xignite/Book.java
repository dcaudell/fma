
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Book complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Book">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bids" type="{http://www.xignite.com/services/}ArrayOfOrderSummary" minOccurs="0"/>
 *         &lt;element name="Asks" type="{http://www.xignite.com/services/}ArrayOfOrderSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Book", propOrder = {
    "symbol",
    "bids",
    "asks"
})
public class Book
    extends Common
{

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "Bids")
    protected ArrayOfOrderSummary bids;
    @XmlElement(name = "Asks")
    protected ArrayOfOrderSummary asks;

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
     * Gets the value of the bids property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderSummary }
     *     
     */
    public ArrayOfOrderSummary getBids() {
        return bids;
    }

    /**
     * Sets the value of the bids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderSummary }
     *     
     */
    public void setBids(ArrayOfOrderSummary value) {
        this.bids = value;
    }

    /**
     * Gets the value of the asks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderSummary }
     *     
     */
    public ArrayOfOrderSummary getAsks() {
        return asks;
    }

    /**
     * Sets the value of the asks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderSummary }
     *     
     */
    public void setAsks(ArrayOfOrderSummary value) {
        this.asks = value;
    }

}
