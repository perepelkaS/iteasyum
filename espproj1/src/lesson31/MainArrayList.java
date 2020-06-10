package lesson31;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        List<Person> container = new ArrayList<>();
        container.add(new Person("Ivanov", 18));
        container.add(new Person("Petrov", 23));
        System.out.println("[0]: " + container.get(0));
        System.out.println("size: " + container.size());

        container.add(1, new Person("Sidorov", 27));

        //как у массива array[0] = item
        container.set(0, new Person("New", 1));
//        работает только для элементов < size
//        container.set(5, new Person("SDFSDF", 4));

        container.add(null);

        List<Person> additionalList = new ArrayList<>();
        additionalList.add(new Person("ASDASd", 18));
        container.addAll(additionalList);

        System.out.println("all " + container);
        //container.clear();
        container.remove(0);
        Person test = new Person("ASDASd", 18);
        System.out.println("index of " + container.indexOf(test));
        container.remove(test);

        System.out.println("all " + container);
        for (Person person: container) {
            System.out.println(person);
        }
    }
}
