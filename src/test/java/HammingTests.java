import org.junit.Assert;
import org.junit.Test;

public class HammingTests {

    @Test
    public void Test1() {
        Assert.assertEquals("hamming(1) should be 1", 1, Hamming.hamming(1));
        Assert.assertEquals("hamming(2) should be 2", 2, Hamming.hamming(2));
        Assert.assertEquals("hamming(3) should be 3", 3, Hamming.hamming(3));
        Assert.assertEquals("hamming(4) should be 4", 4, Hamming.hamming(4));
        Assert.assertEquals("hamming(5) should be 5", 5, Hamming.hamming(5));
        Assert.assertEquals("hamming(6) should be 6", 6, Hamming.hamming(6));
        Assert.assertEquals("hamming(7) should be 8", 8, Hamming.hamming(7));
        Assert.assertEquals("hamming(8) should be 9", 9, Hamming.hamming(8));
        Assert.assertEquals("hamming(9) should be 10", 10, Hamming.hamming(9));
        Assert.assertEquals("hamming(10) should be 12", 12, Hamming.hamming(10));
        Assert.assertEquals("hamming(11) should be 15", 15, Hamming.hamming(11));
        Assert.assertEquals("hamming(12) should be 16", 16, Hamming.hamming(12));
        Assert.assertEquals("hamming(13) should be 18", 18, Hamming.hamming(13));
        Assert.assertEquals("hamming(14) should be 20", 20, Hamming.hamming(14));
        Assert.assertEquals("hamming(15) should be 24", 24, Hamming.hamming(15));
        Assert.assertEquals("hamming(16) should be 25", 25, Hamming.hamming(16));
        Assert.assertEquals("hamming(17) should be 27", 27, Hamming.hamming(17));
        Assert.assertEquals("hamming(18) should be 30", 30, Hamming.hamming(18));
        Assert.assertEquals("hamming(19) should be 32", 32, Hamming.hamming(19));
        Assert.assertEquals("hamming(26) should be 60", 60, Hamming.hamming(26));
        Assert.assertEquals("hamming(934) should be 33554432", 33554432, Hamming.hamming(934));
        Assert.assertEquals("hamming(1365) should be 430467210", 430467210, Hamming.hamming(1365));
    }

}
