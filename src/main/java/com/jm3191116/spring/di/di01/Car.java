package com.jm3191116.spring.di.di01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;
	
	@Autowired
	public Car(Engine engine) {
		System.out.println("Putting engine into car");
		System.out.println("Car is being manufactured.");
	}

	public void drive() {
		System.out.println("Car is being driven..");
	}
}
