package com.jm3191116.spring.ioc.ioc02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
//		throws: NoSuchBeanDefinitionException
//		Car car = (Car) context.getBean("car");
		
		
		Car car = (Car) context.getBean("myCar");
		car.drive();
	}
}
