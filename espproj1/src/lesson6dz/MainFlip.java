package lesson6dz;

import java.util.Arrays;

public class MainFlip {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 2, 5};
        int[] b = flip(a);
        System.out.println("До : " + Arrays.toString(a) + " После : " + Arrays.toString(b));

    }

    private static int[] flip(int[] a) {
        int c = 0;
        int[] result = new int[a.length];
        for (int i = a.length - 1; i < a.length; i--) {
            if (i >= 0) {
                result[c] = a[i];
                c++;
            } else {
                break;
            }
        }
            return result;
    }
}
