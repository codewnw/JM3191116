package com.jm3191116.spring.mvc.scope.request;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
//@Scope("singleton")
@RequestScope
public class RandomNumberGenerator {

	private long randomNumber;

	public long getRandomNumber() {
		return randomNumber;
	}

	public void generateAndSetRandomNumber() {
		randomNumber = (long) (Math.random() * 10000);
	}

}
