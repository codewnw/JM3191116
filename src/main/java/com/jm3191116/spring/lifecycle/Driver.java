package com.jm3191116.spring.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car car = (Car) context.getBean("car");
		car.drive();
		context.close();
	}
}
