package com.learn.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
//
//        for(String beanNames : applicationContext.getBeanDefinitionNames()){
//        	System.out.println(beanNames);
         SpringApplication.run(DemoApplication.class,args);
    }
}
