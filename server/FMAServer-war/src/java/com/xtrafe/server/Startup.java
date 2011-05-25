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
    private static final boolean getTicks = false;
    private static final boolean doSetup = false;
    
    @EJB
    WebserviceXQueryDaemon webserviceXQueryDaemon;
    
    @EJB
    Setup setup;        
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        if (doSetup)
            setup.doSetup();
        
        if (getTicks)
            webserviceXQueryDaemon.start();                
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {        
        //webserviceXQueryDaemon.stop();
    }    
}
