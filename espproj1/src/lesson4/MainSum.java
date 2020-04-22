package lesson4;

public class MainSum {
    public static void main(String[] args) {
      System.out.println("sum = " + sum(3));
    }

    // s = 1 + 2 + 3 + ... + n
    static int sum (int n) {
        int r = 0;
        for (int i = 1; i <= n; i++) {
            r = r + i;
        }
        return r;
    }
}
