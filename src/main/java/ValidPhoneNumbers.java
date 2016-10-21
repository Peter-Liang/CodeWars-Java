/**
 * 6kyu: Valid Phone Number
 * https://www.codewars.com/kata/525f47c79f2f25a4db000025/train/java
 */
public class ValidPhoneNumbers {
    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\(\\d{3}\\)\\s\\d{3}\\-\\d{4}$");
    }
}
