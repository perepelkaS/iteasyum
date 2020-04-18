package lesson1;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int longName = 1234;
        int b = 3;
        int r = (a + longName) * b;


        double r2 = (double) (a + longName) / b;

        System.out.println("r2 =" + r2);

        boolean cond1 = true;
        boolean cond2 = !cond1;
        boolean cond3 = a > b;
        System.out.println(cond1);
        System.out.println(cond2);
        System.out.println(cond3);
    }
}
