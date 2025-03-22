package com.ashokit.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.spring.beans.Student;

@Configuration
public class DatabaseConfig {

	@Bean
	public Student getStudentObj() {
		return new Student();
	}
}
