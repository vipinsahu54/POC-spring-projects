package com.infogain.Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AssignmentApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder  configure(SpringApplicationBuilder sb) {
		
		return sb.sources(AssignmentApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

}
