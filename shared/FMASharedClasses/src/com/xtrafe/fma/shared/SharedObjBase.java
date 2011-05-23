/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtrafe.fma.shared;

import java.lang.reflect.Field;

public class SharedObjBase {

    public void setFrom(Object other){
        Class<?> myClass = getClass();
        Field[] fields = other.getClass().getDeclaredFields();
        for (Field field : fields)
            try {
                field.setAccessible(true);
                String fieldName = field.getName();                
                Field myField = myClass.getDeclaredField(fieldName);
                myField.setAccessible(true);
                myField.set(this, field.get(other));                
            }
            catch (Exception e) {
                continue;
            }
    }    
}
