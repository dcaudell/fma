/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtrafe.server;

import com.xtrafe.server.ejb.WebserviceXQueryDaemon;
import com.xtrafe.server.log.Log;
import com.xtrafe.server.ejb.XigniteQueryDaemon;
import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Startup implements ServletContextListener {   
    @EJB
    WebserviceXQueryDaemon webserviceXQueryDaemon;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        if (webserviceXQueryDaemon == null)
            Log.out("Injection failed for webserviceXQueryDaemon");
        else
            webserviceXQueryDaemon.start();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        if (webserviceXQueryDaemon != null)
            webserviceXQueryDaemon.stop();
    }    
}
