package lesson22;

public class MainPerson {
    public static void main(String[] args) {
        Person a = new Person();
        a.setName("Ivanov");
        a.setAge(27);
        a.setInn("12345");
        System.out.println("a = " + a);

        Person b = new Person("Petrov", 19, "345345");
        System.out.println("b = " + b);

        Person c = new Person("Sidorov",9);
        System.out.println("c = " + c);

        Person d = Person.child("Popkov", 7);
        System.out.println("d = " + d);

        Person copy = new Person(d);
        System.out.println("copy = " + copy);
        System.out.println("d == copy: " + d.equals(copy));
    }
}
