package com.example.demo.security.annotations;

import com.example.demo.security.validators.PasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
@Documented
public @interface MatchingPassword {
    String  message() default "Passwords must match";
    // additional boilerplate code to make Spring work
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
