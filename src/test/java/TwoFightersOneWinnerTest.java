import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TwoFightersOneWinnerTest {
    @Test
    public void basicTests() {
        assertEquals("Lew", TwoFightersOneWinner.declareWinner(new TwoFightersOneWinner.Fighter("Lew", 10, 2),new TwoFightersOneWinner.Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", TwoFightersOneWinner.declareWinner(new TwoFightersOneWinner.Fighter("Lew", 10, 2),new TwoFightersOneWinner.Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", TwoFightersOneWinner.declareWinner(new TwoFightersOneWinner.Fighter("Harald", 20, 5), new TwoFightersOneWinner.Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", TwoFightersOneWinner.declareWinner(new TwoFightersOneWinner.Fighter("Harald", 20, 5), new TwoFightersOneWinner.Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", TwoFightersOneWinner.declareWinner(new TwoFightersOneWinner.Fighter("Jerry", 30, 3), new TwoFightersOneWinner.Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", TwoFightersOneWinner.declareWinner(new TwoFightersOneWinner.Fighter("Jerry", 30, 3), new TwoFightersOneWinner.Fighter("Harald", 20, 5), "Harald"));
    }


}
