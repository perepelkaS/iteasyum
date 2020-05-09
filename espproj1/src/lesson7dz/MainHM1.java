package lesson7dz;

import java.util.Arrays;

public class MainHM1 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 3, 21},
                {0, 7, 6}
        };

        printMatrix(a);
        System.out.println("Максимум " + max(a));
    }
    static int max(int[][] a) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (result < a[i][j]) {
                    result = a[i][j];
                }
            }
        }
        return result;
    }

    private static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
