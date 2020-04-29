package lesson6;

import java.util.Arrays;

public class MainDeleteWithCopy {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
//        int[] b = deleteMix(a, 2);
        int[] b = delete(a, 2);
        System.out.println("b = " + Arrays.toString(b));
    }
// он меняет исходный массив а (это плохо)
    private static int[] deleteMix(int[] a, int index) {
        for (int i = index; i < a.length - 1; i++) {
            System.out.println(i + " : " + a[i] + " <- " + a[i + 1]);
            a[i] = a[i + 1];
        }
        return Arrays.copyOfRange(a, 0, a.length - 1);
    }

    static  int[] delete(int[] a, int index) {
        int[] result = new int[a.length - 1];
        //копируем голову
        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }
        //копируем хвост
        // массив а на 1 больше
        for (int i = index + 1; i < a.length; i++) {
            result [i - 1] = a[i];
        }
        return result;
    }
}
