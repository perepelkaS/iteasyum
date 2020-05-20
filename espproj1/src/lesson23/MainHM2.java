package lesson23;

public class MainHM2 {
    public static void main(String[] args) {
        Interval a = new Interval(1, 5);
        System.out.println("a = " + a);
        System.out.println("a contains 1 = " + a.contains(1));
        System.out.println("a contains 1 = " + a.contains(0));
        System.out.println("a contains 1 = " + a.contains(3));
        Interval b = new Interval(0, 3);
        System.out.printf("%s intersects %s = %s\n", a, b, a.intersects(b));
        Interval c = new Interval(3, 6);
        System.out.printf("%s intersects %s = %s\n", a, c, a.intersects(c));
        Interval d = new Interval(1);
        System.out.printf("e = %s\n", d);

    }
}
