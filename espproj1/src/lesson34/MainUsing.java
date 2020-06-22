package lesson34;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainUsing {
    static class Person {
        private String name;
        private int category;

        public Person(String name, int category) {
            this.name = name;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCategory() {
            return category;
        }

        public void setCategory(int category) {
            this.category = category;
        }
    }

    public static void main(String[] args) {
        Person okPerson = new Person("ok", 2);
        Person failsPerson = new Person("fail", 6);
        System.out.println("1/matches by category: " + matchesByCategory(okPerson));
        System.out.println("1/matches by category: " + matchesByCategory(failsPerson));

        System.out.println("2/matches by category: " + matchesByListCategory(okPerson));
        System.out.println("2/matches by category: " + matchesByListCategory(failsPerson));

        System.out.println("3/matches by category: " + matchesBySetCategory(okPerson));
        System.out.println("3/matches by category: " + matchesBySetCategory(failsPerson));
    }

    static int[] categories = {1, 2, 3};
    static boolean matchesByCategory (Person person) {
        for (int category: categories) {
            if (person.getCategory() == category) {
                return true;
            }
        }
        return false;
    }

    final static List<Integer> CATEGORY_LIST = Arrays.asList(1, 2, 3);
    static boolean matchesByListCategory(Person person) {
        return CATEGORY_LIST.contains(person.getCategory());
    }

    final static Set<Integer> CATEGORY_SET = new HashSet<>(Arrays.asList(1, 2, 3));
    static boolean matchesBySetCategory(Person person) {
        return CATEGORY_SET.contains(person.getCategory());
    }
}
