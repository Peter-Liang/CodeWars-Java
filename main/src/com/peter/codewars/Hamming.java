package com.peter.codewars;

/**
 * 4kyu: Hamming Numbers
 * https://www.codewars.com/kata/hamming-numbers/train/java
 */
public class Hamming {
    public static long hamming(int n) {
        int count = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            int current = i;
            while (current % 2 == 0) {
                current /= 2;
            }
            while (current % 3 == 0) {
                current /= 3;
            }

            while (current % 5 == 0) {
                current /= 5;
            }

            if (current == 1) {
                count++;
                if (count == n) {
                    return i;
                }
            }

        }

        return 0;
    }
}
