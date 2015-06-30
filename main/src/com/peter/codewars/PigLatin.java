package com.peter.codewars;

import java.util.regex.Pattern;

public class PigLatin {
    private static final String vowles = "aeiou";

    public String translate(String str) {
        if (Pattern.compile("\\d").matcher(str).find()) {
            return null;
        }

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (vowles.indexOf(str.charAt(i)) != -1) {
                return i == 0 ? str + "way" : str.substring(i) + str.substring(0, i) + "ay";
            }
        }

        return str + "ay";
    }
}
