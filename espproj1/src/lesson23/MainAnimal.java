package lesson23;

public class MainAnimal {
    public static void main(String[] args) {
        AnimalCard[] cards = {new DogCard(), new CatCard(), new RavenCard(), new GooseCard(), new CrocoCard()};
        printCards(cards);
        }

        private static void printCards(AnimalCard[] cards) {
            for (AnimalCard card: cards) {
                System.out.println("=================================");
                card.printInfo();
                if (card instanceof RunnableCharact) {
                    System.out.println("LLLL");
                }
                if (card instanceof FlyableCharact) {
                    System.out.println("vv");
                }
                if (card instanceof FloatingCharact) {
                    System.out.println("~~");
                }
        }
    }
}
