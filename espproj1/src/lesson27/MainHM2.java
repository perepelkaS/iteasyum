package lesson27;

import java.util.Scanner;

public class MainHM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = null;
        while (true) {
            System.out.print("> ");
            userInput = scanner.nextLine();
            try {
                validateUserPoint(userInput);
            } catch (UserPointException e) {
                System.out.println("Ваш ход некорректен: " + e.getMessage());
                System.out.println("Был сделан ход: " + e.getUserPoint());
                e.printStackTrace();
            } finally {
                System.out.println("Всегда");
            }
        }
    }

    static void validateUserPoint(String userPoint) throws UserPointException {
        if (userPoint == null) {
            throw new UserPointException("Ход должен быть задан", userPoint);
        }

        if (userPoint.length() != 2) {
            throw new UserPointException("Должен состоять из 2 символов", userPoint);
        }

        char number = userPoint.charAt(0);
        if (number < '1' || number > '9') {
            throw new UserPointException("ервый символ должен быть число от 1 до 9", userPoint);
        }

        char letter = userPoint.charAt(1);
        if (letter < 'a' || letter > 'i') {
            throw new UserPointException("Второй символ должен быть буквой от a - i", userPoint);
        }
    }


}
