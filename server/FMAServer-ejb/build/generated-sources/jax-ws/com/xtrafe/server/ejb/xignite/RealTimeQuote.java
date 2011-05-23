
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealTimeQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealTimeQuote">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChangeFromPrevious" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChangeFromPrevious" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Open" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromOpen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChangeFromOpen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ask" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Spread" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BidQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AskQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ECNVolume" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Highest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Lowest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealTimeQuote", propOrder = {
    "symbol",
    "cusip",
    "cik",
    "name",
    "date",
    "time",
    "last",
    "quantity",
    "changeFromPrevious",
    "percentChangeFromPrevious",
    "open",
    "changeFromOpen",
    "percentChangeFromOpen",
    "bid",
    "ask",
    "spread",
    "bidQuantity",
    "askQuantity",
    "volume",
    "ecnVolume",
    "highest",
    "lowest",
    "rank"
})
public class RealTimeQuote
    extends Common
{

    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "CUSIP")
    protected String cusip;
    @XmlElement(name = "CIK")
    protected String cik;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "Last")
    protected double last;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "ChangeFromPrevious")
    protected double changeFromPrevious;
    @XmlElement(name = "PercentChangeFromPrevious")
    protected double percentChangeFromPrevious;
    @XmlElement(name = "Open")
    protected double open;
    @XmlElement(name = "ChangeFromOpen")
    protected double changeFromOpen;
    @XmlElement(name = "PercentChangeFromOpen")
    protected double percentChangeFromOpen;
    @XmlElement(name = "Bid")
    protected double bid;
    @XmlElement(name = "Ask")
    protected double ask;
    @XmlElement(name = "Spread")
    protected double spread;
    @XmlElement(name = "BidQuantity")
    protected int bidQuantity;
    @XmlElement(name = "AskQuantity")
    protected int askQuantity;
    @XmlElement(name = "Volume")
    protected int volume;
    @XmlElement(name = "ECNVolume")
    protected int ecnVolume;
    @XmlElement(name = "Highest")
    protected double highest;
    @XmlElement(name = "Lowest")
    protected double lowest;
    @XmlElement(name = "Rank")
    protected String rank;

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
     * Gets the value of the cusip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSIP() {
        return cusip;
    }

    /**
     * Sets the value of the cusip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSIP(String value) {
        this.cusip = value;
    }

    /**
     * Gets the value of the cik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIK() {
        return cik;
    }

    /**
     * Sets the value of the cik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIK(String value) {
        this.cik = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the last property.
     * 
     */
    public double getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     */
    public void setLast(double value) {
        this.last = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the changeFromPrevious property.
     * 
     */
    public double getChangeFromPrevious() {
        return changeFromPrevious;
    }

    /**
     * Sets the value of the changeFromPrevious property.
     * 
     */
    public void setChangeFromPrevious(double value) {
        this.changeFromPrevious = value;
    }

    /**
     * Gets the value of the percentChangeFromPrevious property.
     * 
     */
    public double getPercentChangeFromPrevious() {
        return percentChangeFromPrevious;
    }

    /**
     * Sets the value of the percentChangeFromPrevious property.
     * 
     */
    public void setPercentChangeFromPrevious(double value) {
        this.percentChangeFromPrevious = value;
    }

    /**
     * Gets the value of the open property.
     * 
     */
    public double getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     */
    public void setOpen(double value) {
        this.open = value;
    }

    /**
     * Gets the value of the changeFromOpen property.
     * 
     */
    public double getChangeFromOpen() {
        return changeFromOpen;
    }

    /**
     * Sets the value of the changeFromOpen property.
     * 
     */
    public void setChangeFromOpen(double value) {
        this.changeFromOpen = value;
    }

    /**
     * Gets the value of the percentChangeFromOpen property.
     * 
     */
    public double getPercentChangeFromOpen() {
        return percentChangeFromOpen;
    }

    /**
     * Sets the value of the percentChangeFromOpen property.
     * 
     */
    public void setPercentChangeFromOpen(double value) {
        this.percentChangeFromOpen = value;
    }

    /**
     * Gets the value of the bid property.
     * 
     */
    public double getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     */
    public void setBid(double value) {
        this.bid = value;
    }

    /**
     * Gets the value of the ask property.
     * 
     */
    public double getAsk() {
        return ask;
    }

    /**
     * Sets the value of the ask property.
     * 
     */
    public void setAsk(double value) {
        this.ask = value;
    }

    /**
     * Gets the value of the spread property.
     * 
     */
    public double getSpread() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     */
    public void setSpread(double value) {
        this.spread = value;
    }

    /**
     * Gets the value of the bidQuantity property.
     * 
     */
    public int getBidQuantity() {
        return bidQuantity;
    }

    /**
     * Sets the value of the bidQuantity property.
     * 
     */
    public void setBidQuantity(int value) {
        this.bidQuantity = value;
    }

    /**
     * Gets the value of the askQuantity property.
     * 
     */
    public int getAskQuantity() {
        return askQuantity;
    }

    /**
     * Sets the value of the askQuantity property.
     * 
     */
    public void setAskQuantity(int value) {
        this.askQuantity = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(int value) {
        this.volume = value;
    }

    /**
     * Gets the value of the ecnVolume property.
     * 
     */
    public int getECNVolume() {
        return ecnVolume;
    }

    /**
     * Sets the value of the ecnVolume property.
     * 
     */
    public void setECNVolume(int value) {
        this.ecnVolume = value;
    }

    /**
     * Gets the value of the highest property.
     * 
     */
    public double getHighest() {
        return highest;
    }

    /**
     * Sets the value of the highest property.
     * 
     */
    public void setHighest(double value) {
        this.highest = value;
    }

    /**
     * Gets the value of the lowest property.
     * 
     */
    public double getLowest() {
        return lowest;
    }

    /**
     * Sets the value of the lowest property.
     * 
     */
    public void setLowest(double value) {
        this.lowest = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

}
