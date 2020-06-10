package lesson31;

public class MainPerson {
    public static void main(String[] args) {
        PersonContainer container = new PersonContainer();
        container.add(new Person("Ivanov", 27));
        container.add(new Person("Petrov", 18));
        System.out.println("[1]: " + container.get(1));
        System.out.println("size: " + container.getSize());
    }
}