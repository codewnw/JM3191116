package com.jm3191116.spring.di.di02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;
	
	public void drive() {
		engine.start();
		System.out.println("Car is being driven..");
	}
}
