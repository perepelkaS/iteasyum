package lesson3;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        // S = 1 + 2 + 3 + ... + n


        Scanner scanner = new Scanner(System.in);
        System.out.println("> n = ");
        int n = scanner.nextInt();
        //System.out.println("user input:" + n);

        //int n = 3; // 1 + 2 + 3
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
            //System.out.println("s [" + i +"] = " + s);
        }
            System.out.println("s = " + s);
    }
}
