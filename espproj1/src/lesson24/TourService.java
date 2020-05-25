package lesson24;

public interface TourService {
    /**
     * Получить все туры
     * @return
     */
    Tour[] listAll();

    /**
     * Найти все туры для забанной страны
     * @param name
     * @return
     */
    Tour[] findByCountry(String name);

    /**
     * Добавить новый тур
     * @param tour
     */
    void createTour( Tour tour);

    /**
     * Удалить тур по коду
     * @param code
     * @return
     */
    boolean deleteTour(String code);

}
