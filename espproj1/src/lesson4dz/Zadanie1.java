package lesson4dz;

public class Zadanie1 {
    public static void main(String[] args) {
    parity(6);
    }
    static boolean parity (int a) {
        int c = a % 2;
        boolean m = c == 0;
        if (m == true) {
            System.out.println(a + " Четное число");
        } else {
            System.out.println(a + " Нечетное число");
        }
        return m;
    }
}
