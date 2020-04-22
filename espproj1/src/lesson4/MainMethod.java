package lesson4;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("method result = " + (power(2, 11) + power(3, 9)));

        simple();
        withValue();
        int result = withValue();
    }

    // x ^ n
    static int power (int x, int n) {
        int r = 1;
        for (int i = 0; i < n; i++) {
            r = r * x;
        }
        return r;
    }

    // процедура
    static void simple () {
      /*

      код

       */
        System.out.println("simple");
    }

    static int withValue () {
        System.out.println("withValue");
        return 0;
    }
}
