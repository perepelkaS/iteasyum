package lesson22dz;

public class Interval {
    public  int from;
    public int to;

    public Interval(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Интервал {" +
                "от= " + from +
                ", до= " + to +
                '}';
    }
}
