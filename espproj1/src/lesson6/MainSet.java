package lesson6;

import java.util.Arrays;

public class MainSet {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 3, 6, 5, 1, 1};
        // unique(a) => 1, 3, 5, 6
        int [] b = unique(a);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }

    private static int[] unique(int[] a) {
        int[] result = new int[a.length];
        int resultLenght = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Step " + i + "==================");
            int candidate = a[i];
            System.out.println("candidate = " + candidate);

            boolean contains = contains(result, resultLenght, candidate);  // кандидат содержится в результате
            System.out.println("result = " + Arrays.toString(result));
            System.out.println( "result containt candidate = " + contains);

            if (!contains) {
                result[resultLenght] = candidate;
                resultLenght++;
                System.out.println(" add, lenght =" + resultLenght);
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
