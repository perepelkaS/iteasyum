package lesson3;

public class MainAnd {
    public static void main(String[] args) {
        boolean a = false;
        boolean result = a && cond();
        System.out.println("end");
    }
    static boolean cond() {
        System.out.println("calling");
        return true;
    }
}
