package lesson1_1;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 20;
        int d = 0;
        double per = 12.45;
        double per2 = 34.23;
        double per3 = 45.67;
        int exp = c - (a + b);
        int exp2 = c + a - b;
        double exp3 = per + per2;
        double exp4 = per3 - (per + per2);
        double exp5 = per3 - c;
        double exp6 = (double) c / b;
        int exp7 = (int) (per2 - per);

        System.out.println("exp = " + exp);
        System.out.println("exp2 = " + exp2);
        System.out.println("exp3 = " + exp3);
        System.out.println("exp4 = " + exp4);
        System.out.println("exp5 = " + exp5);
        System.out.println("exp6 = " + exp6);
        System.out.println("exp7 = " + exp7);

        if (d != 0) {
            int exp8 = c / d;
            System.out.println("exp8 = " + exp8);
        }
        else {
            System.out.println("На ноль делить нельзя");
        }
        }
}
