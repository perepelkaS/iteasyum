package lesson5;

public class MainCount {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, 0, 1, 5, 6, 5, 7};
        int test = 7;
        System.out.println("countOf = " + countOf(a, test));
    }

    static int countOf(int[] a, int test) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == test) {
                count++;
            }
        }
        return count;
    }
}
