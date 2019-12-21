package com.jm3191116.spring.di.di06;

import org.springframework.stereotype.Component;

@Component
public class HondaEngine implements Engine {

	public HondaEngine() {
		System.out.println(this.getClass().getSimpleName() + " manufactured");
	}

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " started");
	}

}
