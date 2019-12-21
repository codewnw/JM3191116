package com.jm3191116.spring.di.di03;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine is being manufatured");
	}
	
	public void start() {
		System.out.println("Engine started");
	}

}
