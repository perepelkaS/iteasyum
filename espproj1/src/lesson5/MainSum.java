package lesson5;


public class MainSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println("sum = " + sum(a));

    }

    static int sum (int[] a) {
        int s  = 0;
        for (int i = 0; i < a.length; i++) {
            s = s + a[i];
            // s += a[i];
        }
        return s;
    }
}
