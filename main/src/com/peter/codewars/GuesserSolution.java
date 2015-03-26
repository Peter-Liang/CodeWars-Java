package com.peter.codewars;

/**
 * Created by peter on 3/26/15.
 * Solution of the kata 'Guess the number!'.
 * http://www.codewars.com/kata/5452113c699b538c18000b01/train/java
 */
public class GuesserSolution {
    public int getNumber() {
        return tryGuessNumber(1, 1000);
    }

    private int tryGuessNumber(int lower, int upper) {
        if (lower > upper) {
            return -1;
        }

        int myGuess = (lower + upper) / 2;
        String result = guess(myGuess);
        switch (result) {
            case "Too high!":
                return tryGuessNumber(lower, myGuess - 1);
            case "Too low!":
                return tryGuessNumber(myGuess + 1, upper);
            case "Correct!":
                return myGuess;
            default:
                return -1;
        }
    }

    private String guess(int x) {
        return null;
    }
}
