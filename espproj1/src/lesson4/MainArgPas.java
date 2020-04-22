package lesson4;

public class MainArgPas {
    public static void main(String[] args) {
        int a = 9;
        System.out.println("before call: " + a);
        changeA(a);
        System.out.println("after call: " + a);
    }

    private static void changeA(int a) {
        System.out.println("method before: " + a);
        a = a + 17;
        System.out.println("method end: " + a);
    }
}
