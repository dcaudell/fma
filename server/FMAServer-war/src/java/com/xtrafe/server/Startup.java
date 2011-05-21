/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtrafe.server;

import com.xtrafe.server.ejb.Setup;
import com.xtrafe.server.ejb.WebserviceXQueryDaemon;
import com.xtrafe.server.log.Log;
import com.xtrafe.server.ejb.XigniteQueryDaemon;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Stateless
public class Startup implements ServletContextListener {   
    @EJB
    WebserviceXQueryDaemon webserviceXQueryDaemon;
    
    @EJB
    Setup setup;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        setup.doSetup();
        
        if (webserviceXQueryDaemon == null)
            Log.out("Injection failed for webserviceXQueryDaemon");
        else {
            webserviceXQueryDaemon.test();
            webserviceXQueryDaemon.start();
        }
            
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        if (webserviceXQueryDaemon != null)
            webserviceXQueryDaemon.stop();
    }    
}
