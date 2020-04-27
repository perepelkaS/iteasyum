package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class MainInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> n =");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println(" n > 0");
            return;
        }
        int[] items = new int[n];
        for ( int i = 0; i < n; i++) {
            System.out.println(i + " ; : >");
            items[i] = scanner.nextInt();
        }
        System.out.println("items = " + Arrays.toString(items));
    }
}
