package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean(name = "messageSource")  //This is the fixed bean id for the class "esourceBundleMessageSource"
	public ResourceBundleMessageSource getRBMS() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("com/nt/commons/App");
		return source;
	}
}
