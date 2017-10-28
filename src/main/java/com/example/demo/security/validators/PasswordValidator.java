package com.example.demo.security.validators;

import com.example.demo.dto.AccountDto;
import com.example.demo.security.annotations.MatchingPassword;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<MatchingPassword,AccountDto> {
    @Override
    public void initialize(MatchingPassword matchingPassword) {

    }

    @Override
    public boolean isValid(AccountDto accountDto, ConstraintValidatorContext constraintValidatorContext) {
        return accountDto.getPassword().equals(accountDto.getMatchingPassword());
    }
}
