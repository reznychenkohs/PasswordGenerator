package PasswordGenerator;

import java.util.Random;

public class PasswordGenerator {

    private static final Random RANDOM = new Random();
    public static final String CAPITAL_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String SMALL_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";
    public static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+-=[]{}|;:',.<>?/";

    public static final String ALL_CHARACTERS = CAPITAL_LETTERS + SMALL_LETTERS + NUMBERS + SPECIAL_CHARACTERS;
    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = RANDOM.nextInt(ALL_CHARACTERS.length());
            password.append(ALL_CHARACTERS.charAt(randomIndex));

        }
        return password.toString();

    }

}
