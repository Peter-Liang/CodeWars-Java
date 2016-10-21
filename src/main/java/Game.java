/**
 * Created by peter on 3/24/15.
 * Solution of the kata 'Simple card game'.
 * http://www.codewars.com/kata/53417de006654f4171000587/train/java
 */
public class Game {
    private static final String cards = "23456789TJQKA";

    public String winner(String[] deckSteve, String[] deckJosh) {
        int steveScore = 0, joshScore = 0;
        for (int i = 0; i < deckSteve.length; i++) {
            if (cards.indexOf(deckSteve[i].charAt(0)) > cards.indexOf(deckJosh[i].charAt(0))) {
                steveScore++;
            } else if (cards.indexOf(deckSteve[i].charAt(0)) < cards.indexOf(deckJosh[i].charAt(0))) {
                joshScore++;
            }
        }
        if (steveScore != joshScore) {
            return String.format("%s wins %d to %d"
                    , steveScore > joshScore ? "Steve" : "Josh"
                    , Integer.max(steveScore, joshScore)
                    , Integer.min(steveScore, joshScore));
        }
        return "Tie";
    }
}
