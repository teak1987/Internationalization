package com.internationalization.internationalization;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class InternationalizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternationalizationApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver lr = new SessionLocaleResolver();
		lr.setDefaultLocale(Locale.ENGLISH);
		return lr;
		
	}
	
	@Bean
	public ResourceBundleMessageSource bundleMsg() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}

}
