import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VolTankTest {

    @Test
    public void test0() {
        System.out.println("Fixed Tests");
        assertEquals(2940, VolTank.tankVol(5, 7, 3848));
        assertEquals(907, VolTank.tankVol(2, 7, 3848));
    }
}