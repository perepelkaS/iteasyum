package lesson6;

import java.util.Arrays;

public class MainSimpleInsert {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = insert (a, 2, 6);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }

    /**
     * Выполняет создание нового массива с элементом
     * element  в индексе index
     * @param a
     * @param index
     * @param element
     * @return
     */
    private static int[] insert(int[] a, int index, int element) {
        int[] result = new int[a.length + 1];

        // копируем голову 1,2
        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }

        result[index] = element; // [2] = 6

        // копируем хвост: 3, 4, 5
        for (int i = index; i < a.length; i++) {
            result[i + 1] = a[i];
        }
        return result;
    }
}
