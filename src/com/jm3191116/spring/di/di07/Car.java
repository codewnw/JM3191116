package com.jm3191116.spring.di.di07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	@Qualifier("hondaEngine")
	private Engine engine;

	public void drive() {
		engine.start();
		System.out.println("Car is being driven..");
	}

	public Car() {
		System.out.println("Car is being manufactured.");
	}
}
