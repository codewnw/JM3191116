package com.jm3191116.spring.lifecycle.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jm3191116/spring/lifecycle/xml/spring-config.xml");
		Car car = (Car) context.getBean("car");
		car.drive();

		if (context instanceof ClassPathXmlApplicationContext) {
			((ClassPathXmlApplicationContext) context).close();
		}
	}
}
