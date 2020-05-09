package lesson7;

import java.util.Random;

public class MainSeaBattle {
    static final int SIZE = 9;
    static final char SEA_CHAR = '~';
    static final char SHIP_CHAR = 'o';

    public static void main(String[] args) {
        Random random = new Random();

    char[][] compSea = new char[SIZE][SIZE];
    initSea(compSea);

    //начальная точка
        int[] point = {4, 4};
    // длина
        int length = random.nextInt(4) + 1;
    // флаг
        boolean isHoriz = random.nextBoolean();
        addShipToSea(compSea, point, length, isHoriz);

        printSea("Корабли противника", compSea);




    }

    private static void addShipToSea(char[][] sea, int[] point, int length, boolean isHoriz) {
        int x = point[0];
        int y = point[1];
        if (isHoriz) {
            for (int j = 0; j < length; j++) {
                sea[y][x = j] = SHIP_CHAR;
            }
        } else {
            for (int i = 0; i < length; i++) {
                sea[y + 1][x] = SHIP_CHAR;
            }
        }
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
