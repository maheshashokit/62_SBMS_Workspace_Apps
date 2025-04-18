package com.ashokit.spring.beans;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class DatabaseRunner implements CommandLineRunner {
	
	public DatabaseRunner() {
		System.out.println("DatabaseRunner class Constructor....");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DatabaseRunner CommandLine Arguments....." + Arrays.asList(args));

	}

}
