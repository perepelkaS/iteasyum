package lesson24;

public class DogCard extends AnimalCard {
    public DogCard() {
        super ("Собака", "Гав", new AnimalCharact[] {
                new DescriptionCharact("Готова дружить"),
            new RunnableCharact(15)
        });
    }
}
