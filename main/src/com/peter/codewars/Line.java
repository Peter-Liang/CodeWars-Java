package com.peter.codewars;

/**
 * 5 kyu: Double Cola
 * https://www.codewars.com/kata/551dd1f424b7a4cdae0001f0/train/java
 */
public class Line {
    public static String WhoIsNext(String[] names, int n) {
        int numOfPersons = names.length;
        int times = 0;
        while (n > numOfPersons * Math.pow(2, times)) {
            n -= numOfPersons * Math.pow(2, times);
            times++;
        }
        return names[(((int) Math.ceil(((double) n) / Math.pow(2, times))) - 1)];
    }
}
