package com.infogain.Assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class BeanConfiguration {
	@Bean
	public InternalResourceViewResolver setupResolver() {
		InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
		// /WEB-INF/view/greeting.jsp
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	

}
