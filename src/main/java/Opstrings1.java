import java.util.function.Function;

/**
 * 6 kyu: Moves in squared strings (II)
 * https://www.codewars.com/kata/moves-in-squared-strings-ii/train/java
 */
public class Opstrings1 {
    public static String rot(String strng) {
        return new StringBuilder(strng).reverse().toString();
    }

    public static String selfieAndRot(String strng) {
        int dotLength = strng.indexOf("\n");
        String dotPadding = new String(new char[dotLength]).replace("\0", ".");
        return strng.replaceAll("\n", dotPadding + "\n") + dotPadding + "\n" + dotPadding + rot(strng).replaceAll("\n", "\n" + dotPadding);
    }

    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
