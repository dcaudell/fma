package com.xtrafe.server.ejb;

import com.xtrafe.server.ejb.webservicex.StockQuote;
import com.xtrafe.server.ejb.webservicex.StockQuoteSoap;
import com.xtrafe.server.ejb.wsxjax.Stock;
import com.xtrafe.server.ejb.wsxjax.StockQuotes;

import com.xtrafe.server.log.Log;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@Singleton
public class WebserviceXQueryDaemon extends BaseQueryDaemon {

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

    @Override
    protected void doQuery() {
        String quote = stockQuoteSoap.getQuote("GOOG");
        StringReader stringReader = new StringReader(quote);
        try {
            StockQuotes stockQuotes = (StockQuotes) unmarshaller.unmarshal(stringReader);
            for (Stock stock : stockQuotes.getStock())
                Log.out("Found stock\n:" + Utility.printObjectValues(stock));
        } 
        catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    
}
