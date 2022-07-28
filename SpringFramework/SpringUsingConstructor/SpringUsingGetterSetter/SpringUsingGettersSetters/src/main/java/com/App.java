package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Student;

public class App {
    public static void main( String[] args ) {
       @SuppressWarnings("resource")
	ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
       Student s = (Student) c.getBean("sas");
       s.display();
    }
}