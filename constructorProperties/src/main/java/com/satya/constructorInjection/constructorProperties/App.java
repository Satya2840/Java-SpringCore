package com.satya.constructorInjection.constructorProperties;

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
       ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/constructorInjection/constructorProperties/context.xml");
       Employee emp = (Employee) context.getBean("emp");
       emp.display();
    }
}
