package com.shichko.library.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Calendar;

public class YearValidator implements ConstraintValidator<Year, Integer> {
    @Override
    public void initialize(Year constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer year, ConstraintValidatorContext constraintValidatorContext) {
        if (year > 0 && year < Calendar.getInstance().get(Calendar.YEAR)) {
            return true;
        }
        return false;
    }
}
