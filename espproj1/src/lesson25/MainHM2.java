package lesson25;

public class MainHM2 {
    public static void main(String[] args) {
        RationalFraction r1 = new RationalFraction(1, 2);
        RationalFraction r2 = new RationalFraction(2, 3);
        System.out.println("r1 = " + r1);
        System.out.printf("%s * %s = %s\n", r1, r2, r1.multiply(r2));
        System.out.printf("%s + %s = %s\n", r1, r2, r1.plus(r2));
    }
}
