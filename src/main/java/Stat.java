import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 6 kyu: Statistics for an Athletic Association
 * https://www.codewars.com/kata/55b3425df71c1201a800009c/train/java
 */
public class Stat {
    public static String stat(String strg) {
        if (strg.trim().isEmpty()) {
            return "";
        }

        List<Long> results = Stream.of(strg.split(",")).map(Stat::toSeconds).sorted().collect(Collectors.toList());
        long range = Collections.max(results) - Collections.min(results);
        double average = results.stream().mapToLong(Long::longValue).average().getAsDouble();
        double median = results.size() % 2 == 0 ?
                results.stream().skip(results.size() / 2 - 1).limit(2).mapToLong(Long::longValue).average().getAsDouble() :
                results.stream().mapToDouble(Long::doubleValue).skip(results.size() / 2).findFirst().getAsDouble();

        return String.format("Range: %1$s Average: %2$s Median: %3$s", formatSeconds(range), formatSeconds((long) average), formatSeconds((long) median));
    }

    private static long toSeconds(String result) {
        int[] time = Stream.of(result.trim().split("\\|")).mapToInt(Integer::parseInt).toArray();
        Duration hours = Duration.ofHours(time[0]);
        Duration minutes = Duration.ofMinutes(time[1]);
        Duration seconds = Duration.ofSeconds(time[2]);
        return hours.plus(minutes).plus(seconds).getSeconds();
    }

    private static String formatSeconds(long seconds) {
        long second = seconds % 60;
        long minute = seconds / 60 % 60;
        long hour = seconds / 3600;
        return String.format("%02d|%02d|%02d", hour, minute, second);
    }
}
