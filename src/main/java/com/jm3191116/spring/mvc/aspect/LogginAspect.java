package com.jm3191116.spring.mvc.aspect;

import java.util.StringJoiner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.jm3191116.spring.mvc.model.Student;

@Component
@Aspect
public class LogginAspect {

	@Pointcut("execution(* com.jm3191116.spring.mvc.*.*.*(..))")
	public void allMethodsInMvcPackage() {
	}

	@Before("allMethodsInMvcPackage()")
	public void printBefore(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature() + " >> started");
	}

	@AfterReturning("allMethodsInMvcPackage()")
	public void printAfterReturning(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature() + " << stopped");
	}

	@AfterThrowing(value = "allMethodsInMvcPackage()", throwing = "exp")
	public void printAfterReturning(JoinPoint joinPoint, Throwable exp) {
		System.out.println(joinPoint.getSignature() + " " + exp);
	}

	@Around("execution(* com.jm3191116.spring.mvc.*.*.empty*(..))")
	public Object forEmptyStudent(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("Around advice >>");
		Student student = (Student) proceedingJoinPoint.proceed();
		System.out.println("Around advice <<");
		student.setName("Atul");
		return student;
	}

	@Around("execution(* com.jm3191116.spring.mvc.*.*.*(..))")
	public Object performance(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object result = proceedingJoinPoint.proceed();
		long endTime = System.currentTimeMillis();

		StringJoiner joiner = new StringJoiner(" ");
		joiner.add("Total time taken to execute");
		joiner.add(proceedingJoinPoint.getSignature() + "");
		joiner.add((endTime - startTime) + "");
		joiner.add("millis");

		System.out.println(joiner.toString());
		return result;
	}

}
