package lesson8;

public class MainCitizen {
    public static void main(String[] args) {
        int a = 7;
        Citizen b = new Citizen();
        b.name = "Ivanov";
        b.age = 27;
        b.inn = "12345";
        System.out.println("b = " + b.toString());

        Citizen c = new Citizen();
        c.name = "Petrov";
        c.age = 27;
        c.inn = "123123";
        System.out.println("c = "+ c.toString());
    }
}
