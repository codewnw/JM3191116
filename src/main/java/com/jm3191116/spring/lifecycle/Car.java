package com.jm3191116.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Car {

	public Car() {
		System.out.println("Car is being manufactured");
	}

	public void drive() {
		System.out.println("Car is being driven..");
	}

	@PostConstruct
	public void paintTheCar() {
		System.out.println("Painting car as black.");
	}
	
	@PreDestroy
	public void auctionTheCar() {
		System.out.println("Auctioning the car.");
	}
}
