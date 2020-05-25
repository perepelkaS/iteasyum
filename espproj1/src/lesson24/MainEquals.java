package lesson24;

import lesson22.Person;

public class MainEquals {
    public static void main(String[] args) {
        Peson a = new Peson("Ivanov", 27, "12345");
        Peson b = new Peson("Ivanov", 27, "12345");
        Peson c = new Peson("Ivanov",27, "12345");
        System.out.println("equals: " + a.equals(b));

        //Равен самому себе
        System.out.println("a.equals(a): " + a.equals(a));
        //Симметричность
        System.out.println(a.equals(b) == b.equals(a));
        //Транзитивность
        if (a.equals(c) && b.equals(c)) {
            System.out.println(a.equals(b) == true);
        }
        //null всегда ложь
        System.out.println("null: " + (a.equals(null) == false));
        // повторимость во времени
    }

}
