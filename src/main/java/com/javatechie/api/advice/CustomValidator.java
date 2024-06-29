package com.javatechie.api.advice;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomValidator implements ConstraintValidator<ValidCustom, String> {

    @Override
    public void initialize(ValidCustom constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Your validation logic here
        return value != null && !value.matches(".*\\d.*");
    }
}