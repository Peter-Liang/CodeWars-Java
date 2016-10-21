import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModSystemTest {

    @Test
    public void basicTest() {
        assertEquals("-3--5--2--1-", ModSystem.fromNb2Str(187, new int[]{8, 7, 5, 3}));
    }

    @Test
    public void notCoprimeNotApplicable() {
        assertEquals("Not applicable", ModSystem.fromNb2Str(6, new int[]{2, 3, 4}));
        assertEquals("Not applicable", ModSystem.fromNb2Str(15, new int[]{8, 6, 5}));
    }

    @Test
    public void notBiggerNotApplicable() {
        assertEquals("Not applicable", ModSystem.fromNb2Str(7, new int[]{2, 3}));
    }
}