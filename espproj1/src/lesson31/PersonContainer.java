package lesson31;

public class PersonContainer {
    private Person[] items = new Person[16];
    private int usedLength = 0;

    public void add(Person person) {
        if (usedLength < items.length) {
            items[usedLength] = person;
            usedLength++;
        } else {
            // resize
        }
    }

    public void delete (int index) {

    }

    public Person get (int index) {
        if (index < 0 || index >= usedLength) {
            throw new IllegalArgumentException("Wrong index");
        }
        return items[index];
    }

    public  int getSize() {
        return usedLength;
    }
}
