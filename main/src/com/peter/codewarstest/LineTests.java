package com.peter.codewarstest;

import com.peter.codewars.Line;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LineTests {
    @Test
    public void test1() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 1;
        assertEquals("Sheldon", Line.WhoIsNext(names, n));
    }

    @Test
    public void test2() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 6;
        assertEquals("Sheldon", Line.WhoIsNext(names, n));
    }


    @Test
    public void test3() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 63;
        assertEquals("Rajesh", Line.WhoIsNext(names, n));
    }

    @Test
    public void test4() {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 10010;
        assertEquals("Howard", Line.WhoIsNext(names, n));
    }
}
