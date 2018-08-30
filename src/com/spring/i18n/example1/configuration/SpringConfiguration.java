package com.spring.i18n.example1.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class SpringConfiguration {
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource bundleMessageSource = new ResourceBundleMessageSource();
		bundleMessageSource.setBasenames("languages/message","languages/logging");
		bundleMessageSource.setDefaultEncoding("UTF-8");
		return bundleMessageSource;
	}
}
