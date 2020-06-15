package lesson32dz;

import java.util.Comparator;

public class SortCountry implements Comparator<Tour> {
    @Override
    public int compare(Tour o1, Tour o2) {
        return o1.getCountry().compareTo(o2.getCountry());
    }
}
