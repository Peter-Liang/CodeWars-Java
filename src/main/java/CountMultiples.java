import java.math.BigInteger;
import java.util.TreeSet;

/**
 * 6kyu: Special Multiples
 * https://www.codewars.com/kata/55e785dfcb59864f200000d9/train/java
 */
public class CountMultiples {
    private static TreeSet<Long> primes = new TreeSet<>();

    public static long countSpecMult(long n, long mxval) {
        if (n == 0 || mxval == 0) {
            return 0;
        }

        for (long i = 2; primes.size() < n; i++) {

            final long finalI = i;
            if (primes.stream().allMatch(p -> finalI % p != 0)) {
                primes.add(i);
            }
        }

        BigInteger lcm = BigInteger.valueOf(primes.stream().limit(n).reduce((a, b) -> a * b).get());
        return BigInteger.valueOf(mxval).divide(lcm).longValue();
    }
}
