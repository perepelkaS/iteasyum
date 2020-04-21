package lesson3dz;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Число = ");
        int p = scanner.nextInt();
        int l;
        int x = 0;
        int nol = 0;
        while (p > 0) {
            l = p % 10;
            p /= 10;
            if (l > x) {
                x = l;

            }
        }
        System.out.println("Максимальная цифра числа = " + x);


    }
}
