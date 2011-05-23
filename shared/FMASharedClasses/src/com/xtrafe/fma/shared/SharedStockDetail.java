package com.xtrafe.fma.shared;

import java.util.Calendar;

public class SharedStockDetail 
    extends SharedObjBase
{    
    private String name;            
    private String symbol;
    private String annRange;    
    private double earns;            
    private String mktCap;    
    private double peRatio;    
    private double previousClose;
    private double dayOpen;
    private double change;    
    private double high;            
    private double low;    
    private double previous;            
    private String percentageChange;       
    private Calendar tickTime;
    private Calendar tickDayDate;
    private long volume;

    public String getAnnRange() {
        return annRange;
    }

    public void setAnnRange(String annRange) {
        this.annRange = annRange;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getDayOpen() {
        return dayOpen;
    }

    public void setDayOpen(double dayOpen) {
        this.dayOpen = dayOpen;
    }

    public double getEarns() {
        return earns;
    }

    public void setEarns(double earns) {
        this.earns = earns;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public String getMktCap() {
        return mktCap;
    }

    public void setMktCap(String mktCap) {
        this.mktCap = mktCap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(double peRatio) {
        this.peRatio = peRatio;
    }

    public String getPercentageChange() {
        return percentageChange;
    }

    public void setPercentageChange(String percentageChange) {
        this.percentageChange = percentageChange;
    }

    public double getPrevious() {
        return previous;
    }

    public void setPrevious(double previous) {
        this.previous = previous;
    }

    public double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(double previousClose) {
        this.previousClose = previousClose;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Calendar getTickDayDate() {
        return tickDayDate;
    }

    public void setTickDayDate(Calendar tickDayDate) {
        this.tickDayDate = tickDayDate;
    }

    public Calendar getTickTime() {
        return tickTime;
    }

    public void setTickTime(Calendar tickTime) {
        this.tickTime = tickTime;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }                            
}
