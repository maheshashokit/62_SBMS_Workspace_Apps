package com.ashokit.spring.beans;

import java.util.Iterator;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestAppRunner implements ApplicationRunner {
	
	public TestAppRunner() {
		System.out.println("TestAppRunner class constructor....");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("TestAppRunner class run()");
		System.out.println("Non-option values:::::" + args.getNonOptionArgs());
		
		Set<String> optionNames = args.getOptionNames();
		//traditional process
		Iterator<String> iterator = optionNames.iterator();
		while(iterator.hasNext()) {
			//current key 
			String propertyKey = iterator.next();
			//key Associated value
			String propertyValue = args.getOptionValues(propertyKey).get(0);
			System.out.println(propertyKey + " -----" + propertyValue);
		}
		
		//Java8 Stream how to process the set object
		optionNames.stream() //converting the collection objection into java8 stream object Stream<String>
		           .forEach(eachkey ->{
		        	   String eachValue = args.getOptionValues(eachkey).get(0);
		        	   System.out.println(eachkey + "========" + eachValue);
		           });
	}

}
