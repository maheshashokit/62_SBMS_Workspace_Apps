package com.ashokit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.spring.beans.Demo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
	    Demo demoBean = context.getBean(Demo.class);
	    System.out.println(demoBean);
	    
	    
	    ApplicationRunner runner = (ApplicationArguments args1) ->{
	    	System.out.println("Lambda" + args1.getNonOptionArgs());
	    };
	}

}
