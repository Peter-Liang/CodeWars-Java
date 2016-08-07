package com.peter.codewarstest;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 6kyu: Bingo Card
 * https://www.codewars.com/kata/bingo-card/train/java
 */
public class BingoCard {
    public static String[] getCard() {
        ArrayList<String> result = new ArrayList<>(24);
        Random random = new Random();
        result.addAll(random.ints(1, 16).distinct().limit(5).mapToObj(i -> String.format("B%d", i)).collect(Collectors.toList()));
        result.addAll(random.ints(16, 31).distinct().limit(5).mapToObj(i -> String.format("I%d", i)).collect(Collectors.toList()));
        result.addAll(random.ints(31, 46).distinct().limit(4).mapToObj(i -> String.format("N%d", i)).collect(Collectors.toList()));
        result.addAll(random.ints(46, 61).distinct().limit(5).mapToObj(i -> String.format("G%d", i)).collect(Collectors.toList()));
        result.addAll(random.ints(61, 76).distinct().limit(5).mapToObj(i -> String.format("O%d", i)).collect(Collectors.toList()));
        return result.toArray(new String[24]);
    }
}
