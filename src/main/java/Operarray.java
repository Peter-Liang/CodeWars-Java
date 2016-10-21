import java.util.function.LongBinaryOperator;

/**
 * 6 kyu: Reducing by steps
 * https://www.codewars.com/kata/reducing-by-steps/train/java
 */
public class Operarray {
    public static long gcdi(long x, long y) {
        x = Math.abs(x);
        y = Math.abs(y);
        return y == 0 ? x : gcdi(y, x % y);
    }

    public static long lcmu(long a, long b) {
        return Math.abs(a * (b / gcdi(a, b)));
    }

    public static long som(long a, long b) {
        return a + b;
    }

    public static long maxi(long a, long b) {
        return Math.max(a, b);
    }

    public static long mini(long a, long b) {
        return Math.min(a, b);
    }

    public static long[] operArray(LongBinaryOperator operator, long[] arr, long init) {
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = operator.applyAsLong(i == 0 ? init : result[i - 1], arr[i]);
        }
        return result;
    }
}
