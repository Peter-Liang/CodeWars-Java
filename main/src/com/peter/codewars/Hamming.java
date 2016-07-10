package com.peter.codewars;

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
        for (int i = nextIndex; i < n; i++) {
            long current = resultSet.stream()
                    .skip(i - 1)
                    .findFirst()
                    .get();

            resultSet.add(current * 2);
            resultSet.add(current * 3);
            resultSet.add(current * 5);

            if (resultSet.size() >= n) {
                long result = resultSet.stream()
                        .skip(n - 1)
                        .findFirst()
                        .get();
                if (result <= current * 2) {
                    nextIndex = i + 1;
                    break;
                }
            }
        }

        return resultSet.stream()
                .skip(n - 1)
                .findFirst()
                .get();
    }
}