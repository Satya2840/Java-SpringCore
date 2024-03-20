package com.satya.constructorInjection.PropertiesInjection;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/constructorInjection/PropertiesInjection/context.xml");
        Employee empDetails = (Employee) context.getBean("emp");
        empDetails.display();
       
    }
}
