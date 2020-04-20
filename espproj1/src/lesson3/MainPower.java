package lesson3;

public class MainPower {
    public static void main(String[] args) {
        //power(x,n) = x * x * ... x (n раз)
        int x = 2;
        int n = 8;
        int p = 1; // 2^3 = 2*2*2 = 8

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": p = " + p + "; new p = " + p * x);
            p = p * x;
        }
        System.out.println(x + "^" + n + "=" + p);
    }
}
