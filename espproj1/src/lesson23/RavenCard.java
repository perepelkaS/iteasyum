package lesson23;

public class RavenCard extends FlyableCard {
    public RavenCard() {
        super("Ворон", "кар", 500);
    }

    @Override
    protected void printAdditionalInfo() {
        System.out.println("Очень умная птица");
        printDistance();
    }
}
