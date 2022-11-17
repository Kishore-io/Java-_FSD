package com.wp.spring.simple_phone_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
        Phone myPhone1 = context.getBean(Phone.class);
        Phone myPhone2 = context.getBean(Phone.class);
        myPhone1.setRam(8);
        myPhone2.setStorage(256);
        
        myPhone1.call(9603770639L);
        myPhone1.showInfo();
        myPhone2.showInfo();
    }
}
