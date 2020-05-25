package lesson24;

public class MainCard {
    public static void main(String[] args) {
        AnimalCard[] cards = {new DogCard(), new CatCard()};
        for (AnimalCard card: cards) {
            System.out.println("-----------------------------");
            card.printInfo();
        }
    }
}
