package lesson24;

public class ArrayTourService implements TourService {
    private final Tour[] tours = new Tour[10];
    @Override
    public Tour[] listAll() {
        return new Tour[0];
    }

    @Override
    public Tour[] findByCountry(String name) {
        return new Tour[0];
    }

    @Override
    public void createTour(Tour tour) {

    }

    @Override
    public boolean deleteTour(String code) {
        return false;
    }
}
