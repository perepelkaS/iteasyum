package lesson3;

public class MaimWhile {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 20) {
            System.out.println(number * 3);
            number++;
        }
// 2 вариант с while (true)
        number = 1;
        while (true) {
            if (number > 20) {
                break;
            }
            System.out.println(number * 3);
            number++;
        }
    }
}
