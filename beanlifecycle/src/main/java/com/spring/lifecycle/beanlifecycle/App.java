package com.spring.lifecycle.beanlifecycle;

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
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/beanlifecycle/beans.xml");
        Employee employee = context.getBean("emp", Employee.class);
        System.out.println(employee);
        
    }
}
