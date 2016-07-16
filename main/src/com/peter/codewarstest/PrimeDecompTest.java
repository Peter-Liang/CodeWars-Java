package com.peter.codewarstest;

import com.peter.codewars.PrimeDecomp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeDecompTest {
    @Test
    public void testPrimeDecompOne() {
        int lst = 7775460;
        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)",
                PrimeDecomp.factors(lst));
    }

    @Test
    public void testPrimeDecompTwo() {
        int lst = 86240;
        assertEquals(
                "(2**5)(5)(7**2)(11)",
                PrimeDecomp.factors(lst));
    }
}