package com.satya.constructorInjection.listconsInj;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/constructorInjection/listconsInj/context.xml");
        College college = (College) context.getBean("clg");
        college.display();
        
    }
}
