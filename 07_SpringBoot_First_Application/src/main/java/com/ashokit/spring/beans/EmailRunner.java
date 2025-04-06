package com.ashokit.spring.beans;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class EmailRunner implements CommandLineRunner {
	
	public EmailRunner() {
		System.out.println("EmailRunner Constructor....");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("EmailRunner CommandLine Arguments....." + Arrays.asList(args));
	}
}