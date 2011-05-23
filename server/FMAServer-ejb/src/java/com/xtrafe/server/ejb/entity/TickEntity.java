/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtrafe.server.ejb.entity;

import com.xtrafe.server.ejb.wsxjax.Stock;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
    @NamedQuery(name="TickEntity.findTickForTime", 
                query="SELECT e FROM TickEntity e WHERE e.tickTime = :time AND e.tickDayEntity = :tickDayEntity"),
    @NamedQuery(name="TickEntity.findAllTicksForDay",
                query="SELECT e FROM TickEntity e WHERE e.tickDayEntity = :tickDayEntity ORDER BY e.tickTime DESC")    
})
@Entity
public class TickEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private double change;
    
    private double high;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;   
    
    private double low;
    
    private double previous;        
    
    private String percentageChange;
    
    @Temporal(TemporalType.TIME)
    private Calendar tickTime;
    
    @ManyToOne
    private TickDayEntity tickDayEntity;
    
    private long volume;

    public static Calendar timeFromTimeString(String timeString){
        Calendar calendar = Calendar.getInstance();
        String parts[] = timeString.split(":");
        if (parts.length < 2)
            return null;
        
        int hour = Integer.valueOf(parts[0]);                
        int min = Integer.valueOf(parts[1].substring(0,2));        
        if (parts[1].toLowerCase().contains("pm"))
            hour = (hour == 12) ? hour : hour + 12;
        calendar.clear();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, min);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }
    
    public void sync(Stock stock, TickDayEntity tickDayEntity){
        if (stock.getChange() != null)
            this.change = stock.getChange().doubleValue();
        if (stock.getHigh() != null)
            this.high = stock.getHigh().doubleValue();
        if (stock.getLow() != null)
            this.low = stock.getLow().doubleValue();
        if (stock.getLast() != null)
            this.previous = stock.getLast().doubleValue();        
        this.percentageChange = stock.getPercentageChange();
        this.tickTime = timeFromTimeString(stock.getTime());        
        this.volume = stock.getVolume();
        
        this.tickDayEntity = tickDayEntity;
    }
    
    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
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

    public TickDayEntity getTickDayEntity() {
        return tickDayEntity;
    }

    public void setTickDayEntity(TickDayEntity tickDayEntity) {
        this.tickDayEntity = tickDayEntity;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TickEntity)) {
            return false;
        }
        TickEntity other = (TickEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.xtrafe.server.ejb.entity.TickEntity[ id=" + id + " ]";
    }
    
}
