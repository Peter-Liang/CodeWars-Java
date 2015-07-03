package com.peter.codewars;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.stream.LongStream;

/**
 * Diophantine Equation
 * http://www.codewars.com/kata/554f76dca89983cc400000bb/train/java
 * 5 kyu
 */
public class Dioph {
    public static String solEquaStr(long n) {
        long maxY = (n - 1) / 4;
        long minX = (long) Math.ceil(Math.sqrt(n));
        long maxX = 2 * maxY + 1;
        Hashtable<Long, Long> powers = new Hashtable<>();
        LongStream.rangeClosed(minX, maxX).forEach(i -> powers.put(i * i, i));
        LinkedList<String> result = new LinkedList<>();
        for (long i = 0; i <= maxY; i++) {
            long expected = n + 4 * i * i;
            if (powers.containsKey(expected)) {
                result.addFirst(Arrays.toString(new long[]{powers.get(expected), i}));
            }
        }
        return Arrays.toString(result.toArray());
    }
}
