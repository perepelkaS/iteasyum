package lesson22;

import java.util.Objects;

public class Person {
    public String name;
    public int age;
    public String inn;

    public static Person child(String name, int age) {
        if (age >= 18) {
            throw new IllegalArgumentException("Age < 18");
        }
        return new Person(name, age, null);
    }

    // клонирование
    public Person(Person orig) {
        this.name = orig.name;
        this.age = orig.age;
        this.inn = orig.inn;
    }

    public Person() {

    }

    public Person(String name, int age) {
        this(name, age,  null);
    }

    public Person(String name, int age, String inn) {
        this.name = name;
        this.age = age;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", inn='" + inn + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(inn, person.inn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, inn);
    }
}
