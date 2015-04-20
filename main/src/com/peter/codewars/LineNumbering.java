package com.peter.codewars;

import java.util.List;

/**
 * Created by peter on 4/20/15.
 * Solution of the kata 'Testing 1-2-3'.
 * http://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java
 */
public class LineNumbering {

   public static List<String> number(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, String.format("%d: %s", i + 1, lines.get(i)));
        }
        return lines;
    }
}