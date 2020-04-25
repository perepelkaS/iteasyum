package lesson4dz;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        int a = (int) ( Math.random() * (10 - 1) + 1 );
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число от 1 до 10  > ");
            int b = scanner.nextInt();
            if (a == b) {
                System.out.println("Вы правильно угадали число");
                break;
            }

            if (a > b) {
                System.out.println("Ваше число меньше загаданного");
            } else if (a < b) {
                System.out.println("Ваше число больше загаданного");
            } else {
                System.out.println("Error");
            }
        }


    }

}
