package lesson25;

import java.util.Arrays;

public class Person implements Cloneable {
    private String name;
    private int age;
    private  int[] categories;

    public Person(String name, int age, int[] categories) {
        this.name = name;
        this.age = age;
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", categories=" + Arrays.toString(categories) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int i) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getCategories() {
        return categories;
    }

    public void setCategories(int[] categories) {
        this.categories = categories;
    }

    public Person(Person orig) {
        this.name = orig.name;
        this.age = orig.age;
        this.categories = orig.categories.clone();
    }

    @Override
    public Person clone() {
        try {
            Person result = (Person) super.clone();
            result.categories = result.categories.clone();
            return result;
        } catch (CloneNotSupportedException ignore) {
            throw new AssertionError(ignore);
        }
    }
}
