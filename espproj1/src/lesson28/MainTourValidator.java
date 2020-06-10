package lesson28;

import java.util.Calendar;
import java.util.Date;

public class MainTourValidator {
    public static void main(String[] args) {
        Tour tour = new Tour();
        tour.setCode("caode-1");
        tour.setName("Run Cuba");
        tour.setDesc("long text");
        tour.setCountry("Cuba");
        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.DAY_OF_MONTH, 7);
        tour.setStartDate(startDate.getTime());
        tour.setDayCount(14);
        tour.setCost(65_000);

        TourValidator validator = new TourValidator(new String[]{"Russia", "Cuba"});
        try {
            validator.validate(tour);
        } catch (IllegalArgumentException e) {
            System.err.println("Тур невалиден: " + e.getMessage());
        }
    }
}
