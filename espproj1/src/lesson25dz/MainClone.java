package lesson25dz;

public class MainClone {
    public static void main(String[] args) {
        Buyer a1 = new Buyer("Sergei", "Moscow");
        Address a2 = new Address("Russia", "Moscow", "Lenina");
        System.out.println(a1);
        System.out.println(a2);

        Buyer b1 = a1.clone();
        b1.setName("Vika");
        System.out.println(b1);

        Buyer b11 = new Buyer(a1);
        b11.setName("Lena");
        System.out.println(b11);


        Address b2 = a2.clone();
        b2.setCountry("USA");
        System.out.println(b2);

       Address b12 = new Address(a2);
        b12.setCity("Spb");
        System.out.println(b12);
    }
}
