package com.peter.codewars;

import java.util.Arrays;

/**
 * Moduli number system
 * http://www.codewars.com/kata/54db15b003e88a6a480000b9/train/java
 */
public class ModSystem {
    public static String fromNb2Str(int n, int[] sys) {
        int product = Arrays.stream(sys).reduce(1, (i, j) -> i * j);
        if (product <= n) {
            return "Not applicable";
        }

        if (Arrays.stream(sys).anyMatch(i -> Arrays.stream(sys).anyMatch(j -> (j > i && coprime(j, i) == 0)))) {
            return "Not applicable";
        }

        StringBuilder result = new StringBuilder();
        Arrays.stream(sys).forEach(i -> result.append("-").append(n % i).append("-"));
        return result.toString();
    }

    public static int coprime(int x, int y) {
        int result = x % y;
        return result > 1 ? coprime(y, result) : result;
    }
}
