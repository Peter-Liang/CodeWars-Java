package com.peter.codewarstest;

import com.peter.codewars.VasyaClerk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VasyaClerkTest {

    @Test
    public void test1() {
        assertEquals("YES", VasyaClerk.Tickets(new int[]{25, 55, 50}));

    }

    @Test
    public void test2() {
        assertEquals("NO", VasyaClerk.Tickets(new int[]{25, 100}));
    }
}