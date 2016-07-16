package com.peter.codewars;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 4kyu: Hamming Numbers
 * https://www.codewars.com/kata/hamming-numbers/train/java
 */
public class Hamming {
    private static final SortedSet<Long> resultSet = new TreeSet<>();
    private static int nextIndex = 1;

    static {
        resultSet.add(1l);
    }

    public static long hamming(int n) {
        if (n <= 0) return -1;
        TreeSet<Long> ts = new TreeSet<>(Arrays.asList(2L, 3L, 5L));
        long smallest = 1;
        for (int i = 1; i < n; i++) {
            smallest = ts.pollFirst();
            ts.add(smallest * 2);
            ts.add(smallest * 3);
            ts.add(smallest * 5);
        }
        return smallest;
    }
}