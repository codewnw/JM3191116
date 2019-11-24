package com.jm3191116.spring.scope.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {

	public Car() {
		System.out.println("Car is being manufactured");
	}

	public void drive() {
		System.out.println("Car is being driven..");
	}
}
