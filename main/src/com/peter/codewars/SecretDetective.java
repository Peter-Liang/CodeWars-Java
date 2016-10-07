package com.peter.codewars;

import java.util.HashSet;

/**
 * 4 kyu: Recover a secret string from random triplets
 * https://www.codewars.com/kata/53f40dff5f9d31b813000774/train/java
 */
public class SecretDetective {
    public String recoverSecret(char[][] triplets) {
        HashSet<Character> chars = new HashSet<>();
        for (char[] triplet : triplets) {
            for (char c : triplet) {
                chars.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (sb.length() < chars.size()) {
            chars.stream()
                    .filter(c -> sb.chars().noneMatch(s -> s == c) && Satisfied(triplets, sb, c))
                    .forEach(sb::append);
        }

        return sb.toString();
    }

    private boolean Satisfied(char[][] triplets, StringBuilder sb, Character c) {
        for (char[] triplet : triplets) {
            for (int i = 1; i < triplet.length; i++) {
                if (c == triplet[i]) {
                    final int index = i;
                    if (sb.chars().noneMatch(s -> s == triplet[index - 1])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
