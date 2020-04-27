package lesson5;

public class MainMin {
    public static void main(String[] args) {
        int [] a = {12, 8, 9, 0, -1, 7, -100};
        System.out.println("min = " + min(a));
    }
    static int min (int [] a) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if ( result > a[i]) {
                result = a[i];
            }
        }
        return result;
    }
}
