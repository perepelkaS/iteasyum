package lesson24dz;

public class RationalFraction {
    private final int a;
    private final int b;

    public RationalFraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "RationalFraction{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
