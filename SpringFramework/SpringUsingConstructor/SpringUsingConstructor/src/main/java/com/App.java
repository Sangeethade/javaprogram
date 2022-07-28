package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Entity.Student;

public class App 
{
    public static void main( String[] args )
    {
       Resource res = new ClassPathResource("ApplicationContext.xml");
       BeanFactory b = new XmlBeanFactory(res);
       Student s = (Student) b.getBean("sa");
       s.display();
    }
}
