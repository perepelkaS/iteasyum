package lesson5;

import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 123;
        a[1] = 90;
        a[2] = 40;
        a[3] = 123;
        System.out.println("a = " + a);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a [" + i + "] = " + a[i]);
        }
        System.out.println("a = " + Arrays.toString(a));

        int[] b = new int[]{1, 2, 3};
        System.out.println("b = " + Arrays.toString(b));

        int [] c = {1, 2, 3};
        System.out.println("c = " + Arrays.toString(c));
    }
}
