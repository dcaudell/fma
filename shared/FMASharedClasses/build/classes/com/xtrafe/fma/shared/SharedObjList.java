package com.xtrafe.fma.shared;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class SharedObjList<T> 
    extends SharedObjBase
    implements Iterable<T>
{
    private List<T> items = new ArrayList<T>();

    public void add(T member){
        items.add(member);
    }
    
    public T get(int index){
        return items.get(index);
    }
    
    public int size() {
        return items.size();
    }
    
    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
    
    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> symbols) {
        this.items = symbols;
    }               
}
