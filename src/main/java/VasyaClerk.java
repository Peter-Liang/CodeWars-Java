import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Vasya - Clerk
 * http://www.codewars.com/kata/555615a77ebc7c2c8a0000b8/train/java
 */
public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {
        Map<Integer, AtomicInteger> change = new HashMap<>();
        change.put(25, new AtomicInteger(0));
        change.put(50, new AtomicInteger(0));
        for (int bill : peopleInLine) {
            switch (bill) {
                case 25:
                    change.get(25).getAndIncrement();
                    break;
                case 50:
                    if (change.get(25).getAndDecrement() == 0) {
                        return "NO";
                    }
                    change.get(50).getAndIncrement();
                    break;
                case 100:
                    if (change.get(25).get() > 0 && change.get(50).get() > 0) {
                        change.get(25).getAndDecrement();
                        change.get(50).getAndDecrement();
                    } else if (change.get(25).get() >= 3) {
                        change.get(25).addAndGet(-3);
                    } else {
                        return "NO";
                    }
                    break;
            }
        }
        return "YES";
    }
}
