package com.jm3191116.spring.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = { "com.jm3191116.spring.mvc" })
@EnableWebMvc
public class WebMvcConfig {

}
