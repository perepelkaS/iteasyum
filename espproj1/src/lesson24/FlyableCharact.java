package lesson24;

public class FlyableCharact implements AnimalCharact {
    private final int distance;

    public FlyableCharact(int distance) {
        this.distance = distance;
    }

    @Override
    public void printInfo() {
        System.out.println("Летаю на расстояние до " + distance);
    }

    @Override
    public void printAvatar() {
        System.out.println("v");

    }
}
