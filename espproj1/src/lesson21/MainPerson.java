package lesson21;

public class MainPerson {
    public static void main(String[] args) {
        Person a = new Person();
        a.setName("Ivanov");
        a.setAge(27);
        a.setInn("12345");

        Person b = new Person();
        b.setName("Petrov");
        b.setAge(25);
        b.setInn("54321");

        System.out.println("a = " + a.toString());
        System.out.println("b = " + b.toString());
        System.out.println(a.getName());
        System.out.println(a.getAge());

        Person c = new Person();
        System.out.println("c = " + c);

        Person d = new Person("Sidirov", 22, "1233");
        System.out.println("d = " + d);

        Person e = new Person("Ivanov", 27, "12345");

        if (a.equals(e)) {
            System.out.println("true");
        }

    }
}
