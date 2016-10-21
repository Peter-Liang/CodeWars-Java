/**
 * Created by peter on 4/14/15.
 * Solution of the kata 'Number of trailing zeros of N!'.
 * http://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/java
 */
public class Solution {
    public static int zeros(int n) {
        int count_two = 0, count_five = 0;

        for (int i = 2; i <= n; i++) {
            int current = i;
            while (current % 5 == 0) {
                current /= 5;
                count_five++;
            }
            while (current % 2 == 0) {
                current >>= 1;
                count_two++;
            }
        }

        return Integer.min(count_two, count_five);
    }
}