import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Decode the Morse code
 * http://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
 * <p/>
 * Decode the Morse code, advanced
 * http://www.codewars.com/kata/54b72c16cd7f5154e9000457/train/java
 */
public class MorseCodeDecoder {
    private static Map<String, String> MorseCode = new HashMap<>();

    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split("\\s{3}"))
                .map(w -> Arrays.stream(w.split("\\s"))
                        .map(MorseCode::get)
                        .collect(Collectors.joining()))
                .collect(Collectors.joining(" "));
    }

    public static String decodeBits(String bits) {
        int times = Arrays.stream(bits.split("0"))
                .mapToInt(String::length)
                .filter(i -> i != 0)
                .min()
                .getAsInt();
        bits = bits.replaceAll("(.){" + times + "}", "$1");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < bits.length() - 1; i += 2) {
            String bit = bits.substring(i, i + 2);
            switch (bit) {
                case "00":
                    result.append(" ");
                    break;
                case "10":
                    result.append(".");
                    break;
                case "11":
                    result.append("-");
                    break;
            }
        }
        return result.toString();
    }
}
