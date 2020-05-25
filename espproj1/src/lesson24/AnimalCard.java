package lesson24;

public abstract class AnimalCard {
    private final String name;
    private final String sound;
    private final AnimalCharact[] characts;

    public AnimalCard(String name, String sound, AnimalCharact[] characts) {
        this.name = name;
        this.sound = sound;
        this.characts = characts;
    }

    public void printInfo() {
        System.out.println("Имя " + name);
        System.out.println("Звук " + sound);
        for (AnimalCharact charact: characts) {
            charact.printInfo();
            charact.printAvatar();
        }
    }
}
