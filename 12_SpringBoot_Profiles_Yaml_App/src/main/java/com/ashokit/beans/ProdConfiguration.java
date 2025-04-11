package com.ashokit.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfiguration {
	
	public ProdConfiguration() {
		System.out.println("This is ProdConfiguration........");
	}
}