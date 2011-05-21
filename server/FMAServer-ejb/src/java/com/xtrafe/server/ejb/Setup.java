package com.xtrafe.server.ejb;

import com.xtrafe.server.ejb.entity.SymbolEntity;
import com.xtrafe.server.log.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.swing.JFileChooser;

@Stateless
@LocalBean
public class Setup {

    @PersistenceContext(unitName="StockService")
    private EntityManager em;
    
    public void doSetup() {        
        TypedQuery<SymbolEntity> findSymbols = em.createNamedQuery("SymbolEntity.findAll", SymbolEntity.class);
        List<SymbolEntity> symbols = findSymbols.getResultList();
        if (!symbols.isEmpty())
            return;
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Please supply a stock symbols file");
        if (fileChooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION)
            return;        
        File inFile = fileChooser.getSelectedFile();
        
        try {
            BufferedReader in = new BufferedReader(new FileReader(inFile));
            while (true) {
                String str = in.readLine();
                if (str == null)
                    break;
                
                if (str.trim().equals(""))
                    continue;
                
                SymbolEntity newSymbolEntity = new SymbolEntity();
                newSymbolEntity.setSymbol(str.trim());
                em.persist(newSymbolEntity);
                Log.out("Added stock symbol: " + newSymbolEntity.getSymbol());
            }
        }
        catch (IOException ioe){
            ioe.printStackTrace();            
        }
    }
}
