package lesson28;

public class MainHM2 {
    public static void main(String[] args) {
        System.out.println("fact = " + fact(4));
    }

    //F = 1 * 2 * 3 * ... * n
    static int fact (int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int result = n * fact(n - 1);
        return result;
    }
}
