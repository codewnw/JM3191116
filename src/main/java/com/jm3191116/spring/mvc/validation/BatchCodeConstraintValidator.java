package com.jm3191116.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BatchCodeConstraintValidator implements ConstraintValidator<BatchCode, String> {

	private String valueInAnnotation;

	@Override
	public void initialize(BatchCode batchCode) {
		this.valueInAnnotation = batchCode.value();
	}

	@Override
	public boolean isValid(String userEnteredValue, ConstraintValidatorContext context) {
		boolean result = true;

		if (userEnteredValue != null) {
			result = userEnteredValue.startsWith(valueInAnnotation);
		}

		return result;
	}

}
