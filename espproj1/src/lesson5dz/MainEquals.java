package lesson5dz;

import java.util.Arrays;

public class MainEquals {
    public static void main(String[] args) {
        int[] a = {3, 2, 4};
        int[] b = {2, 2, 4};
        System.out.print(Arrays.toString(a) + " " + Arrays.toString(b) + " равны: " + equals(a,b) );
    }

    static boolean equals (int[] a, int[] b) {
            if (a.length != b.length) {
                return false;
            }

            for (int i = 0; (i < a.length) && (i < b.length); i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;

    }
}
