package PasswordGenerator;

import java.util.Random;

public class PasswordGenerator {


//
//            2.Збереження в локальний репозиторій Maven:
//
//    a. Створіть Maven-проект для вашого генератора паролів.
//
//    b. Додайте ваш клас PasswordGenerator до цього проекту.
//
//    c. Зберіть проект та встановіть його артефакт в локальний репозиторій Maven за допомогою команди mvn install.
//
//	3.Підключення та використання у новому проекті:
//
//    a. Створіть новий Maven-проект, в якому ви будете використовувати генератор паролів.
//
//    b. Додайте залежність до вашого генератора паролів у файлі pom.xml нового проекту.
//
//    c. Імпортуйте клас PasswordGenerator у вашому новому проекті та використовуйте його метод для генерації паролів.
//
//            4.Перевірка роботи:
//
//    a. Створіть об'єкт класу PasswordGenerator у вашому новому проекті та викличте його метод generatePassword для генерації пароля.
//
//    b. Перевірте, що згенерований пароль відповідає очікуваній довжині та містить випадкові символи.


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
