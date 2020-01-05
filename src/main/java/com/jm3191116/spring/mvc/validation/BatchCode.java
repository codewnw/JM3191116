package com.jm3191116.spring.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = BatchCodeConstraintValidator.class)
@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface BatchCode {

	public String value() default "JM3";

	public String message() default " prefix is incorrect";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
