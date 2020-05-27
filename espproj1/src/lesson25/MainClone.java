package lesson25;

public class MainClone {
    public static void main(String[] args) {
        Person a = new Person("Ivanov", 27, new int[] {1, 2});
        System.out.println("a = " + a);

        Person b = a.clone();
        b.setName("Petrov");
        b.getCategories()[0] = 3;

        Person c = new Person(a);
        c.setName("Sidorov");
        c.getAge(17);
        c.getCategories()[0] = 4;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
