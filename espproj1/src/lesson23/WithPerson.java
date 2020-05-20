package lesson23;

public class WithPerson {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public WithPerson withName(String name) {
        this.name = name;
        return this;
    }

    public WithPerson withAge(int age) {
        this.age = age;
        return this;
    }
}
