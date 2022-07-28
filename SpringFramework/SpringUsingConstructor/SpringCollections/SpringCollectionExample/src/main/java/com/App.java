package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Question;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Question q = (Question) c.getBean("sac");
        q.display();
    }
}
