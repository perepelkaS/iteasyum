package lesson6;

import java.util.Arrays;

public class MainDelete {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int usedLenght = deleteElement(a,2, a.length);
        print(a, usedLenght);
      usedLenght = deleteElement(a, 2, usedLenght);
        print(a, usedLenght);
        usedLenght = deleteElement(a, 2, usedLenght);
        print(a, usedLenght);
    }

    static void print (int[] a, int usedLenght) {
        System.out.print("a = [");
        for (int i = 0; i < usedLenght; i++) {
            System.out.print("" + a[i]);
        }
        System.out.println("]");
    }

    /**
     * Метод удаляет из массива a элемент с индексом index
     * @param a
     * @param index
     * @return новую длинну массива
     */
    private static int deleteElement(int[] a, int index, int usedLenght) {
        if (index < 0 || index >= usedLenght) {
            return usedLenght;
        }
        for (int i = index; i < usedLenght - 1; i++) {
            a[i] = a[i + 1];
        }
        return usedLenght - 1;
    }
}
