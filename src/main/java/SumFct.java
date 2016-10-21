import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Perimeter of squares in a rectangle
 * https://www.codewars.com/kata/559a28007caad2ac4e000083/train/java
 */
public class SumFct {
    private static final ArrayList<BigInteger> _list = new ArrayList<>();

    static {
        _list.add(BigInteger.ONE);
        _list.add(BigInteger.ONE);
    }

    public static BigInteger perimeter(BigInteger n) {
        if (n.compareTo(BigInteger.valueOf(_list.size())) >= 0) {
            BigInteger n1 = _list.get(_list.size() - 2);
            BigInteger n2 = _list.get(_list.size() - 1);
            while (n.compareTo(BigInteger.valueOf(_list.size())) >= 0) {
                BigInteger sum = n1.add(n2);
                _list.add(sum);
                n1 = n2;
                n2 = sum;
            }

        }

        return _list.stream().
                limit(n.longValue() + 1)
                .reduce(BigInteger.ZERO, BigInteger::add)
                .multiply(BigInteger.valueOf(4));
    }
}
