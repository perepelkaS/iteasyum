package lesson22;

public class MainHM {
    public static void main(String[] args) {
        Point a = new Point(10, 5);
        System.out.println("a = " + a);

        Ship ship = new Ship(new Point(1, 1), 3, true);
        System.out.println("ship = " + ship);
    }
}
