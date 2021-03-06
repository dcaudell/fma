package com.xtrafe.server.ejb.entity;

import com.xtrafe.server.ejb.wsxjax.Stock;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
    @NamedQuery(name="TickDayEntity.findTickDayForStock", 
                query="SELECT e FROM TickDayEntity e WHERE e.tickDayDate = :date AND e.stockEntity = :stockEntity"),
    @NamedQuery(name="TickDayEntity.findAllDaysForStock", 
                query="SELECT e FROM TickDayEntity e WHERE e.stockEntity = :stockEntity ORDER BY e.tickDayDate DESC")
})
@Entity
public class TickDayEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String annRange;
    
    private double earns;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String mktCap;
    
    private double dayOpen;
    
    private double peRatio;
    
    private double previousClose;
    
    @ManyToOne
    private StockEntity stockEntity;
        
    @Temporal(TemporalType.DATE)
    private Calendar tickDayDate;        

    @OneToMany (mappedBy = "tickDayEntity")
    private Collection<TickEntity> ticks;
    
    public static Calendar dateFromDateString(String dateString){        
        String[] dateParts = dateString.split("/");
        if (dateParts.length < 3)
            return null;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.valueOf(dateParts[2]), 
                     Integer.valueOf(dateParts[0]) - 1,
                     Integer.valueOf(dateParts[1]));
        return calendar;
    }
    
    public void sync(Stock stock, StockEntity stockEntity){
        this.annRange = stock.getAnnRange();
        if (stock.getEarns() != null)
            this.earns = stock.getEarns().doubleValue();
        this.mktCap = stock.getMktCap();
        if (stock.getPE() != null)
            this.peRatio = stock.getPE().doubleValue();
        if (stock.getPreviousClose() != null)
            this.previousClose = stock.getPreviousClose().doubleValue();
        if (stock.getOpen() != null)
            this.dayOpen = stock.getOpen().doubleValue();
        this.tickDayDate = dateFromDateString(stock.getDate());
        setStockEntity(stockEntity);
    }    
    
    public String getAnnRange() {
        return annRange;
    }

    public void setAnnRange(String annRange) {
        this.annRange = annRange;
    }

    public double getEarns() {
        return earns;
    }

    public void setEarns(double earns) {
        this.earns = earns;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMktCap() {
        return mktCap;
    }

    public void setMktCap(String mktCap) {
        this.mktCap = mktCap;
    }
    
    public double getDayOpen() {
        return dayOpen;
    }
    
    public void setDayOpen(double dayOpen){
        this.dayOpen = dayOpen;
    }

    public double getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(double peRatio) {
        this.peRatio = peRatio;
    }

    public double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(double previousClose) {
        this.previousClose = previousClose;
    }

    public StockEntity getStockEntity() {
        return stockEntity;
    }

    public void setStockEntity(StockEntity stockEntity) {
        this.stockEntity = stockEntity;
    }

    public Calendar getTickDayDate() {
        return tickDayDate;
    }

    public void setTickDayDate(Calendar tickDayDate) {
        this.tickDayDate = tickDayDate;
    }

    public Collection<TickEntity> getTicks() {
        return ticks;
    }

    public void setTicks(Collection<TickEntity> ticks) {
        this.ticks = ticks;
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
        if (!(object instanceof TickDayEntity)) {
            return false;
        }
        TickDayEntity other = (TickDayEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.xtrafe.server.ejb.entity.TickDayEntity[ id=" + id + " ]";
    }
    
}
