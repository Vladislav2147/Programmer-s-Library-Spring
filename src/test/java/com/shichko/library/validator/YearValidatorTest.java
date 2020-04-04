package com.shichko.library.validator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class YearValidatorTest {
    public final static int currentYear = 2020;
    @Test
    public void calendarYearIsNow() {
        Assert.assertEquals(currentYear, Calendar.getInstance().get(Calendar.YEAR));
    }
}
