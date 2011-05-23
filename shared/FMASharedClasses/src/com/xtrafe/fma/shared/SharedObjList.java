package com.xtrafe.fma.shared;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class SharedObjList<T> 
    extends SharedObjBase
    implements Iterable<T>
{
    private List<T> symbols = new ArrayList<T>();

    public void add(T member){
        symbols.add(member);
    }
    
    public T get(int index){
        return symbols.get(index);
    }
    
    public int size() {
        return symbols.size();
    }
    
    @Override
    public Iterator<T> iterator() {
        return symbols.iterator();
    }
    
    public List<T> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<T> symbols) {
        this.symbols = symbols;
    }               
}
