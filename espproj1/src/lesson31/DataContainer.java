package lesson31;

import java.util.Objects;

public class DataContainer {
    private Objects[] items = new Objects[16];
    private int usedLength = 0;

    public void add(Objects person) {
        if (usedLength < items.length) {
            items[usedLength] = person;
            usedLength++;
        } else {
            // resize
        }
    }

    public void delete (int index) {

    }

    public Objects get (int index) {
        if (index < 0 || index >= usedLength) {
            throw new IllegalArgumentException("Wrong index");
        }
        return items[index];
    }

    public  int getSize() {
        return usedLength;
    }
}
