/**
 * 4 kyu: Roman Numerals Encoder
 * https://www.codewars.com/kata/51b62bf6a9c58071c600001b/train/java
 */
public class Conversion {

    private static String getSymbol(int num, String one, String five, String ten) {
        switch (num) {
            case 1:
                return one;
            case 2:
                return one + one;
            case 3:
                return one + one + one;
            case 4:
                return one + five;
            case 5:
                return five;
            case 6:
                return five + one;
            case 7:
                return five + one + one;
            case 8:
                return five + one + one + one;
            case 9:
                return one + ten;
        }

        return "";
    }

    public String solution(int n) {
        StringBuilder result = new StringBuilder();
        while (n >= 1000) {
            result.append("M");
            n -= 1000;
        }
        if (n >= 100) {
            result.append(getSymbol(n / 100, "C", "D", "M"));
            n %= 100;
        }
        if (n >= 10) {
            result.append(getSymbol(n / 10, "X", "L", "C"));
            n %= 10;
        }
        if (n > 0) {
            result.append(getSymbol(n, "I", "V", "X"));
        }

        return result.toString();
    }
}
