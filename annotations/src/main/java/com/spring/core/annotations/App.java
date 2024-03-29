package com.spring.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
       Trainer trainer = context.getBean("trainer", Trainer.class);
       System.out.println("Trainer bean created " + trainer);
       trainer.getStudentInfo();
       trainer.getCourseDetails(); 
    }
}
