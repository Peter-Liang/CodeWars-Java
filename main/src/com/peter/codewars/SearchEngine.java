package com.peter.codewars;

/**
 * Created by peter on 3/23/15.
 * Solution of the kata 'String searching with wildcard'
 * http://www.codewars.com/kata/546c7f89bed2e12fb300056f/train/java
 */
public class SearchEngine {
    public static int find(String needle, String haystack) {
        if (needle.length() == 0 || needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            while (j < needle.length()) {
                if (needle.charAt(j) != '_' && needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }

                j++;
            }


            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}
