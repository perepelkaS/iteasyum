package lesson24;

import java.util.Date;

public class MockTourService implements TourService {
    private Tour singleTour;

    public MockTourService() {
        singleTour = new Tour();
        singleTour.setCode("first");
        singleTour.setName("Anapa");
        singleTour.setDesc("Long text");
        singleTour.setStartDate(new Date());
        singleTour.setCountry("Russia");
        singleTour.setDayCount(7);
        singleTour.setCost(60);
    }
    @Override
    public Tour[] listAll() {
        if (singleTour == null) {
            return new Tour[0];
        }
        return new Tour[] {singleTour};
    }

    @Override
    public Tour[] findByCountry(String name) {
        if ((singleTour != null) && (singleTour.getCountry().equalsIgnoreCase(name))) {
            return new Tour[] {singleTour};
        }
        return new Tour[0];
    }

    @Override
    public void createTour(Tour tour) {
        if (tour != null) {
            singleTour = tour;
        }

    }

    @Override
    public boolean deleteTour(String code) {
        if ((singleTour != null) && (singleTour.getCountry().equalsIgnoreCase(code))) {
            singleTour = null;
            return true;
        }
        return false;
    }
}
