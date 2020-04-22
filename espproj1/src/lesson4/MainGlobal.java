package lesson4;

public class MainGlobal {

    static int globalCount = 0;

    public static void main(String[] args) {
        System.out.println("calc =" + calc(5));
        System.out.println("calc =" + calc(5));
    }
    // грязный метод( так лучше не делать)
    static int calc(int a) {
        int r = globalCount + a;
        globalCount++;
        return r;
    }
}
