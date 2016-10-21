/**
 * Delta Bits
 * https://www.codewars.com/kata/538948d4daea7dc4d200023f/train/java
 */
public class DeltaBits {
    public static int convertBits(int a, int b) {
        return Integer.toBinaryString(a ^ b).replaceAll("0", "").length();
    }
}
