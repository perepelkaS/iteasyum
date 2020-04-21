package lesson3dz;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> Какое Кол-во цифр вы будете вводить = ");
        int a = scanner.nextInt();
        int i = 1;
        int p;
        int l;
        int nol = 0;
        int min = 2147483647;
        int max = 0;
        while (i <= a) {
            System.out.println("Введите" + i + " число > ");
            p = scanner.nextInt();

            if (p > max) {
                max = p;
            }
            if (p < min) {
                min = p;
            }

            while (p > 0) {
                l = p % 10;
                p /= 10;

                if (l == 0) {
                    nol = nol + 1;
                }
            }
            i++;
        }
        System.out.println(" Максимальное число = " + max);
        System.out.println(" Минимально число = " + min);
        System.out.println(" Кол-во нулей = " + nol);
    }
}
