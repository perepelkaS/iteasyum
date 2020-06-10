package lesson31dz;

import java.util.Arrays;

public class MainHM4 {
    public static void main(String[] args) {
        TourService tourService = new ArrayListTourService();
        tourService.addTour(new Tour("1", "Anapa", "Rus"));
        tourService.addTour((new Tour("2", "Cuba", "Cuba")));
        System.out.println("all: " + Arrays.toString(tourService.ListAll()));
        System.out.println("find" + Arrays.toString(tourService.findByCountry("Cuba")));

    }
}
