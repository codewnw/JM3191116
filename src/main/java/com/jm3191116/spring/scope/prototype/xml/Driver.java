package com.jm3191116.spring.scope.prototype.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jm3191116.spring.scope.prototype.xml.Car;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jm3191116/spring/scope/prototype/xml/spring-config.xml");
		Car car1 = context.getBean("car", Car.class);
		Car car2 = context.getBean("car", Car.class);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
	}
}
