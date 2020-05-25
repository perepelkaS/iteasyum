package lesson24;

public class RunnableCharact implements AnimalCharact {
    private final int speed;

    public RunnableCharact (int speed) {
        this.speed = speed;
    }

    @Override
    public void printInfo() {
        System.out.println("Бегаю со скоростью " + speed);
    }

    @Override
    public void printAvatar() {
        System.out.println("LLLL");

    }
}
