package com.jm3191116.spring.ioc.xml.ioc01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jm3191116/spring/ioc/xml/ioc01/spring-config.xml");
		Car car = (Car) context.getBean("car");
		car.drive();
	}
}
