package lesson5;

public class MainIndex {
    public static void main(String[] args) {
        int [] a = {1, 5, 19, 7};
        System.out.println("indexOf = " + indexOf(a, 19));
        System.out.println("contains = " + contains(a, 19));
    }

    static int indexOf(int[] a, int test) {
        int  index = -1;
        for (int i = 0; i < a.length; i++) {
            if (test == a[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    static boolean contains (int[] a, int test) {
        int index = indexOf(a, test);
        return index != -1;
        // return index(a, test) != -1;
    }
}
