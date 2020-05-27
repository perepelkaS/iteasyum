package lesson24;

public class SwimCharact implements AnimalCharact {
    private final int depth;

    public SwimCharact(int depth) {
        this.depth = depth;
    }

    @Override
    public void printInfo() {
        System.out.println("Погружаюсь на глубину до " + depth);
    }

    @Override
    public void printAvatar() {
        System.out.println("~~~");
    }
}
