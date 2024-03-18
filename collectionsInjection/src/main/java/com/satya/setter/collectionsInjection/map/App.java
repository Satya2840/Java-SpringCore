package com.satya.setter.collectionsInjection.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/setter/collectionsInjection/map/mapbeans.xml");
    Address address = (Address) context.getBean("address");
    System.out.println(address);
    
    	
    }
}
