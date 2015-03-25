package com.peter.codewars;

/**
 * Created by peter on 3/25/15.
 * Solution of the kata 'Sentence Smash'.
 * http://www.codewars.com/kata/53dc23c68a0c93699800041d/train/java
 */
public class SmashWords {
    public static String smash(String... words) {
        return String.join(" ", words);
    }
}
