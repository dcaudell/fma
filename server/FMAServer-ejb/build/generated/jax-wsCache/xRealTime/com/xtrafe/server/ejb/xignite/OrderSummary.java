
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Filled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cancelled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Unfilled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderSummary", propOrder = {
    "price",
    "ordered",
    "filled",
    "cancelled",
    "unfilled",
    "rank"
})
public class OrderSummary {

    @XmlElement(name = "Price")
    protected double price;
    @XmlElement(name = "Ordered")
    protected int ordered;
    @XmlElement(name = "Filled")
    protected int filled;
    @XmlElement(name = "Cancelled")
    protected int cancelled;
    @XmlElement(name = "Unfilled")
    protected int unfilled;
    @XmlElement(name = "Rank")
    protected int rank;

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the ordered property.
     * 
     */
    public int getOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     */
    public void setOrdered(int value) {
        this.ordered = value;
    }

    /**
     * Gets the value of the filled property.
     * 
     */
    public int getFilled() {
        return filled;
    }

    /**
     * Sets the value of the filled property.
     * 
     */
    public void setFilled(int value) {
        this.filled = value;
    }

    /**
     * Gets the value of the cancelled property.
     * 
     */
    public int getCancelled() {
        return cancelled;
    }

    /**
     * Sets the value of the cancelled property.
     * 
     */
    public void setCancelled(int value) {
        this.cancelled = value;
    }

    /**
     * Gets the value of the unfilled property.
     * 
     */
    public int getUnfilled() {
        return unfilled;
    }

    /**
     * Sets the value of the unfilled property.
     * 
     */
    public void setUnfilled(int value) {
        this.unfilled = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

}
