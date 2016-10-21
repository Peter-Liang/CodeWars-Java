import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Checking Groups
 * http://www.codewars.com/kata/54b80308488cb6cd31000161/train/java
 */
public class Groups {
    private static final String open = "{([";
    private static final String close = "})]";
    private static final Map<Character, Character> pairs = new HashMap<>();

    static {
        pairs.put('{', '}');
        pairs.put('(', ')');
        pairs.put('[', ']');
    }

    public static boolean groupCheck(String s) {
        Stack<Character> group = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (open.indexOf(c) != -1) {
                group.push(c);
            } else if (close.indexOf(c) != -1) {
                if (group.empty() || pairs.get(group.pop()) != c) {
                    return false;
                }
            }
        }

        return group.empty();
    }
}
