package com.peter.codewars;

import java.util.Random;

/**
 * Created by peter on 3/20/15.
 * Solution of Color Ghost
 * http://www.codewars.com/kata/53f1015fa9fe02cbda00111a/train/java
 */
public class Ghost {
    private final String color;
    private final String[] colors = {"white", "yellow", "purple", "red"};

    public String getColor() {
        return color;
    }

    public Ghost() {
        color = colors[new Random().ints(0, 4).findFirst().getAsInt()];
    }
}
