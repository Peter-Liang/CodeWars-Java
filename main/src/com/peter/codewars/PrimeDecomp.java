package com.peter.codewars;

/**
 * Primes in numbers
 * https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/java
 */
public class PrimeDecomp {
    public static String factors(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (n == 1) {
                break;
            }

            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                builder.append(String.format("(%1$d%2$s)", i, count == 1 ? "" : String.format("**%1$d", count)));
            }
        }

        return builder.toString();
    }
}
