package lesson32;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[] items;
    private int index = 0;

    public ArrayIterator(T[] items) {
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        return index < items.length;
    }

    @Override
    public T next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }

        T element = items[index];
        index ++;
        return element;
    }
}
