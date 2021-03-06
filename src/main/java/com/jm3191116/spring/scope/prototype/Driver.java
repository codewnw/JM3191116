package com.jm3191116.spring.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car car1 = context.getBean("car", Car.class);
		Car car2 = context.getBean("car", Car.class);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
	}
}
