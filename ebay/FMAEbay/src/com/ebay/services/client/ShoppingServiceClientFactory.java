package com.ebay.services.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.Handler;

import com.ebay.common.ClientFactory;
import com.ebay.services.shopping.Shopping;
import com.ebay.services.shopping.ShoppingInterface;

public class ShoppingServiceClientFactory {
    private static final String APPID = "none23e13-1250-4872-bc47-d533c3b25e0";
    //private static final String CALLNAME = "GeteBayTime";
    private static final String CALLNAME = "GetSingleItem";
    private static final String VERSION = "655";
    private static final String BASEURL = "http://open.api.ebay.com/shopping?";
    private static BindingProvider bp;
    /**
     * Get a client object which can communicate with
     * Shopping service.
     * 
     * @param config, client-side configuration object
     * @return a client object which implements the interface
     *         of Finding service.
     */
    public static ShoppingInterface getServiceClient(ClientConfig config) {
    ShoppingInterface serviceClient = 
            ClientFactory.getServiceClient(ShoppingInterface.class, Shopping.class, 
                            config, "Shopping");
    return serviceClient;
    }
        
    public static ShoppingInterface getServiceClient() {        
        try {
            String endpointURL = BASEURL;    
            Shopping service = new Shopping();
            ShoppingInterface port = service.getShopping();
            bp = (BindingProvider) port;
            // bp = (BindingProvider) port;
            bp.getRequestContext().
                    put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                    endpointURL);
            // Add the logging handler
            List<Handler> handlerList = bp.getBinding().getHandlerChain();
            if (handlerList == null) {
                handlerList = new ArrayList<Handler>();
            }
            /*
            LoggingHandler loggingHandler = new LoggingHandler();
            handlerList.add(loggingHandler);*/

            // register the handerList
            bp.getBinding().setHandlerChain(handlerList);

            Map<String,Object> requestProperties = bp.getRequestContext();
            Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
            requestProperties.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);
            // set reqired HTTP Headers :
            // http://developer.ebay.com/DevZone/shopping/docs/Concepts/ShoppingAPI_FormatOverview.html#StandardURLParameters
            httpHeaders.put("X-EBAY-API-CALL-NAME", Collections.singletonList(CALLNAME));
            httpHeaders.put("X-EBAY-API-APP-ID", Collections.singletonList(APPID));
            httpHeaders.put("X-EBAY-API-VERSION", Collections.singletonList(VERSION));

            requestProperties.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
            // initialize WS operation arguments here                
            return port;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }        
    }
}
