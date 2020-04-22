package lesson4;

public class MainMin {
    public static void main(String[] args) {
        System.out.println("resut = " + min(30, -9));
    }

    static int min (int a, int b, int c) {
//        int min1 = min(a, b);
//        return min (min1, c);
        return min (min (a, b), c);
    }


    static int min (int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
