package lesson32dz;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[][] items;
    private int i = 0;
    private int j = 0;

    public ArrayIterator(T[][] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return i < items.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

            T element = items[i][j];
            j++;
            if (j > 1) {
                j = 0;
                i++;
            }
            return element;
    }
}
