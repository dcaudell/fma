package com.xtrafe.mobile.fma;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class Utility {
	
	private Utility() {
		//Do nothing.
	}
	
	public static enum ClassLoaderTactics {
        CLASS_FOR_NAME,
        CONTEXT_CLASSLOADER,
        PARENT_CLASSLOADER
    }
	public static final ClassLoaderTactics classLoaderTactic = ClassLoaderTactics.CLASS_FOR_NAME;
		
	public static Class<?>
    findClass(
            String      className, 
            String[]    searchPath
    )
    throws ClassNotFoundException
    {        
        try {
            return getClass(className);
        }
        catch (ClassNotFoundException exception){
            //Do nothing.
        }
        catch (ClassCastException exception){
            //Do nothing.
        }
                
        for (int i = 0; i < searchPath.length; i++){
            try {                
                return getClass(searchPath[i] + "." + className);
            }
            catch (ClassNotFoundException exception) {
                continue;
            }
            catch (ClassCastException exception) {
                continue;
            }
            catch (NoClassDefFoundError error){
                //Due to Java bug, this is thrown when className is mis-capitalized.
                continue;
            }
        }
        
        throw new ClassNotFoundException("Class Not Found - '" + className + "'");
    }
	
	public static <T> Class<? extends T>
    findClass(
        String   className, 
        String[] searchPath,
        Class<T> type
    )
    throws ClassNotFoundException
    {
        if (className == null)
            throw new IllegalArgumentException("null className");
        if (type == null)
            throw new IllegalArgumentException("null type");
        if (searchPath == null)
            searchPath = new String[0];
        
        Class<?> clazz;
        try {                   
            clazz = getClass(className);
            return clazz.asSubclass(type);            
        }
        catch (ClassNotFoundException exception){
            //Do nothing.
        }
        catch (ClassCastException exception){
            //Do nothing.
        }
                
        for (int i = 0; i < searchPath.length; i++){
            try {                
                clazz = getClass(searchPath[i] + "." + className);
                return clazz.asSubclass(type);                
            }
            catch (ClassNotFoundException exception) {
                continue;
            }
            catch (ClassCastException exception) {
                continue;
            }
            catch (NoClassDefFoundError error){
                //Due to Java bug, this is thrown when className is mis-capitalized.
                continue;
            }
        }
        
        throw new ClassNotFoundException("Class Not Found - '" + className + "'");
    }
	
	public static Class<?>
    getClass(
            String className
    )
    throws ClassNotFoundException
    {
        if (className == null)
            throw new IllegalArgumentException("null className");

        ClassLoader cl;
        switch (classLoaderTactic) {
            case CONTEXT_CLASSLOADER:
                cl = Thread.currentThread().getContextClassLoader();
                return cl.loadClass(className);
            case PARENT_CLASSLOADER:
                cl = Utility.class.getClassLoader();
                return cl.loadClass(className);
            case CLASS_FOR_NAME:
                return Class.forName(className);
            default:
                throw new ClassNotFoundException("ClassLoaderTactic not set");
        }
    }

	//This method partially boosted from http://www.javaworld.com/javaworld/javatips/jw-javatip113.html?page=2    
    public static List<Class<?>>
    getClassesInPackage(
            String packageName
    ){
        ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
        if (packageName == null)
            return classes;               
             
        String dirName = new String(packageName);
        if (!dirName.startsWith("/"))
            dirName = "/" + dirName;
        dirName = dirName.replace('.', '/');
                       
        
        URL url = getResource(dirName);        
        if (url == null){
            System.err.println("Could not get package '" + packageName + "'.");
            return classes;
        }                                                   

        String[] files = null;
        String urlString = url.toString();
        if (urlString.startsWith("jar")) {
            try {
                files = getClassNamesInJARPackage(packageName,
                                                  new File(new URL(getJarOfResource(urlString)).getFile()));
            }
            catch (MalformedURLException exception){
                exception.printStackTrace();                
            }
            if (files == null){
                System.err.println("No files found for package '" + packageName + "'");
                return classes;
            }
        }
        else {
            File directory = new File(url.getFile());
            if (directory == null){
                System.err.println("Could not get directory '" + url + "'.");
                return classes;
            }
            files = directory.list();
        }        
        
        for (int i = 0; i < files.length; i++)
            if (files[i].endsWith(".class")){                
                // removes the .class extension
                String className = files[i].substring(0,files[i].length()-6);
                if (!className.startsWith(packageName))
                    className = packageName + "." + className;
                try {                    
                    classes.add(getClass(className));
                }
                catch (ClassNotFoundException exception){
                    exception.printStackTrace();
                }                
            }
                        
        return classes;
    }

    public static String[]
    getClassNamesInJARPackage(
    		String packageName,
    		File   jarFile
    ){
    	if (packageName == null)
    		return null;

    	ArrayList<String> classes = new ArrayList<String>();

    	try {
    		//System.out.println("Looking for package '" + packageName + "' in JAR '" + jarFile.getName() + "'");
    		packageName = packageName.replace('.', '/');

    		JarInputStream jarFileStream = new JarInputStream(new FileInputStream(jarFile));

    		JarEntry jarEntry;
    		while(true){
    			jarEntry = jarFileStream.getNextJarEntry();
    			if (jarEntry == null)
    				break;

    			String entryName = jarEntry.getName();

    			if ((entryName.startsWith(packageName)) &&
    			    (entryName.endsWith(".class"))      ){
    				entryName = entryName.replace('/', '.');
    				classes.add(entryName);
    			}
    		}
    	}
    	catch (FileNotFoundException exception){
    		exception.printStackTrace();
    	}
    	catch (IOException exception){
    		exception.printStackTrace();
    	}
    	return classes.toArray(new String[0]);
    }
        
	public static Object
    getClassInstance(
            String className, 
            String searchPath
    ){
        if (className == null)
            throw new IllegalArgumentException("null className");
        if (searchPath == null)
            searchPath = "";
        return getClassInstance(className, getPathArray(searchPath));
    }
    
    public static Object
    getClassInstance(
            String   className, 
            String[] searchPath
    ){
        if (className == null)
            throw new IllegalArgumentException("null className");
         try {
             Class<?> clazz = findClass(className, searchPath);
             return instantiate(clazz);
         }
         catch (ClassNotFoundException exception) {
             return null;
         }
         
    }
    
    public static File
    getJARofClass(
    		Class<?> clazz
    ){
    	File jarFile;
    	try {
    		jarFile = new File(clazz.getProtectionDomain().getCodeSource().getLocation().toURI());
    		return jarFile;
    	}
    	catch (Throwable throwable) {
    		throwable.printStackTrace();
    		return null;
    	}
    }
    
    public static String
    getJarOfResource(
            String resource
    ){
        if (resource == null)
            throw new IllegalArgumentException("null resource");
        if (!resource.startsWith("jar:"))
            return null;
        if (resource.contains("!/"))
            resource = resource.split("!")[0];
        return resource.substring(4);
    }
    
    private static String[]
    getPathArray(
    		String path
    ){
    	if (path == null)
    		throw new IllegalArgumentException("null path");
    	String[] paths = path.trim().split(";");
    	return paths;
    }
    
    public static URL
    getResource(
    		String resName
    ){
    	if (resName == null)
    		throw new IllegalArgumentException("null className");

    	ClassLoader cl;
    	switch (classLoaderTactic) {
    		case CONTEXT_CLASSLOADER:
    			cl = Thread.currentThread().getContextClassLoader();
    			return cl.getResource(resName);
    		case CLASS_FOR_NAME:
    		case PARENT_CLASSLOADER:
    			cl = Utility.class.getClassLoader();
    			return cl.getResource(resName);
    		default:
    			return null;
    	}
    }
    
    public static boolean
    implmnts(
            Class<?> clazz,
            Class<?> interfce
    ){
        if (clazz == null)
            throw new IllegalArgumentException("null clazz");
        if (interfce == null)
            throw new IllegalArgumentException("null interfce");
        if (!interfce.isInterface())
            throw new IllegalArgumentException("interfce is not an interface");

        Class<?>[] classes = clazz.getInterfaces();
        for (int i = 0; i < classes.length; i++)
            if (classes[i].equals(interfce))
                return true;

        if (clazz.getSuperclass() != null)
            return implmnts(clazz.getSuperclass(), interfce);

        return false;
    }   

    public static <T> T
    instantiate(
            Class<T>  clazz,
            Object... args
    ){
        if (clazz == null)
            throw new IllegalArgumentException("null clazz");

        Class<?>[] types = null;
        if (args != null) {
            types = new Class<?>[args.length];
            int i = 0;
            for (Object arg : args)
                types[i++] = arg.getClass();
        }

        try {
            Constructor<T> constructor = clazz.getConstructor(types);
            T instance = constructor.newInstance(args);
            return instance;
        }
        catch (Exception exception){                       
            exception.printStackTrace();
            return null;
        }
    }   
}
