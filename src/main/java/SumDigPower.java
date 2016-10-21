import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * 6 kyu: Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!
 * https://www.codewars.com/kata/take-a-number-and-sum-its-digits-raised-to-the-consecutive-powers-and-dot-dot-dot-eureka/train/java
 */
public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        return LongStream.range(a, b + 1)
                .filter(i -> {
                    String str = Long.toString(i);
                    long sum = 0;
                    for (int j = 0; j < str.length(); j++) {
                        sum += Math.pow(Character.getNumericValue(str.charAt(j)), j + 1);
                    }
                    return sum == i;
                })
                .boxed()
                .collect(Collectors.toList());
    }
}
