package com.jm3191116.spring.scope.scopedbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Car {

	private Engine engine;

	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car is being manufactured");
	}

	public Engine getEngine() {
		return engine;
	}

	public void drive() {
		System.out.println("Car is being driven..");
	}
}
