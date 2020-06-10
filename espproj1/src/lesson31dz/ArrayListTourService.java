package lesson31dz;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTourService implements TourService {
    private final List<Tour> tours = new ArrayList<>();

    @Override
    public void addTour(Tour tour) {
        if (tour != null) {
            tours.add(tour);
        }
    }

    @Override
    public Tour[] ListAll() {
        return tours.toArray(new Tour[0]);
    }

    @Override
    public boolean deleteByCode(String code) {
        return tours.removeIf(tour -> tour.getCode().equals(code));
    }

    @Override
    public Tour[] findByCountry(String country) {
        List<Tour> result = new ArrayList<>(tours.size());
        for (Tour tour:tours) {
            if (tour.getCountry().equalsIgnoreCase(country)) {
                result.add(tour);
            }
        }
        return result.toArray(new Tour[0]);
    }
}
