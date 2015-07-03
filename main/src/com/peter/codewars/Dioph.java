package com.peter.codewars;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Diophantine Equation
 * http://www.codewars.com/kata/554f76dca89983cc400000bb/train/java
 * 5 kyu
 */
public class Dioph {
    public static String solEquaStr(long n) {
        LinkedList<String> result = new LinkedList<>();
        for (long i = 0; i <= (n - 1) / 4; i++) {
            long expected = n + 4 * i * i;
            long x = (long) Math.sqrt(expected);
            if (x * x == expected) {
                result.addFirst(Arrays.toString(new long[]{x, i}));
            }
        }
        return Arrays.toString(result.toArray());
    }
}
