package com.peter.codewars;

import java.math.BigInteger;

/**
 * Created by peter on 3/19/15.
 * Solution of Counting power sets.
 * http://www.codewars.com/kata/54381f0b6f032f933c000108/train/java
 */
public class Powers {
    public static BigInteger powers(int[] list) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < list.length; i++) {
            result = result.add(result);
        }
        return result;
    }
}
