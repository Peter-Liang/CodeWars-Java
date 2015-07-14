package com.peter.codewars;

/**
 * Pizza pieces
 * http://www.codewars.com/kata/5551dc71101b2cf599000023/train/java
 * Reference http://mathworld.wolfram.com/PlaneDivisionbyLines.html
 */
public class Pizza {
    public static int maxPizza(int cut) {
        return cut >= 0 ? (cut * cut + cut + 2) / 2 : -1;
    }
}
