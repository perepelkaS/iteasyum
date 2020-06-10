package lesson31;

import java.util.ArrayList;
import java.util.Collection;

public class MainCollection {
    public static void main(String[] args) {
        Collection<Person> container = new ArrayList<>();
        container.add(new Person("Ivanov", 23));
        container.add(new Person("Petrov", 17));
        if (container.isEmpty()) { // проверить не пустой ли

        }
        System.out.println("contains " + container.contains(new Person("Ivanov", 23)));

        container.removeIf(person -> person.getAge() >= 23);
        System.out.println("all " + container);

        for (Person person: container) {
            System.out.println(person);
        }
    }
}
