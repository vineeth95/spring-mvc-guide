package com.vinith.fullanno.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
    	Samsung s = ac.getBean(Samsung.class);
    	s.config();
    }
}
