package lesson23;

public  abstract class AnimalCard {
    private  final String name;
    private final String sound;

    public AnimalCard(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
    public  final void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Говорит: " + sound);
        printAdditionalInfo();
    }

    protected abstract void printAdditionalInfo();

}
