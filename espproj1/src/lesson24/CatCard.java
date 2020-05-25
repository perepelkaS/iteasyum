package lesson24;

public class CatCard extends AnimalCard {
    public CatCard() {
        super ("Кошка", "Мяу", new AnimalCharact[] {
            new DescriptionCharact("Люблю молоко"),
        new RunnableCharact(17),
        new FlyableCharact(5)
        });
    }
}
