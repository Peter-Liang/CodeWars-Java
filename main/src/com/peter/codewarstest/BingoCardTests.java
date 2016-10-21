package com.peter.codewarstest;

import com.peter.codewars.BingoCard;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BingoCardTests {
    @Test
    public void cardHas24Numbers() {
        assertEquals("A card contains 24 numbers.", 24, BingoCard.getCard().length);
    }

    @Test
    public void eachNumberOnCardIsUnique() {
        for (int i = 0; i < 10; i++) {
            String[] card = BingoCard.getCard();

            Set<String> set = new HashSet<String>(Arrays.asList(card));

            assertTrue(String.format("Card numbers are not unique: %s", String.join(" ", card)), set.size() == card.length);
        }
    }

    @Test
    public void categoriesAreInCorrectOrder() {
        String[] card = BingoCard.getCard();

        checkCategory(card, "B", 1, 5);
        checkCategory(card, "I", 6, 10);
        checkCategory(card, "N", 11, 14);
        checkCategory(card, "G", 15, 19);
        checkCategory(card, "O", 20, 24);
    }

    private void checkCategory(String[] card, String column, int start, int end) {
        for (int i = start - 1; i < end; i++) {
            assertTrue(String.format("Number should start with '%s', found: '%s')", column, card[i]), card[i].startsWith(column));
        }
    }

    @Test
    public void numbersWithinColumnAreAllInTheCorrectRange() {
        String[] card = BingoCard.getCard();

        checkColumn(card, "B", 1, 5, 1, 15);
        checkColumn(card, "I", 6, 10, 16, 30);
        checkColumn(card, "N", 11, 14, 31, 45);
        checkColumn(card, "G", 15, 19, 46, 60);
        checkColumn(card, "O", 20, 24, 61, 75);
    }

    private void checkColumn(String[] card, String column, int start, int end, int beginRange, int endRange) {
        for (int i = start - 1; i < end; i++) {
            int n = Integer.valueOf(card[i].substring(1));
            assertTrue(String.format("Number should be in range from %d to %d, found: '%s')", beginRange, endRange, card[i]), n >= beginRange && n <= endRange);
        }
    }

    @Test
    public void numbersWithinColumnAreInRandomOrder() {
        String[] card = BingoCard.getCard();

        int count = checkColumnOnRandomness(card, "B", 1, 5) +
                checkColumnOnRandomness(card, "I", 6, 10) +
                checkColumnOnRandomness(card, "N", 11, 14) +
                checkColumnOnRandomness(card, "G", 15, 19) +
                checkColumnOnRandomness(card, "O", 20, 24);

        assertTrue(String.format("Unlikely event: found only %d columns that are in random order.", count), count > 1);
    }

    private int checkColumnOnRandomness(String[] card, String column, int start, int end) {
        int n = 0;
        boolean up = false;
        boolean down = false;

        for (int i = start - 1; i < end; i++) {
            int n1 = Integer.valueOf(card[i].substring(1));

            if (n != 0) {
                if (n1 > n) up = true;
                if (n1 < n) down = true;
            }
            n = n1;
        }

        return up && down ? 1 : 0;
    }
}

