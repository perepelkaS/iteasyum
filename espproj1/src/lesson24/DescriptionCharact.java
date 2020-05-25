package lesson24;

public class DescriptionCharact implements AnimalCharact {
    private final String description;
    public  DescriptionCharact(String description) {
        this.description = description;
    }

    @Override
    public void printInfo() {
        System.out.println(description);
    }

    @Override
    public void printAvatar() {
        System.out.println("I");

    }
}
