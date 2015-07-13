package com.peter.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Decode the Morse code
 * http://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
 */
public class MorseCodeDecoder {
    private static Map<String, String> MorseCode = new HashMap<>();

    public static String decode(String morseCode) {
        morseCode = morseCode.trim();
        String[] words = morseCode.split("   ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String[] charater = word.split(" ");
            Arrays.stream(charater).forEach(c -> result.append(MorseCode.get(c)));
            result.append(" ");
        }
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }
//        return result.toString();
        return Arrays.stream(morseCode.trim().split("\\s{3}"))
                .map(w -> Arrays.stream(w.split("\\s"))
                        .map(MorseCode::get)
                        .collect(Collectors.joining()))
                .collect(Collectors.joining(" "));
    }
}
