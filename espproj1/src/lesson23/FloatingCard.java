package lesson23;

public  abstract class FloatingCard extends AnimalCard implements RunnableCharact{
    private final int swam;

    public FloatingCard(String name, String sound, int swam) {
        super(name, sound);
        this.swam = swam;
    }

    public void printSwam() {
        System.out.println("Плыву :" + swam);
    }

}
