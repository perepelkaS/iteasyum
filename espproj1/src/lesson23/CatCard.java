package lesson23;

public class CatCard extends RunnableCard implements FlyableCharact {
    public CatCard() {
        super("Кошка", "мяу", 15);
    }

    @Override
    protected void printAdditionalInfo() {
        System.out.println("Гуляю сама по себе");
        printSpeed();
        printDistance();
    }

    @Override
    public void printDistance() {
        System.out.println("Летаю на расстояние до 5 метров");
    }
}
