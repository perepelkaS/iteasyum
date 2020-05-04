package lesson6dz;

import java.util.Arrays;

public class MainCommonElements {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 8, 4, 4};
        int[] b = {2, 3, 7, 8, 4, 8};
        int[] c = commonElements(a, b);
        int[] m = unique(c);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("Результат = " + Arrays.toString(m));
    }

    private static int[] commonElements(int[] a, int[] b) {
        int [] result = new int[a.length];
        int l = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++){
                if (a[i] == b[j]) {
                    result[l] = a[i];
                    l++;
                }
            }
        }
        return Arrays.copyOfRange(result, 0, l);
    }

    private static int[] unique(int[] c) {
        int[] result = new int[c.length];
        int resultLenght = 0;

        for (int i = 0; i < c.length; i++) {
            int candidate = c[i];

            boolean contains = contains(result, resultLenght, candidate);

            if (!contains) {
                result[resultLenght] = candidate;
                resultLenght++;
            }
        }
        return Arrays.copyOfRange(result, 0, resultLenght);
    }

    static boolean contains (int[] result, int resultLenght, int candidate) {
        for (int j = 0; j < resultLenght; j++) {
            if (result[j] == candidate) {
                return true;
            }
        }
        return  false;
    }

}

//int a = (a.length < b.length) ? a.length : b length;
//Тоже самое что и:
//if ( a.length < b.length) {
//a = a.length;
//} else {
//a = b.length;
//}
