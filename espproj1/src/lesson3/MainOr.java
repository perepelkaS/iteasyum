package lesson3;

public class MainOr {
    public static void main(String[] args) {
        boolean a = true;
        boolean result = a | cond();
        System.out.println("end");
    }

    static boolean cond() {
        System.out.println("OR calling");
        return true;
    }
}
