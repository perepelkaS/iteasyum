package lesson23;

public class CrocoCard extends FloatingCard implements FloatingCharact {
    public CrocoCard() {
        super ("Крокодил", "цап",7 );
    }
    @Override
    protected void printAdditionalInfo() {
        System.out.println("Ем все что захочу");
        printSwam();
        printSpeed();
    }

    @Override
    public void printSpeed() {
        System.out.println("Скорость бега 5 км/ч");
    }
}
