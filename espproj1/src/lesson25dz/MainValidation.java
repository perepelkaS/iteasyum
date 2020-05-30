package lesson25dz;

import java.util.Scanner;

public class MainValidation {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку хода > ");
            String a = scanner.nextLine();
            try {
                validation(a);
                System.out.println("Ход сделан");
            } catch (IllegalArgumentException e) {
                System.out.println("Проверте условие: " + e.getMessage());
            }
        }
    }

    private static void validation(String a) {
        if (a.length() != 2) {
            throw new IllegalArgumentException("Строка должна состоять из 2 символов");
        }
        char c = a.charAt(0);
        char b = a.charAt(1);
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
        } else {
            throw new IllegalArgumentException("Первый символ = цифра от 1 до 9");
        }

        if (b == 'a' || b == 'b' || b == 'c' || b == 'd' || b == 'i') {
        } else {
            throw new IllegalArgumentException("Второй символ = буква от а до i");
        }

    }
}


