package com.javatechie.api.advice;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CustomValidator.class)
public @interface NotContainsNumbers {
    String message() default "String must not contain numbers";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}