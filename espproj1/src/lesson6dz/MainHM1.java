package lesson6dz;

import java.util.Arrays;

public class MainHM1 {
    public static void main(String[] args) {
        int[] a = {1, 7, 4, 3, 5, 6, 8};
        System.out.print("Прямой обход ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Обратный обход ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("For each: ");
        for (int elem: a) {
            System.out.print(elem + " ");
        }

        System.out.println();


        System.out.println("До: " + Arrays.toString(a));
        reverse(a);
        System.out.println("После: " + Arrays.toString(a));
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int endIndex = a.length - 1 - i;
            int temp = a[i];
            a[i] = a[endIndex];
            a[endIndex] = temp;
        }
    }
}
