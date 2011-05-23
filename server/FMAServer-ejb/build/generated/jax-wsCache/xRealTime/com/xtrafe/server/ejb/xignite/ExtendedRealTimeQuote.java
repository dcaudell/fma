
package com.xtrafe.server.ejb.xignite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedRealTimeQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedRealTimeQuote">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastQuantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastTradeType" type="{http://www.xignite.com/services/}OrderTypes"/>
 *         &lt;element name="LastTradeDirection" type="{http://www.xignite.com/services/}DirectionTypes"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ECNVolume" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastMarketClosePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromLastMarketClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChangeFromLastMarketClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LastClosePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromLastClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChangeFromLastClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OpenPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromOpen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChangeFromOpen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MarketOpenPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromMarketOpen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChangeFromMarketOpen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MarketClosePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromMarketClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChangeFromMarketClose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PreviousTradePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ChangeFromPreviousTrade" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PercentChangeFromPreviousTrade" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BidPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BidQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BidTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bids" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BidVolume" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AverageBid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AskPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AskQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AskTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AverageAsk" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AskVolume" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Spread" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Highest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="HighestTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lowest" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LowestTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalCancellations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalExecutions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalQuantityOrdered" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalQuantityExecuted" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalQuantityCancelled" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AverageOrderSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AverageExecutionSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SharesOutstanding" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MarketCap" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedRealTimeQuote", propOrder = {
    "symbol",
    "cusip",
    "cik",
    "name",
    "lastPrice",
    "lastQuantity",
    "lastTradeType",
    "lastTradeDirection",
    "date",
    "time",
    "volume",
    "ecnVolume",
    "lastMarketClosePrice",
    "changeFromLastMarketClose",
    "percentChangeFromLastMarketClose",
    "lastClosePrice",
    "changeFromLastClose",
    "percentChangeFromLastClose",
    "openPrice",
    "changeFromOpen",
    "percentChangeFromOpen",
    "marketOpenPrice",
    "changeFromMarketOpen",
    "percentChangeFromMarketOpen",
    "marketClosePrice",
    "changeFromMarketClose",
    "percentChangeFromMarketClose",
    "previousTradePrice",
    "changeFromPreviousTrade",
    "percentChangeFromPreviousTrade",
    "bidPrice",
    "bidQuantity",
    "bidTime",
    "bids",
    "bidVolume",
    "averageBid",
    "askPrice",
    "askQuantity",
    "askTime",
    "asks",
    "averageAsk",
    "askVolume",
    "spread",
    "highest",
    "highestTime",
    "lowest",
    "lowestTime",
    "totalOrders",
    "totalCancellations",
    "totalExecutions",
    "totalQuantityOrdered",
    "totalQuantityExecuted",
    "totalQuantityCancelled",
    "averageOrderSize",
    "averageExecutionSize",
    "sharesOutstanding",
    "marketCap"
})
public class ExtendedRealTimeQuote
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
    @XmlElement(name = "LastPrice")
    protected double lastPrice;
    @XmlElement(name = "LastQuantity")
    protected double lastQuantity;
    @XmlElement(name = "LastTradeType", required = true)
    protected OrderTypes lastTradeType;
    @XmlElement(name = "LastTradeDirection", required = true)
    protected DirectionTypes lastTradeDirection;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "Volume")
    protected double volume;
    @XmlElement(name = "ECNVolume")
    protected int ecnVolume;
    @XmlElement(name = "LastMarketClosePrice")
    protected double lastMarketClosePrice;
    @XmlElement(name = "ChangeFromLastMarketClose")
    protected double changeFromLastMarketClose;
    @XmlElement(name = "PercentChangeFromLastMarketClose")
    protected double percentChangeFromLastMarketClose;
    @XmlElement(name = "LastClosePrice")
    protected double lastClosePrice;
    @XmlElement(name = "ChangeFromLastClose")
    protected double changeFromLastClose;
    @XmlElement(name = "PercentChangeFromLastClose")
    protected double percentChangeFromLastClose;
    @XmlElement(name = "OpenPrice")
    protected double openPrice;
    @XmlElement(name = "ChangeFromOpen")
    protected double changeFromOpen;
    @XmlElement(name = "PercentChangeFromOpen")
    protected double percentChangeFromOpen;
    @XmlElement(name = "MarketOpenPrice")
    protected double marketOpenPrice;
    @XmlElement(name = "ChangeFromMarketOpen")
    protected double changeFromMarketOpen;
    @XmlElement(name = "PercentChangeFromMarketOpen")
    protected double percentChangeFromMarketOpen;
    @XmlElement(name = "MarketClosePrice")
    protected double marketClosePrice;
    @XmlElement(name = "ChangeFromMarketClose")
    protected double changeFromMarketClose;
    @XmlElement(name = "PercentChangeFromMarketClose")
    protected double percentChangeFromMarketClose;
    @XmlElement(name = "PreviousTradePrice")
    protected double previousTradePrice;
    @XmlElement(name = "ChangeFromPreviousTrade")
    protected double changeFromPreviousTrade;
    @XmlElement(name = "PercentChangeFromPreviousTrade")
    protected double percentChangeFromPreviousTrade;
    @XmlElement(name = "BidPrice")
    protected double bidPrice;
    @XmlElement(name = "BidQuantity")
    protected int bidQuantity;
    @XmlElement(name = "BidTime")
    protected String bidTime;
    @XmlElement(name = "Bids")
    protected int bids;
    @XmlElement(name = "BidVolume")
    protected int bidVolume;
    @XmlElement(name = "AverageBid")
    protected double averageBid;
    @XmlElement(name = "AskPrice")
    protected double askPrice;
    @XmlElement(name = "AskQuantity")
    protected int askQuantity;
    @XmlElement(name = "AskTime")
    protected String askTime;
    @XmlElement(name = "Asks")
    protected int asks;
    @XmlElement(name = "AverageAsk")
    protected double averageAsk;
    @XmlElement(name = "AskVolume")
    protected int askVolume;
    @XmlElement(name = "Spread")
    protected double spread;
    @XmlElement(name = "Highest")
    protected double highest;
    @XmlElement(name = "HighestTime")
    protected String highestTime;
    @XmlElement(name = "Lowest")
    protected double lowest;
    @XmlElement(name = "LowestTime")
    protected String lowestTime;
    @XmlElement(name = "TotalOrders")
    protected int totalOrders;
    @XmlElement(name = "TotalCancellations")
    protected int totalCancellations;
    @XmlElement(name = "TotalExecutions")
    protected int totalExecutions;
    @XmlElement(name = "TotalQuantityOrdered")
    protected long totalQuantityOrdered;
    @XmlElement(name = "TotalQuantityExecuted")
    protected long totalQuantityExecuted;
    @XmlElement(name = "TotalQuantityCancelled")
    protected long totalQuantityCancelled;
    @XmlElement(name = "AverageOrderSize")
    protected double averageOrderSize;
    @XmlElement(name = "AverageExecutionSize")
    protected double averageExecutionSize;
    @XmlElement(name = "SharesOutstanding")
    protected long sharesOutstanding;
    @XmlElement(name = "MarketCap")
    protected double marketCap;

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
     * Gets the value of the lastPrice property.
     * 
     */
    public double getLastPrice() {
        return lastPrice;
    }

    /**
     * Sets the value of the lastPrice property.
     * 
     */
    public void setLastPrice(double value) {
        this.lastPrice = value;
    }

    /**
     * Gets the value of the lastQuantity property.
     * 
     */
    public double getLastQuantity() {
        return lastQuantity;
    }

    /**
     * Sets the value of the lastQuantity property.
     * 
     */
    public void setLastQuantity(double value) {
        this.lastQuantity = value;
    }

    /**
     * Gets the value of the lastTradeType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderTypes }
     *     
     */
    public OrderTypes getLastTradeType() {
        return lastTradeType;
    }

    /**
     * Sets the value of the lastTradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderTypes }
     *     
     */
    public void setLastTradeType(OrderTypes value) {
        this.lastTradeType = value;
    }

    /**
     * Gets the value of the lastTradeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionTypes }
     *     
     */
    public DirectionTypes getLastTradeDirection() {
        return lastTradeDirection;
    }

    /**
     * Sets the value of the lastTradeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionTypes }
     *     
     */
    public void setLastTradeDirection(DirectionTypes value) {
        this.lastTradeDirection = value;
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
     * Gets the value of the volume property.
     * 
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(double value) {
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
     * Gets the value of the lastMarketClosePrice property.
     * 
     */
    public double getLastMarketClosePrice() {
        return lastMarketClosePrice;
    }

    /**
     * Sets the value of the lastMarketClosePrice property.
     * 
     */
    public void setLastMarketClosePrice(double value) {
        this.lastMarketClosePrice = value;
    }

    /**
     * Gets the value of the changeFromLastMarketClose property.
     * 
     */
    public double getChangeFromLastMarketClose() {
        return changeFromLastMarketClose;
    }

    /**
     * Sets the value of the changeFromLastMarketClose property.
     * 
     */
    public void setChangeFromLastMarketClose(double value) {
        this.changeFromLastMarketClose = value;
    }

    /**
     * Gets the value of the percentChangeFromLastMarketClose property.
     * 
     */
    public double getPercentChangeFromLastMarketClose() {
        return percentChangeFromLastMarketClose;
    }

    /**
     * Sets the value of the percentChangeFromLastMarketClose property.
     * 
     */
    public void setPercentChangeFromLastMarketClose(double value) {
        this.percentChangeFromLastMarketClose = value;
    }

    /**
     * Gets the value of the lastClosePrice property.
     * 
     */
    public double getLastClosePrice() {
        return lastClosePrice;
    }

    /**
     * Sets the value of the lastClosePrice property.
     * 
     */
    public void setLastClosePrice(double value) {
        this.lastClosePrice = value;
    }

    /**
     * Gets the value of the changeFromLastClose property.
     * 
     */
    public double getChangeFromLastClose() {
        return changeFromLastClose;
    }

    /**
     * Sets the value of the changeFromLastClose property.
     * 
     */
    public void setChangeFromLastClose(double value) {
        this.changeFromLastClose = value;
    }

    /**
     * Gets the value of the percentChangeFromLastClose property.
     * 
     */
    public double getPercentChangeFromLastClose() {
        return percentChangeFromLastClose;
    }

    /**
     * Sets the value of the percentChangeFromLastClose property.
     * 
     */
    public void setPercentChangeFromLastClose(double value) {
        this.percentChangeFromLastClose = value;
    }

    /**
     * Gets the value of the openPrice property.
     * 
     */
    public double getOpenPrice() {
        return openPrice;
    }

    /**
     * Sets the value of the openPrice property.
     * 
     */
    public void setOpenPrice(double value) {
        this.openPrice = value;
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
     * Gets the value of the marketOpenPrice property.
     * 
     */
    public double getMarketOpenPrice() {
        return marketOpenPrice;
    }

    /**
     * Sets the value of the marketOpenPrice property.
     * 
     */
    public void setMarketOpenPrice(double value) {
        this.marketOpenPrice = value;
    }

    /**
     * Gets the value of the changeFromMarketOpen property.
     * 
     */
    public double getChangeFromMarketOpen() {
        return changeFromMarketOpen;
    }

    /**
     * Sets the value of the changeFromMarketOpen property.
     * 
     */
    public void setChangeFromMarketOpen(double value) {
        this.changeFromMarketOpen = value;
    }

    /**
     * Gets the value of the percentChangeFromMarketOpen property.
     * 
     */
    public double getPercentChangeFromMarketOpen() {
        return percentChangeFromMarketOpen;
    }

    /**
     * Sets the value of the percentChangeFromMarketOpen property.
     * 
     */
    public void setPercentChangeFromMarketOpen(double value) {
        this.percentChangeFromMarketOpen = value;
    }

    /**
     * Gets the value of the marketClosePrice property.
     * 
     */
    public double getMarketClosePrice() {
        return marketClosePrice;
    }

    /**
     * Sets the value of the marketClosePrice property.
     * 
     */
    public void setMarketClosePrice(double value) {
        this.marketClosePrice = value;
    }

    /**
     * Gets the value of the changeFromMarketClose property.
     * 
     */
    public double getChangeFromMarketClose() {
        return changeFromMarketClose;
    }

    /**
     * Sets the value of the changeFromMarketClose property.
     * 
     */
    public void setChangeFromMarketClose(double value) {
        this.changeFromMarketClose = value;
    }

    /**
     * Gets the value of the percentChangeFromMarketClose property.
     * 
     */
    public double getPercentChangeFromMarketClose() {
        return percentChangeFromMarketClose;
    }

    /**
     * Sets the value of the percentChangeFromMarketClose property.
     * 
     */
    public void setPercentChangeFromMarketClose(double value) {
        this.percentChangeFromMarketClose = value;
    }

    /**
     * Gets the value of the previousTradePrice property.
     * 
     */
    public double getPreviousTradePrice() {
        return previousTradePrice;
    }

    /**
     * Sets the value of the previousTradePrice property.
     * 
     */
    public void setPreviousTradePrice(double value) {
        this.previousTradePrice = value;
    }

    /**
     * Gets the value of the changeFromPreviousTrade property.
     * 
     */
    public double getChangeFromPreviousTrade() {
        return changeFromPreviousTrade;
    }

    /**
     * Sets the value of the changeFromPreviousTrade property.
     * 
     */
    public void setChangeFromPreviousTrade(double value) {
        this.changeFromPreviousTrade = value;
    }

    /**
     * Gets the value of the percentChangeFromPreviousTrade property.
     * 
     */
    public double getPercentChangeFromPreviousTrade() {
        return percentChangeFromPreviousTrade;
    }

    /**
     * Sets the value of the percentChangeFromPreviousTrade property.
     * 
     */
    public void setPercentChangeFromPreviousTrade(double value) {
        this.percentChangeFromPreviousTrade = value;
    }

    /**
     * Gets the value of the bidPrice property.
     * 
     */
    public double getBidPrice() {
        return bidPrice;
    }

    /**
     * Sets the value of the bidPrice property.
     * 
     */
    public void setBidPrice(double value) {
        this.bidPrice = value;
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
     * Gets the value of the bidTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidTime() {
        return bidTime;
    }

    /**
     * Sets the value of the bidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidTime(String value) {
        this.bidTime = value;
    }

    /**
     * Gets the value of the bids property.
     * 
     */
    public int getBids() {
        return bids;
    }

    /**
     * Sets the value of the bids property.
     * 
     */
    public void setBids(int value) {
        this.bids = value;
    }

    /**
     * Gets the value of the bidVolume property.
     * 
     */
    public int getBidVolume() {
        return bidVolume;
    }

    /**
     * Sets the value of the bidVolume property.
     * 
     */
    public void setBidVolume(int value) {
        this.bidVolume = value;
    }

    /**
     * Gets the value of the averageBid property.
     * 
     */
    public double getAverageBid() {
        return averageBid;
    }

    /**
     * Sets the value of the averageBid property.
     * 
     */
    public void setAverageBid(double value) {
        this.averageBid = value;
    }

    /**
     * Gets the value of the askPrice property.
     * 
     */
    public double getAskPrice() {
        return askPrice;
    }

    /**
     * Sets the value of the askPrice property.
     * 
     */
    public void setAskPrice(double value) {
        this.askPrice = value;
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
     * Gets the value of the askTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAskTime() {
        return askTime;
    }

    /**
     * Sets the value of the askTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAskTime(String value) {
        this.askTime = value;
    }

    /**
     * Gets the value of the asks property.
     * 
     */
    public int getAsks() {
        return asks;
    }

    /**
     * Sets the value of the asks property.
     * 
     */
    public void setAsks(int value) {
        this.asks = value;
    }

    /**
     * Gets the value of the averageAsk property.
     * 
     */
    public double getAverageAsk() {
        return averageAsk;
    }

    /**
     * Sets the value of the averageAsk property.
     * 
     */
    public void setAverageAsk(double value) {
        this.averageAsk = value;
    }

    /**
     * Gets the value of the askVolume property.
     * 
     */
    public int getAskVolume() {
        return askVolume;
    }

    /**
     * Sets the value of the askVolume property.
     * 
     */
    public void setAskVolume(int value) {
        this.askVolume = value;
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
     * Gets the value of the highestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighestTime() {
        return highestTime;
    }

    /**
     * Sets the value of the highestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighestTime(String value) {
        this.highestTime = value;
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
     * Gets the value of the lowestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowestTime() {
        return lowestTime;
    }

    /**
     * Sets the value of the lowestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowestTime(String value) {
        this.lowestTime = value;
    }

    /**
     * Gets the value of the totalOrders property.
     * 
     */
    public int getTotalOrders() {
        return totalOrders;
    }

    /**
     * Sets the value of the totalOrders property.
     * 
     */
    public void setTotalOrders(int value) {
        this.totalOrders = value;
    }

    /**
     * Gets the value of the totalCancellations property.
     * 
     */
    public int getTotalCancellations() {
        return totalCancellations;
    }

    /**
     * Sets the value of the totalCancellations property.
     * 
     */
    public void setTotalCancellations(int value) {
        this.totalCancellations = value;
    }

    /**
     * Gets the value of the totalExecutions property.
     * 
     */
    public int getTotalExecutions() {
        return totalExecutions;
    }

    /**
     * Sets the value of the totalExecutions property.
     * 
     */
    public void setTotalExecutions(int value) {
        this.totalExecutions = value;
    }

    /**
     * Gets the value of the totalQuantityOrdered property.
     * 
     */
    public long getTotalQuantityOrdered() {
        return totalQuantityOrdered;
    }

    /**
     * Sets the value of the totalQuantityOrdered property.
     * 
     */
    public void setTotalQuantityOrdered(long value) {
        this.totalQuantityOrdered = value;
    }

    /**
     * Gets the value of the totalQuantityExecuted property.
     * 
     */
    public long getTotalQuantityExecuted() {
        return totalQuantityExecuted;
    }

    /**
     * Sets the value of the totalQuantityExecuted property.
     * 
     */
    public void setTotalQuantityExecuted(long value) {
        this.totalQuantityExecuted = value;
    }

    /**
     * Gets the value of the totalQuantityCancelled property.
     * 
     */
    public long getTotalQuantityCancelled() {
        return totalQuantityCancelled;
    }

    /**
     * Sets the value of the totalQuantityCancelled property.
     * 
     */
    public void setTotalQuantityCancelled(long value) {
        this.totalQuantityCancelled = value;
    }

    /**
     * Gets the value of the averageOrderSize property.
     * 
     */
    public double getAverageOrderSize() {
        return averageOrderSize;
    }

    /**
     * Sets the value of the averageOrderSize property.
     * 
     */
    public void setAverageOrderSize(double value) {
        this.averageOrderSize = value;
    }

    /**
     * Gets the value of the averageExecutionSize property.
     * 
     */
    public double getAverageExecutionSize() {
        return averageExecutionSize;
    }

    /**
     * Sets the value of the averageExecutionSize property.
     * 
     */
    public void setAverageExecutionSize(double value) {
        this.averageExecutionSize = value;
    }

    /**
     * Gets the value of the sharesOutstanding property.
     * 
     */
    public long getSharesOutstanding() {
        return sharesOutstanding;
    }

    /**
     * Sets the value of the sharesOutstanding property.
     * 
     */
    public void setSharesOutstanding(long value) {
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

}
