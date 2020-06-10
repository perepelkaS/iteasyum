package lesson31dz;

public interface TourService {
    void addTour(Tour tour);
    Tour[] ListAll ();
    boolean deleteByCode(String code);
    Tour[] findByCountry(String country);
}
