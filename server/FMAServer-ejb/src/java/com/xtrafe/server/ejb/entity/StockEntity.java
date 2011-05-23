package com.xtrafe.server.ejb.entity;

import com.xtrafe.server.ejb.wsxjax.Stock;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@NamedQueries({
    @NamedQuery(name="StockEntity.findAll",
                query="SELECT e FROM StockEntity e"),
    @NamedQuery(name="StockEntity.findBySymbol",
                query="SELECT e FROM StockEntity e WHERE e.symbol = :symbol")
})
@Entity
public class StockEntity implements Serializable {
    private static final long serialVersionUID = 1L;        
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    private double previous;
    
    private String percentageChange;
    
    private String symbol;
    
    @OneToMany (mappedBy = "stockEntity")
    private Collection<TickDayEntity> tickDays;
    
    public void sync(Stock stock){        
        this.name = stock.getName();
        this.symbol = stock.getSymbol();
        this.percentageChange = stock.getPercentageChange();
        if (stock.getLast() != null)
            this.previous = stock.getLast().doubleValue();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPercentageChange() {
        return percentageChange;
    }
    
    public void setPercentageChange(String percentChange){
        this.percentageChange = percentChange;
    }
    
    public double getPrevious() {
        return previous;
    }
    
    public void setPrevious(double price) {
        this.previous = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Collection<TickDayEntity> getTickDays() {
        return tickDays;
    }

    public void setTickDays(Collection<TickDayEntity> tickDays) {
        this.tickDays = tickDays;
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
        if (!(object instanceof StockEntity)) {
            return false;
        }
        StockEntity other = (StockEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.xtrafe.server.ejb.entity.StockEntity[ id=" + id + " ]";
    }
    
}
