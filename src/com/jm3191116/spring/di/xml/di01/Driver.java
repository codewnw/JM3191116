package com.jm3191116.spring.di.xml.di01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jm3191116/spring/di/xml/di01/spring-config.xml");
		Car car = (Car) context.getBean("car");
		car.drive();
	}
}
