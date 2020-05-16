package lesson22dz;

public class MainInterval {
    public static void main(String[] args) {
        Interval a = new Interval(1, 10);
        Interval b = new Interval(11, 13);
        int number = 3;
        contain(number, a);
        containInterval(a, b);


    }

    private static void containInterval(Interval a, Interval b) {
        boolean c = ((a.from <= b.to) && (a.to >= b.from));
        if (c == true) {
            System.out.println(a + " и " + b + " пересекаются");
        } else {
            System.out.println(a + " и " + b + " не пересекаются");
        }
    }

    private static void contain(int number, Interval a) {
        boolean c = (number >= a.from && number <= a.to);
        if (c == true) {
            System.out.println("Число " + number + " содержится в : " + a);
        } else {
            System.out.println("Число " + number + " не содержится в : " + a);
        }
    }
}
