package com.xtrafe.server.ejb;

import java.lang.reflect.Field;

public class Utility {
    public static String printObjectValues(Object obj){
        StringBuffer buffer = new StringBuffer();
        try {
            for (Field field : obj.getClass().getDeclaredFields()){
                field.setAccessible(true);
                buffer.append("\t" + field.getName() + " " + field.get(obj) + "\n");
            }
        }
        catch (Exception e){            
            e.printStackTrace();
        }
        return buffer.toString();
    }    
}
