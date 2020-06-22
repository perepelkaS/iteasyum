package lesson33dz;

import java.util.Comparator;
import java.util.List;

public class ComplexComparator<T> implements Comparator<T> {

    private final List<Comparator<T>> comparators;

    public ComplexComparator(List<Comparator<T>> comparators) {
        if (comparators == null || comparators.isEmpty()) {
            throw new IllegalArgumentException("Empty comparator List");
        }
        this.comparators = comparators;
    }

    @Override
    public int compare(T a, T b) {
        int result = 0;
        for (Comparator<T> comparator: comparators) {
            result = comparator.compare(a, b);
            if (result !=0) {
                break;
            }
        }
        return result;
    }
}
