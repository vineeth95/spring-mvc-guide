package com.vinith.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//     Vehicle obj = (Vehicle)ac.getBean("bike");
//    obj.drive();
     
//     Tyre t = (Tyre)ac.getBean("tyre");
//     System.out.println(t);
     Car obj = (Car)ac.getBean("car");
     obj.drive();
    
    
    }
}
