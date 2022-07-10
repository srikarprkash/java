package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class HadApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(HadApplication.class, args);
	A a= context.getBean(A.class);
	a.show();
	
	
	
	}

}
