package com.peter.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 6 kyu: Equal Sides Of An Array
 * https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
 */
public class FindEvenIndex {
    public static int findEvenIndex2(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 1; i < list.size() - 1; i++) {
            int leftVal = list.stream().limit(i).mapToInt(Integer::intValue).sum();
            int rightVal = list.stream().skip(i + 1).mapToInt(Integer::intValue).sum();
            if (leftVal == rightVal) {
                return i;
            }
        }

        return -1;
    }

    public static int findEvenIndex(int[] arr) {
        if (arr.length < 3) {
            return -1;
        }

        int leftVal = 0, rightVal = 0;
        for (int i = 1; i < arr.length; i++) {
            rightVal += arr[i];
        }

        for (int i = 1; i < arr.length - 1; i++) {
            leftVal += arr[i - 1];
            rightVal -= arr[i];
            if (leftVal == rightVal) {
                return i;
            }
        }

        return -1;
    }
}
