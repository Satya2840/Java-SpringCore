package com.satya.scopes.beanscopes;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/scopes/beanscopes/context.xml");
		/*
		 * Student student=context.getBean("student", Student.class); Trainer trainer =
		 * context.getBean("trainer",Trainer.class);
		 * 
		 * Student student1=context.getBean("student", Student.class); Trainer trainer1
		 * = context.getBean("trainer",Trainer.class);
		 * 
		 * 
		 * System.out.println(student); System.out.println(student1);
		 * System.out.println(trainer);
		 * 
		 * System.out.println(trainer1);
		 */
        
		
		  Student student= context.getBean("student",Student.class);
		  System.out.println(student.getTrainer());
		  System.out.println(student.getTrainer());
		  System.out.println(student.getTrainer());
		 
        
		/*
		 * Trainer trainer= context.getBean("trainer",Trainer.class);
		 * System.out.println(trainer); Trainer trainer1=
		 * context.getBean("trainer",Trainer.class); System.out.println(trainer1);
		 * Trainer trainer2= context.getBean("trainer",Trainer.class);
		 * System.out.println(trainer2);
		 */
    }
}
