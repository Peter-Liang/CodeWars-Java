import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Tribonacci Sequence
 * http://www.codewars.com/kata/556deca17c58da83c00002db/train/java
 */
public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        List<Double> result = Arrays.stream(s).boxed().collect(Collectors.toList());
        for (int i = result.size() - 1; i < n - 1; i++) {
            result.add(result.get(i - 2) + result.get(i - 1) + result.get(i));
        }

        return result.stream().limit(n).mapToDouble(Double::doubleValue).toArray();
    }
}
