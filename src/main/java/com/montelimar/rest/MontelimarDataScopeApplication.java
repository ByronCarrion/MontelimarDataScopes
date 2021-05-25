package com.montelimar.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class MontelimarDataScopeApplication extends SpringBootServletInitializer {

	 
	 
	 public static void main(String[] args) {
			SpringApplication.run(MontelimarDataScopeApplication.class, args);
		}
	 
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(MontelimarDataScopeApplication.class);
	    }
		 
	
}
