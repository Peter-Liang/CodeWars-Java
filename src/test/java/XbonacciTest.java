import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class XbonacciTest {

    private Xbonacci _xbonacci;

    @Before
    public void setUp() {
        _xbonacci = new Xbonacci();
    }

    @Test
    public void basicTest() {
        assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, _xbonacci.tribonacci(new double[]{1, 1, 1}, 10), 0);
        assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, _xbonacci.tribonacci(new double[]{0, 0, 1}, 10), 0);
        assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, _xbonacci.tribonacci(new double[]{0, 1, 1}, 10), 0);
    }
}