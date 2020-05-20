package lesson23;

public abstract class FlyableCard extends AnimalCard implements FlyableCharact {
    private final int distance;

    public FlyableCard(String name, String sound, int distance) {
        super(name, sound);
        this.distance = distance;
    }

    public void printDistance() {
        System.out.println("Расстояние полета:" + distance);
    }
}
