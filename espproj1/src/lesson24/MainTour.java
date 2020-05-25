package lesson24;

import java.util.Date;

public class MainTour {
    public static void main(String[] args) {
        TourService tourService = new ArrayTourService();
        Tour [] allTour = tourService.listAll();
        for (Tour t: allTour) {
            System.out.println(t);
        }
        System.out.println(tourService.findByCountry("Cuba").length);
        System.out.println(tourService.findByCountry("Russia").length);
    }
}
