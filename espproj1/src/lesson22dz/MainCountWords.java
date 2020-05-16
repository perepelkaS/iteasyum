package lesson22dz;

import java.util.Scanner;

public class MainCountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение > ");
        String a = scanner.nextLine();
        int number = 0;
        char error1 = a.charAt(0);
        char error2 = a.charAt(a.length() - 1);

        for (int i = 1; i < a.length(); i++) {
        if (error2 != '.') {
            System.out.println("Предложение должно заканчиваться на '.' ");
            break;
        }
        if (error1 == ' ' || error1 == '.' || error1 == ',' || error1 == ':' || error1 == ';') {
            System.out.println("Предложение не может ничинаться с пробела '.' ',' ':' ';'");
            break;
        }
                char c = a.charAt(i);
                if (c == ' ' || c == '.' || c == ',' || c == ':' || c == ';') {
                    number++;
                }
            }
            System.out.println("В вашем предложение " + number + " слов");

    }
}
