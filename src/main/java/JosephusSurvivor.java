import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Josephus Survivor
 * http://www.codewars.com/kata/555624b601231dc7a400017a/train/java
 */
public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> people = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
        int index = 0;
        while (people.size() > 1) {
            index = (index + (k - 1)) % people.size();
            people.remove(index);
        }

        return people.get(0);
    }
}
