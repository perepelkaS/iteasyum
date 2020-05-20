package lesson23;

public class DogCard extends RunnableCard {
    private final int speed;
    public DogCard() {
        super("Собака", "гав", 17);
        this.speed = 15;
    }


    @Override
    protected void printAdditionalInfo() {
        System.out.println("Готов дружить");
        printSpeed();
    }
}
