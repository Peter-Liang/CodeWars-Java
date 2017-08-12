import java.util.stream.IntStream;

/**
 * 8 kyu: Invert values
 * https://www.codewars.com/trainer/java
 */
public class InvertValue {
    public static int[] invert(int[] array) {
        return IntStream.of(array)
                .map(a -> a * -1)
                .toArray();
    }
}
