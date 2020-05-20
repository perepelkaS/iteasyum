package lesson23;

public class GooseCard extends FlyableCard implements RunnableCharact {
    public GooseCard() {
        super("Гусь", "гаа", 5);
    }

    @Override
    protected void printAdditionalInfo() {
        System.out.println("Навожу страх на все село");
        printDistance();
        printSpeed();
    }

    @Override
    public void printSpeed() {
        System.out.println("Скорость бега 5 км/ч");
    }
}
