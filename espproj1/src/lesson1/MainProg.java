package lesson1;

public class MainProg {
    public static void main(String[] args) {
        int a = 1;
        int b = 89;
        int c = 76;
        int d = 0;

        int r1 = (a * b + c);
        System.out.println(r1);
        if (d != 0) {
            int r = r1 / d;
            System.out.println(r);
        }
        else {
            System.out.println("На ноль делить нельзя");
        }
    }
}
