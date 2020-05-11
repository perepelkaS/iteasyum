package lesson21;

public class Person {
    private String name;
    private int age;
    private String inn;

    public Person() {

    }

    public Person(String name, int age, String inn) {   //конструктор
        this.name = name;
        this.age = age;
        this.inn = inn;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException( "Имя не может быть пустым");
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getInn () {
        return inn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name =" + name +
                ", age =" + age +
                ", inn =" + inn +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
