package com.peter.codewars;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 6 kyu: Find the odd int
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 *
 * https://www.codewars.com/kata/find-the-odd-int/train/java
 */
public class FindOdd {
    public static int findIt(int[] intArr) {
        Map<Integer, Long> appearTimes = IntStream.of(intArr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return appearTimes.entrySet()
                .stream()
                .filter(e -> e.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
