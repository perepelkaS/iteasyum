package lesson32dz;

import java.util.Comparator;

public class SortCost implements Comparator<Tour> {

    @Override
    public int compare(Tour o1, Tour o2) {
        return o1.getCost() - o2.getCost();
    }
}
