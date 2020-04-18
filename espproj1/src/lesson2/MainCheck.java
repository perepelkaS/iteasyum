package lesson2;

public class MainCheck {
    public static void main(String[] args) {
        int a = 75;
        boolean r;
        if (a%2 == 0) {
            r = true;
        } else {
            r = false;
        }
        // 2 вариант
        // r = a % 2 == 0;
        System.out.println("Четное: " + r);
    }
}
