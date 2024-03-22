package com.satya.bean.readProps.readingProperties;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/bean/readProps/readingProperties/context.xml");
        Employee emp = (Employee) context.getBean("emp");
        System.out.println(emp.getEmpId());
        System.out.println(emp.getEmpName());
        
        
    
    }
}
