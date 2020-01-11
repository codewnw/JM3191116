package com.jm3191116.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = { "com.jm3191116.spring.mvc" })
@EnableWebMvc
@EnableAspectJAutoProxy
public class WebMvcConfig {
	
	/**
	 * Spring MVc works for views/files
	 * These views/files are configurable
	 * so controllers are loosely coupled with view
	 * advantage you'll get that without touching the
	 * controller code you can change the view
	 * example: you can switch from JSP to thymeleaf/freemarker/velocity 
	 * or to PDF
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/view/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}

}
