package com.peter.codewars;

/**
 * 6 kyu: Create Phone Number
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
 */
public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder builder = new StringBuilder(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            switch (builder.length()) {
                case 0:
                    builder.append('(');
                    break;
                case 4:
                    builder.append(") ");
                    break;
                case 9:
                    builder.append('-');
                    break;
            }

            builder.append(number);
        }

        return builder.toString();
    }
}
