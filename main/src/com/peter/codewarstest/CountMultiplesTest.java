package com.peter.codewarstest;

import com.peter.codewars.CountMultiples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountMultiplesTest {
    @Test
    public void mainTest() {
        assertEquals(6, CountMultiples.countSpecMult(3, 200));
        assertEquals(16, CountMultiples.countSpecMult(2, 100)); // 6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72
        assertEquals(47, CountMultiples.countSpecMult(4, 10000));
        assertEquals(2612, CountMultiples.countSpecMult(6, 78457669));
//        assertEquals(914, CountMultiples.countSpecMult(8, 8865674774));

    }
}
