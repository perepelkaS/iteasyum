package lesson3dz;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> n = ");
        int a = scanner.nextInt();
        int c = a % 5;
        if (c == 0) {
            System.out.println("Введенное число делится на 5 без остатка");
        } else {
            System.out.println("Введенное число не делится на 5 без остатка");
        }
    }
}
