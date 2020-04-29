package lesson6;

import java.util.Arrays;

public class MainEquals {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};
        System.out.println(Arrays.toString(a) + " == " + Arrays.toString(b) + " : " + a.equals(b));
    }
}
