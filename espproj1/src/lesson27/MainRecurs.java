package lesson27;

public class MainRecurs {
    // s = 1 + 2 + 3 + ... + n
    public static void main(String[] args) {
        sum(3);
        System.out.println(sum(3));
    }

    static int sum(int n) {
        if (n < 1) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return sum(n - 1) + n;
    }

}
