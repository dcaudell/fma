//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.20 at 01:42:00 AM CDT 
//


package com.xtrafe.server.ejb.wsxjax;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Symbol" type="{}symbol"/>
 *         &lt;element name="Last" type="{}last"/>
 *         &lt;element name="Date" type="{}date"/>
 *         &lt;element name="Time" type="{}time"/>
 *         &lt;element name="Change" type="{}change"/>
 *         &lt;element name="Open" type="{}open"/>
 *         &lt;element name="High" type="{}high"/>
 *         &lt;element name="Low" type="{}low"/>
 *         &lt;element name="Volume" type="{}volume"/>
 *         &lt;element name="MktCap" type="{}mktcap"/>
 *         &lt;element name="PreviousClose" type="{}previousclose"/>
 *         &lt;element name="PercentageChange" type="{}percentagechange"/>
 *         &lt;element name="AnnRange" type="{}annrange"/>
 *         &lt;element name="Earns" type="{}earns"/>
 *         &lt;element name="P-E" type="{}pe"/>
 *         &lt;element name="Name" type="{}name"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stock", propOrder = {
    "symbol",
    "last",
    "date",
    "time",
    "change",
    "open",
    "high",
    "low",
    "volume",
    "mktCap",
    "previousClose",
    "percentageChange",
    "annRange",
    "earns",
    "pe",
    "name"
})
public class Stock {

    @XmlElement(name = "Symbol", required = true)
    protected String symbol;
    @XmlElement(name = "Last", required = true)
    protected BigDecimal last;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "Time", required = true)
    protected String time;
    @XmlElement(name = "Change", required = true)
    protected BigDecimal change;
    @XmlElement(name = "Open", required = true)
    protected BigDecimal open;
    @XmlElement(name = "High", required = true)
    protected BigDecimal high;
    @XmlElement(name = "Low", required = true)
    protected BigDecimal low;
    @XmlElement(name = "Volume")
    protected long volume;
    @XmlElement(name = "MktCap", required = true)
    protected String mktCap;
    @XmlElement(name = "PreviousClose", required = true)
    protected BigDecimal previousClose;
    @XmlElement(name = "PercentageChange", required = true)
    protected String percentageChange;
    @XmlElement(name = "AnnRange", required = true)
    protected String annRange;
    @XmlElement(name = "Earns", required = true)
    protected BigDecimal earns;
    @XmlElement(name = "P-E", required = true)
    protected String pe;
    @XmlElement(name = "Name", required = true)
    protected String name;

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
     * Gets the value of the last property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLast(BigDecimal value) {
        this.last = value;
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
     * Gets the value of the change property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChange(BigDecimal value) {
        this.change = value;
    }

    /**
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpen(BigDecimal value) {
        this.open = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHigh(BigDecimal value) {
        this.high = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLow(BigDecimal value) {
        this.low = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public long getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(long value) {
        this.volume = value;
    }

    /**
     * Gets the value of the mktCap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktCap() {
        return mktCap;
    }

    /**
     * Sets the value of the mktCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktCap(String value) {
        this.mktCap = value;
    }

    /**
     * Gets the value of the previousClose property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousClose() {
        return previousClose;
    }

    /**
     * Sets the value of the previousClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousClose(BigDecimal value) {
        this.previousClose = value;
    }

    /**
     * Gets the value of the percentageChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageChange() {
        return percentageChange;
    }

    /**
     * Sets the value of the percentageChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageChange(String value) {
        this.percentageChange = value;
    }

    /**
     * Gets the value of the annRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnRange() {
        return annRange;
    }

    /**
     * Sets the value of the annRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnRange(String value) {
        this.annRange = value;
    }

    /**
     * Gets the value of the earns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEarns() {
        return earns;
    }

    /**
     * Sets the value of the earns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEarns(BigDecimal value) {
        this.earns = value;
    }

    /**
     * Gets the value of the pe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPE() {
        return pe;
    }

    /**
     * Sets the value of the pe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPE(String value) {
        this.pe = value;
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

}