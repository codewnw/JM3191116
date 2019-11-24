package com.jm3191116.spring.di.di04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public void drive() {
		engine.start();
		System.out.println("Car is being driven..");
	}

	@Autowired
	public Car(Engine engine) {
		System.out.println("Putting engine into car.");
		this.engine = engine;
	}

}
