package com.jm3191116.spring.mvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

	@Pointcut("execution(* com.jm3191116.spring.mvc.*.*.*(..))")
	public void allMethodsInMvcPackage() {
	}

	@Before("allMethodsInMvcPackage()")
	public void printLog(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature() + " >> started");
	}

}
