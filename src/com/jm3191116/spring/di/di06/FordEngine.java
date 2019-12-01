package com.jm3191116.spring.di.di06;

import org.springframework.stereotype.Component;

@Component
public class FordEngine implements Engine {

	public FordEngine() {
		System.out.println(this.getClass().getSimpleName() + " manufactured");
	}

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " started");
	}

}
