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
        long maxY = (n - 1) / 4;
        long y = 0;
        long x = (long) Math.sqrt(n);
        while (y <= maxY) {
            long sum = x * x - ((y * y) << 2);
            if (sum < n) {
                ++x;
                continue;
            } else if (sum == n) {
                result.addFirst(Arrays.toString(new long[]{x, y}));
            }
            ++y;
        }
        return result.toString();
    }
}