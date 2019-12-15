package com.jm3191116.spring.di.xml.di05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jm3191116.spring.di.xml.di05.Car;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jm3191116/spring/di/xml/di05/spring-config.xml");
		Car car = (Car) context.getBean("car");
		car.drive();
	}
}
