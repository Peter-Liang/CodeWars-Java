package com.peter.codewars;

/**
 * Josephus Permutation
 * http://www.codewars.com/kata/5550d638a99ddb113e0000a2/train/java
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Josephus {
    public static <I> List<I> josephusPermutation(final List<I> items, final int k) {
        List<I> result = new ArrayList<>();
        int index = k - 1;
        while (items.size() > 0) {
            index %= items.size();
            result.add(items.remove(index));
            index += k - 1;
        }
        return result;
    }
}