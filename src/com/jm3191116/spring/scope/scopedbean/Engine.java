package com.jm3191116.spring.scope.scopedbean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {

	public Engine() {
		System.out.println(this.getClass().getSimpleName() + " manufactured");
	}

}
