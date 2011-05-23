package com.xtrafe.server.ejb;

public abstract class BaseQueryDaemon {        
    
    private int sleepSeconds = 60;    
    private boolean running;    
    
    protected abstract void doQuery();
    
    public boolean isRunning() {
        return running;
    }
    
    public void setSleepSeconds(int sleepSeconds) {
        this.sleepSeconds = sleepSeconds;
    }
    
    public void start() {
        new Thread(new QueryLoop()).start();
    }
    
    public void stop() {
        running = false;        
    }
    
    private class QueryLoop implements Runnable {
        
        @Override
        public void run() {
            if (running)
                return;
            
            running = true;
            while (running) {                
                try {
                    doQuery();
                    Thread.sleep(sleepSeconds * 1000);
                }
                catch (Throwable t){
                    t.printStackTrace();
                    running = false;
                }
            }
        }        
    }
}
