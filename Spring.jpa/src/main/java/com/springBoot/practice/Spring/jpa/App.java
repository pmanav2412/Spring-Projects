package com.springBoot.practice.Spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;



/**
 * Hello world!
 *
 */

@SpringBootApplication(scanBasePackages= {"com.springBoot.practice.Spring"})
@Component("com.springBoot.practice.Spring")
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
}
