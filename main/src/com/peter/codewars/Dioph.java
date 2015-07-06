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
        long x = (long)Math.sqrt(n);
        while (y <= maxY) {
            long sum = (x - 2 * y) * (x + 2 * y);
            if (sum < n) {
                x++;
            }
            else if (sum > n) {
                y++;
            } else {
                result.addFirst(Arrays.toString(new long[]{x, y}));
                y++;
            }
        }


        return Arrays.toString(result.toArray());
    }
}