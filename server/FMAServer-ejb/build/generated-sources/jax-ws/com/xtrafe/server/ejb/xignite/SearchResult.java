
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Change" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Quote" type="{http://www.xignite.com/services/}RealTimeQuote" minOccurs="0"/>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="SharesOutstanding" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MarketCap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChange" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastYearClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="YTDPercentChange" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OneYearClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OneYearPercentChange" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResult", propOrder = {
    "change",
    "quote",
    "security",
    "sharesOutstanding",
    "marketCap",
    "last",
    "lastClose",
    "percentChange",
    "lastYearClose",
    "ytdPercentChange",
    "oneYearClose",
    "oneYearPercentChange"
})
public class SearchResult
    extends Common
{

    @XmlElement(name = "Change")
    protected double change;
    @XmlElement(name = "Quote")
    protected RealTimeQuote quote;
    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "SharesOutstanding")
    protected double sharesOutstanding;
    @XmlElement(name = "MarketCap")
    protected double marketCap;
    @XmlElement(name = "Last")
    protected double last;
    @XmlElement(name = "LastClose")
    protected double lastClose;
    @XmlElement(name = "PercentChange")
    protected double percentChange;
    @XmlElement(name = "LastYearClose")
    protected double lastYearClose;
    @XmlElement(name = "YTDPercentChange")
    protected double ytdPercentChange;
    @XmlElement(name = "OneYearClose")
    protected double oneYearClose;
    @XmlElement(name = "OneYearPercentChange")
    protected double oneYearPercentChange;

    /**
     * Gets the value of the change property.
     * 
     */
    public double getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     */
    public void setChange(double value) {
        this.change = value;
    }

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeQuote }
     *     
     */
    public RealTimeQuote getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeQuote }
     *     
     */
    public void setQuote(RealTimeQuote value) {
        this.quote = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setSecurity(Security value) {
        this.security = value;
    }

    /**
     * Gets the value of the sharesOutstanding property.
     * 
     */
    public double getSharesOutstanding() {
        return sharesOutstanding;
    }

    /**
     * Sets the value of the sharesOutstanding property.
     * 
     */
    public void setSharesOutstanding(double value) {
        this.sharesOutstanding = value;
    }

    /**
     * Gets the value of the marketCap property.
     * 
     */
    public double getMarketCap() {
        return marketCap;
    }

    /**
     * Sets the value of the marketCap property.
     * 
     */
    public void setMarketCap(double value) {
        this.marketCap = value;
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
     * Gets the value of the lastClose property.
     * 
     */
    public double getLastClose() {
        return lastClose;
    }

    /**
     * Sets the value of the lastClose property.
     * 
     */
    public void setLastClose(double value) {
        this.lastClose = value;
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
     * Gets the value of the lastYearClose property.
     * 
     */
    public double getLastYearClose() {
        return lastYearClose;
    }

    /**
     * Sets the value of the lastYearClose property.
     * 
     */
    public void setLastYearClose(double value) {
        this.lastYearClose = value;
    }

    /**
     * Gets the value of the ytdPercentChange property.
     * 
     */
    public double getYTDPercentChange() {
        return ytdPercentChange;
    }

    /**
     * Sets the value of the ytdPercentChange property.
     * 
     */
    public void setYTDPercentChange(double value) {
        this.ytdPercentChange = value;
    }

    /**
     * Gets the value of the oneYearClose property.
     * 
     */
    public double getOneYearClose() {
        return oneYearClose;
    }

    /**
     * Sets the value of the oneYearClose property.
     * 
     */
    public void setOneYearClose(double value) {
        this.oneYearClose = value;
    }

    /**
     * Gets the value of the oneYearPercentChange property.
     * 
     */
    public double getOneYearPercentChange() {
        return oneYearPercentChange;
    }

    /**
     * Sets the value of the oneYearPercentChange property.
     * 
     */
    public void setOneYearPercentChange(double value) {
        this.oneYearPercentChange = value;
    }

}
