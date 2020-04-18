package lesson2;

public class MainIf {
    public static void main(String[] args) {
        int age = 5;
        if (age < 21) {
            System.out.println("Ребёнок");
        } else if (age < 40) {
            System.out.println("Подросток");
        } else if (age < 80) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Старик");
        }
    }
}

