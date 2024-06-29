package com.javatechie.api.advice;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomValidator implements ConstraintValidator<NotContainsNumbers, String> {

    @Override
    public void initialize(NotContainsNumbers constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Your validation logic here
        return value != null && !value.matches(".*\\d.*");
    }
}