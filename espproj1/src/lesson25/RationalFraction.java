package lesson25;

import java.util.Objects;

/**
 *  a/b - дробь, а - числитель, b - знаменатель
 */

public class RationalFraction {
    private final int a;
    private final int b;

    public RationalFraction(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Знаменатель не должен равняться ноль");
        }

        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + "/" + b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalFraction that = (RationalFraction) o;
        return a == that.a &&
                b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    /**
     * 1/2 * 2/3 = (1 * 2) / (2 * 3) = 2/6 => 1/3
     * @return
     */

    public RationalFraction multiply(RationalFraction fraction){
        return new RationalFraction(a * fraction.getA(), b * fraction.getB());
    }

    /**
     * 1/2 + 2/3 = (1 * 3 + 2 * 2)/(2*3) = 7/6
     * @param fraction
     * @return
     */

    public RationalFraction plus(RationalFraction fraction) {
        return new RationalFraction(
                a * fraction.b + fraction.a * b,
                b * fraction.b);
    }

//    public double asDouble() {
//
//    }
}
