package com.xtrafe.server.ejb;

import com.xtrafe.fma.shared.SharedStock;
import com.xtrafe.fma.shared.SharedStockDetail;
import com.xtrafe.fma.shared.SharedStockList;
import com.xtrafe.fma.shared.SharedSymbol;
import com.xtrafe.fma.shared.SharedSymbolFilterType;
import com.xtrafe.fma.shared.SharedSymbolList;
import com.xtrafe.server.ejb.entity.StockEntity;
import com.xtrafe.server.ejb.entity.SymbolEntity;
import com.xtrafe.server.ejb.entity.TickDayEntity;
import com.xtrafe.server.ejb.entity.TickEntity;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class DAOForStocks {
    
    @PersistenceContext
    EntityManager em;
    
    public SharedStockList getAllStocks() {
        SharedStockList sharedStockList = new SharedStockList();
        TypedQuery<StockEntity> findStocks = em.createNamedQuery("StockEntity.findAll", StockEntity.class);
        List<StockEntity> stocks = findStocks.getResultList();
        for (StockEntity stock : stocks){
            SharedStock sharedStock = new SharedStock();
            sharedStock.setFrom(stock);
            sharedStockList.add(sharedStock);
        }
        return sharedStockList;
    }
    
    public SharedSymbolList getSymbols(SharedSymbolFilterType filterType, String filterString){
        if (filterType == null)
            filterType = SharedSymbolFilterType.NONE;
        SharedSymbolList sharedSymbolList = new SharedSymbolList();
                
        TypedQuery<StockEntity> findStocks;
        TypedQuery<SymbolEntity> findSymbols;
        List<StockEntity> stocks;
        List<SymbolEntity> symbols;
        switch (filterType) {
            case COMPANY:
                findStocks = em.createNamedQuery("StockEntities.findAll", StockEntity.class);
                stocks = findStocks.getResultList();
                for (StockEntity stock : stocks){
                    if (!stock.getName().contains(filterString))
                        continue;
                    SharedSymbol sharedSymbol = new SharedSymbol();
                    sharedSymbol.setSymbol(stock.getSymbol());
                    sharedSymbolList.add(sharedSymbol);
                }
                break;
            
            case SYMBOL:
                findSymbols = em.createNamedQuery("SymbolEntity.findAll", SymbolEntity.class);
                symbols = findSymbols.getResultList();
                for (SymbolEntity symbol : symbols){
                    if (!symbol.getSymbol().contains(filterString))
                        continue;
                    SharedSymbol sharedSymbol = new SharedSymbol();
                    sharedSymbol.setSymbol(symbol.getSymbol());
                    sharedSymbolList.add(sharedSymbol);
                }
                break;
            
            default:
                findSymbols = em.createNamedQuery("SymbolEntity.findAll", SymbolEntity.class);
                symbols = findSymbols.getResultList();
                for (SymbolEntity symbol : symbols){
                    SharedSymbol sharedSymbol = new SharedSymbol();
                    sharedSymbol.setSymbol(symbol.getSymbol());
                    sharedSymbolList.add(sharedSymbol);
                }
        }
        
        return sharedSymbolList;
    }
    
    public SharedStockDetail getStock(String symbol) {
        SharedStockDetail stock = new SharedStockDetail();
                        
        TypedQuery<StockEntity> findStockQuery = em.createNamedQuery("StockEntity.findBySymbol", StockEntity.class);
        findStockQuery.setParameter("symbol", symbol);            
        List<StockEntity> stockEntities = findStockQuery.getResultList();
        if (stockEntities.size() < 1)
            return stock;
        StockEntity stockEntity = stockEntities.get(0);
        
        stock.setFrom(stockEntity);         

        TypedQuery<TickDayEntity> findTickDayQuery = em.createNamedQuery("TickDayEntity.findAllDaysForStock", TickDayEntity.class);
        findTickDayQuery.setParameter("stockEntity", stockEntity);
        findTickDayQuery.setMaxResults(1);
        List<TickDayEntity> tickDayEntities = findTickDayQuery.getResultList();
        if (tickDayEntities.size() < 1)
            return stock;
        TickDayEntity tickDayEntity = tickDayEntities.get(0);

        stock.setFrom(tickDayEntity);
        
        TypedQuery<TickEntity> findTickEntity = em.createNamedQuery("TickEntity.findAllTicksForDay", TickEntity.class);
        findTickEntity.setParameter("tickDayEntity", tickDayEntity);
        findTickEntity.setMaxResults(1);
        List<TickEntity> tickEntities = findTickEntity.getResultList();
        if (tickEntities.size() < 1)
            return stock;
        TickEntity tickEntity = tickEntities.get(0);

        stock.setFrom(tickEntity);
                
        return stock;
    }            
}
