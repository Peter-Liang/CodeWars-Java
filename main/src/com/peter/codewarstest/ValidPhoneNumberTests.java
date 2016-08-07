package com.peter.codewarstest;

import com.peter.codewars.ValidPhoneNumbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidPhoneNumberTests {
    @Test
    public void tests() {
        assertEquals(true, ValidPhoneNumbers.validPhoneNumber("(123) 456-7890"));
        assertEquals(false, ValidPhoneNumbers.validPhoneNumber("(1111)555 2345"));
        assertEquals(false, ValidPhoneNumbers.validPhoneNumber("(098) 123 4567"));
    }

}
