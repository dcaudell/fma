package com.xtrafe.server.ejb;

import com.xtrafe.server.ejb.entity.StockEntity;
import com.xtrafe.server.ejb.entity.SymbolEntity;
import com.xtrafe.server.ejb.entity.TickDayEntity;
import com.xtrafe.server.ejb.entity.TickEntity;
import com.xtrafe.server.ejb.webservicex.StockQuote;
import com.xtrafe.server.ejb.webservicex.StockQuoteSoap;
import com.xtrafe.server.ejb.wsxjax.Stock;
import com.xtrafe.server.ejb.wsxjax.StockQuotes;

import com.xtrafe.server.log.Log;
import java.io.StringReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Status;
import javax.transaction.Transaction;
import javax.transaction.UserTransaction;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@Singleton
public class WebserviceXQueryDaemon extends BaseQueryDaemon {

    private static final String unitName = "StockService";                
    
    @Resource
    UserTransaction trans;
    
    StockQuote stockQuote;
    StockQuoteSoap stockQuoteSoap;
    JAXBContext jaxbContext;
    Unmarshaller unmarshaller;    
    
    @PostConstruct
    void postConstruct() {                
                        
        stockQuote = new StockQuote();
        stockQuoteSoap = stockQuote.getStockQuoteSoap();
        try {
            jaxbContext = JAXBContext.newInstance( "com.xtrafe.server.ejb.wsxjax" );
            unmarshaller = jaxbContext.createUnmarshaller();
        } 
        catch (JAXBException e) {
            e.printStackTrace();
        }                
    }
    
    public void test() {
        Log.out("Here we go.");        
    }
    
    @Override
    protected void doQuery() {
        EntityManager em = Persistence.createEntityManagerFactory(unitName).createEntityManager();
        TypedQuery<SymbolEntity> findSymbols = em.createNamedQuery("SymbolEntity.findAll", SymbolEntity.class);
        List<SymbolEntity> symbols = findSymbols.getResultList();        
        
        for (SymbolEntity symbol : symbols)
            try {
                if (!isRunning())
                    return;
                doQuery(symbol.getSymbol());                
            }
            catch(Exception e) {
                Log.out("Query failed for symbol: " + symbol.getSymbol());
        }
    }
    
    private void doQuery(String symbol) {
        String quote = stockQuoteSoap.getQuote(symbol);
        StringReader stringReader = new StringReader(quote);        
        Stock stock = null;
        
        try {
            StockQuotes stockQuotes = (StockQuotes) unmarshaller.unmarshal(stringReader);
            stock = stockQuotes.getStock().get(0);            
        }
        catch (JAXBException e) {
            //e.printStackTrace();
            return;
        }                

        if (stock == null){
            Log.out("Empty stock returned.");
            return;
        }
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(unitName);
        EntityManager em = emf.createEntityManager();
        //EntityTransaction trans = em.getTransaction();
        try {                                    
            trans.begin();
            TypedQuery<StockEntity> findStockQuery = em.createNamedQuery("StockEntity.findBySymbol", StockEntity.class);
            findStockQuery.setParameter("symbol", stock.getSymbol());
            
            List<StockEntity> stockEntities = findStockQuery.getResultList();
            StockEntity stockEntity;
            if (stockEntities.size() > 0)
                stockEntity = stockEntities.get(0);
            else {                                
                stockEntity = new StockEntity();                
                Log.out("Created new stock symbol: " + stock.getSymbol());
            }                
            stockEntity.sync(stock);
            em.persist(stockEntity);
            
            TypedQuery<TickDayEntity> findTickDayQuery = em.createNamedQuery("TickDayEntity.findTickDayForStock", TickDayEntity.class);
            findTickDayQuery.setParameter("stockEntity", stockEntity);
            findTickDayQuery.setParameter("date", TickDayEntity.dateFromDateString(stock.getDate()));
            List<TickDayEntity> tickDayEntities = findTickDayQuery.getResultList();
            TickDayEntity tickDayEntity;
            if (tickDayEntities.size() > 0)
                tickDayEntity = tickDayEntities.get(0);
            else {                
                tickDayEntity = new TickDayEntity();
                tickDayEntity.sync(stock, stockEntity);
                em.persist(tickDayEntity);
                Log.out("Created new tick day: " + stock.getSymbol() + " " + stock.getDate());
            }
            
            TypedQuery<TickEntity> findTickQuery = em.createNamedQuery("TickEntity.findTickForTime", TickEntity.class);
            findTickQuery.setParameter("tickDayEntity", tickDayEntity);
            findTickQuery.setParameter("time", TickEntity.timeFromTimeString(stock.getTime()));
            List<TickEntity> tickEntities = findTickQuery.getResultList();
            TickEntity tickEntity;
            
            if (tickEntities.size() < 1){                
                tickEntity = new TickEntity();
                tickEntity.sync(stock, tickDayEntity);
                em.persist(tickEntity);
                Log.out("Created new tick: " + stock.getSymbol() + " " + stock.getDate() + " " + stock.getTime());
            }
            trans.commit();
        }
        catch (Exception e){            
            e.printStackTrace();            
        }
        finally {
            try {
                //if (trans.isActive())
                if (trans.getStatus() == Status.STATUS_ACTIVE)
                    trans.rollback();
            }
            catch (Throwable t){
                //Do nothing.
            }
        }
    }
    
}
