package lesson24;

public class MainCard {
    public static void main(String[] args) {
        AnimalCard[] cards = {new DogCard(), new CatCard(), new CrocodileCard()};
        for (AnimalCard card: cards) {
            System.out.println("-----------------------------");
            card.printInfo();
        }
    }
}
