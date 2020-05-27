package lesson24;

public class CrocodileCard extends AnimalCard {
    public CrocodileCard() {
        super("Крокодил", "--", new AnimalCharact[] {
            new DescriptionCharact("Опасный зверь"),
        new SwimCharact(3),
        new RunnableCharact(7)
        });
    }
}
