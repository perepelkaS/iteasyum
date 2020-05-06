package lesson7;

import java.util.Random;

public class MainSeaBattle {
    static final int SIZE = 9;
    static final char SEA_CHAR = '~';

    public static void main(String[] args) {
        Random random = new Random();

    char[][] compSea = new char[SIZE][SIZE];
    initSea(compSea);
    printSea("Корабли противника", compSea);

    //начальная точка
        int[] point = {4, 4};
    // длина
        int length = random.nextInt(4) + 1;
    // флаг




    }

    private static void printSea(String title, char[][] sea) {
        System.out.println(title);

        System.out.print("  ");
        for (int i = 0; i < sea.length; i++ ) {
            System.out.print((char)('a' + i));
        }
        System.out.println();

        for (int i = 0; i < sea.length; i++ ) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < sea[i].length; j++) {
                System.out.print(sea[i][j]);
            }
            System.out.println();
        }
    }

    private static void initSea(char[][] sea) {
        for (int i = 0; i < sea.length; i++ ) {
            for (int j = 0; j < sea[i].length; j++) {
                sea[i][j] = SEA_CHAR;
            }
        }
    }
}
