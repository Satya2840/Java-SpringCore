package com.satya.setterInjection;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/setterInjection/context.xml");
        Employee empDetails = (Employee) context.getBean("emp");
        System.out.println(empDetails.getEmpid());
        System.out.println(empDetails.getName());
    }
}
