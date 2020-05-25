package lesson24;

import lesson22.Person;

public class Peson {
    private String name;
    private int age;
    private String inn;

    public Peson(String name, int age, String inn) {
        this.name = name;
        this.age = age;
        this.inn = inn;
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
    public  boolean equals(Object obj) {
        //равен самому себе
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != getClass()) {
            return false;
        }

        Peson person = (Peson) obj;
        if (age != person.age) {
            return false;
        }
        Peson peson =(Peson) obj;
        boolean ageEquals = age == person.age;
        boolean nameEquals = (name != null) && name.equals(person.name);
        boolean innEquals = (inn != null) && inn.equals(person.inn);
        return ageEquals && nameEquals && innEquals;
}
}

