package com.ashokit.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.spring.beans.Course;

@Configuration
public class EmailConfig {

	 @Bean
	 public Course getCourseObj() {
		 return new Course();
	 }
}
