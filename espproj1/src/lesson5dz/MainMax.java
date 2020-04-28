package lesson5dz;

import java.util.Arrays;

public class MainMax {
    public static void main(String[] args) {
        int[] a = {20, 30, 5, 75, 79,8};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("max = " + max(a));

    }

    static int max (int[] a) {
        int b = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (b < a[i]) {
                b = a[i];
            }
        }
        return b;
    }
}
