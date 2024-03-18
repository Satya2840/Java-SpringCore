package com.satya.setter.collectionsInjection;

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
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/setter/collectionsInjection/setbeans.xml");
    	College clg = (College) context.getBean("clg");
    	System.out.println(clg.getClgName());
    	System.out.println(clg.getDepartments());
    	
    }
}
