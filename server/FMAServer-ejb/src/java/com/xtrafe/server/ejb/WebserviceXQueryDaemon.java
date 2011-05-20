/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtrafe.server.ejb;

import com.xtrafe.server.ejb.webservicex.StockQuote;
import com.xtrafe.server.ejb.webservicex.StockQuoteSoap;
import com.xtrafe.server.log.Log;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton
public class WebserviceXQueryDaemon extends BaseQueryDaemon {

    StockQuote stockQuote;
    StockQuoteSoap stockQuoteSoap;
    
    @PostConstruct
    void postConstruct() {
        stockQuote = new StockQuote();
        stockQuoteSoap = stockQuote.getStockQuoteSoap();
    }

    @Override
    protected void doQuery() {
        Log.out(stockQuoteSoap.getQuote("GOOG"));
    }
    
}
