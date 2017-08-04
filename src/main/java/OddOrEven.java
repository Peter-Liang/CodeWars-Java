import java.util.Arrays;

/**
 * 7 kyu Odd or Even?
 * http://www.codewars.com/kata/odd-or-even/train/java
 */
public class OddOrEven {
    public static String oddOrEven(int[] array) {
        boolean isEven = Arrays.stream(array)
                .filter(a -> a % 2 != 0)
                .count() % 2 == 0;
        return isEven ? "even" : "odd";
    }
}
