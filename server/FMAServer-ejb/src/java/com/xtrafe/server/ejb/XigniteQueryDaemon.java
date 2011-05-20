package com.xtrafe.server.ejb;

import com.xtrafe.server.ejb.xignite.ECNTypes;
import com.xtrafe.server.ejb.xignite.ExchangeTime;
import com.xtrafe.server.ejb.xignite.OutcomeTypes;
import com.xtrafe.server.ejb.xignite.XigniteRealTime;
import com.xtrafe.server.ejb.xignite.XigniteRealTimeSoap;
import com.xtrafe.server.log.Log;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton
public class XigniteQueryDaemon extends BaseQueryDaemon {        
    
    private XigniteRealTime xigniteRealTime;
    private XigniteRealTimeSoap xigniteRealTimeSoap;
            
    @PostConstruct
    void postConstruct() {        
        xigniteRealTime = new XigniteRealTime();        
        xigniteRealTimeSoap = xigniteRealTime.getXigniteRealTimeSoap12();        
    }
            
    protected void doQuery() {
        ExchangeTime exchangeTime = xigniteRealTimeSoap.getExchangeTime(ECNTypes.ISLAND);                 
        
        if (exchangeTime.getOutcome() == OutcomeTypes.REGISTRATION_ERROR)        
            Log.out("Registration Error: " + exchangeTime.getMessage());
        else if (exchangeTime.getOutcome() == OutcomeTypes.REQUEST_ERROR)
            Log.out("Request Error: " + exchangeTime.getMessage());
        else if (exchangeTime.getOutcome() == OutcomeTypes.SYSTEM_ERROR)             
            Log.out("System Error: " + exchangeTime.getMessage());
        else 
            Log.out("Got exchange time: " + exchangeTime.getTime());        
    }        
}
