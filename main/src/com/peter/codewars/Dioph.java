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
        for (int i = 0; i < n; i++) {
            int x = 2 * i + 1;
            long solution = sum(x, i);
            if (solution > n) {
                break;
            } else {
                while (solution < n) {
                    x++;
                    solution = sum(x, i);
                }
                if (solution == n) {
                    result.addFirst(Arrays.toString(new int[]{x, i}));
                }
            }
        }
        return Arrays.toString(result.toArray());
    }

    private static long sum(int x, int y) {
        return x * x - 4 * y * y;
    }
}
