package com.jm3191116.spring.di.di01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// Car car = new Car();
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car car = (Car) context.getBean("car");
		car.drive();
	}
}
