package lesson23;

public class Interval {
    private final int from;
    private final int to;

    public static Interval ofPoint(int point) {
        return new Interval(point, point);
    }

    public Interval(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public Interval(int point) {
        this(point, point);
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public  boolean contains(int test) {
        return (from <= test) && (test <= to);
    }

    public boolean intersects(Interval test) {
        if (test == null) {
            return false;
        }

        return test.contains(from) || test.contains(to);
    }

    @Override
    public String toString() {
        return "{" + from + ", " + to + '}';
    }
}
