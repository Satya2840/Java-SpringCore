package com.spring.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.annotations")
public class ApplicationConfig {
	
	/*
	 * @Bean public Student getStudentBean() { Student student = new Student();
	 * return student; }
	 * 
	 * @Bean public Trainer getConstructorTrainerBean() { Trainer trainer = new
	 * Trainer(getStudentBean()); return trainer;
	 * 
	 * }
	 * 
	 * @Bean public Course getCourseBean() { Course course = new FullStackCourse();
	 * return course;
	 * 
	 * }
	 * 
	 * 
	 * //Setter injection
	 * 
	 * @Bean public Trainer getTrainerBean() { Trainer trainer = new Trainer();
	 * trainer.setStudent(getStudentBean()); return trainer;
	 * 
	 * }
	 */
	
}
