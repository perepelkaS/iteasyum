package lesson23;

public abstract class RunnableCard extends AnimalCard implements RunnableCharact {
    private final int speed;

    public RunnableCard(String name, String sound, int speed) {
        super(name, sound);
        this.speed = speed;
    }

    public void printSpeed() {
        System.out.println("Скорость бега: " + speed);
    }
}
