package lesson7;

import java.util.Arrays;

public class MainMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        /*
        1 2
        3 4
         */
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        System.out.println("matrix = " + Arrays.toString(matrix)); // не работает с двумерными массивами
        printMatrix(matrix);

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Число строк: " + matrix2.length);
        System.out.println("Число столбцов: " + matrix2[0].length);
        printMatrix(matrix2);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
