package lesson24dz;

public class MainRF {
    public static void main(String[] args) {
        RationalFraction a = new RationalFraction(2, 558);
        RationalFraction b = new RationalFraction(3, 505);
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
        equality(a, b);
        output(a, b);
    }

    private static void addition(RationalFraction a, RationalFraction b) {
        if ((a.getB() <= 0) || (b.getB() <= 0)) {
            System.out.println("Число после точки не может быть меньше или равно ноль");
        }
        int whole = a.getA() + b.getA();
        int fractional = 0;
        int c = Integer.toString(a.getB()).length();
        int d = Integer.toString(b.getB()).length();
        if (c == d) {
            int e = a.getB() + b.getB();
            if (e == Math.pow(10, c)) {
                whole += 1;
                fractional = 0;
                System.out.println(whole + "," + fractional + "       a");
            }
            if (e > Math.pow(10, c)) {
                whole += 1;
                int f = a.getB() + b.getB();
                String f1 = String.valueOf(f);
                String f2 = f1.substring(1);
                System.out.println(whole + "," + f2 + "      b");
            }
            if (e < Math.pow(10, c)) {
                fractional = a.getB() + b.getB();
                System.out.println(whole + "," + fractional + "          c");
            }
        }

        if (c != d) {
            if (c > d) {
                int j = a.getB();
                int e = b.getB() * (int) Math.pow(10, (c - d));
            } else {
                int j = b.getB();
                int e = a.getB() * (int) Math.pow(10, (d - c));
            }
        }




    }

    private static void subtraction(RationalFraction a, RationalFraction b) {

    }

    private static void multiplication(RationalFraction a, RationalFraction b) {

    }

    private static void division(RationalFraction a, RationalFraction b) {

    }

    private static void equality(RationalFraction a, RationalFraction b) {

    }

    private static void output(RationalFraction a, RationalFraction b) {

    }

}
