package lesson5;
import java.util.Random;
import java.util.Scanner;

public class MainHM2 {
    public static void main(String[] args) {
        Random random = new Random ();
        int secretNumber = random.nextInt (10) + 1;

        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        do {
            System.out.println("ваше число = ");
            userNumber = scanner.nextInt();

            if (secretNumber > userNumber) {
                System.out.println("Загаданное число больше");
            } else if (secretNumber < userNumber) {
                System.out.println("Загаданное число меньше");
            }
        } while (secretNumber != userNumber);
        System.out.println("Win");
    }
}
