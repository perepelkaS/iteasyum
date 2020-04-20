package lesson3;

public class MainWhile2 {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 20) {
            System.out.println(number);
           number += 2; // number = number + 2;
        }
  // через цикл for
        for (int i = 1; i <=20; i+=2) {
            System.out.println(i);
        }

        for (int i = 20; i >= 1; i-=2) {
            System.out.println(i);
        }
    }
}
