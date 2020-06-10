package lesson28;

import java.util.Date;

import static java.lang.String.format;

public class TourValidator {
    private final String[] knownCounries;

    public TourValidator(String[] knownCounries) {
        if (knownCounries == null || knownCounries.length == 0) {
            throw new IllegalArgumentException("Страны должны быть заданы");
        }
        this.knownCounries = knownCounries;
    }

    public void validate(Tour tour) {
        raiseIf(tour == null, "Тур не определен");
        //Objects.requireNonNull(tour, "Тур не определен");

        notEmpty(tour.getCode(), "код");

        if (isEmpty(tour.getName())) {
            throw new IllegalArgumentException("Поле название должно быть задано");
        }

        if (isEmpty(tour.getDesc())) {
            throw new IllegalArgumentException("оле описание должно быть задано");
        }

        validateCountry(tour.getCountry());
        valadateStartDate(tour.getStartDate());

        if (tour.getDayCount() <= 0) {
            throw  new IllegalArgumentException("Число дней должно быть положительным");
        }

        if (tour.getCost() <= 0) {
            throw new IllegalArgumentException("Стоимость должна быть положительной");
        }

    }

    private void notEmpty(String str, String fieldName) {
        raiseIf(isEmpty(str), format("Поле %s должно быть задано", fieldName));
    }

    private void raiseIf(boolean cound, String message) {
        if (cound) {
            throw new IllegalArgumentException(message);
        }
    }

    private void valadateStartDate(Date startDate) {
        if (startDate == null) {
            throw new IllegalArgumentException("Поле дата должно быть задано");
        }
        Date now = new Date();
        if (now.after(startDate)) {
            throw new IllegalArgumentException("Дата из прошлого");
        }
    }

    private void validateCountry(String country) {
        if (isEmpty(country)) {
            throw new IllegalArgumentException("Поле страна должно быть задано");
        }

        if (!isKnownCountry(country)) {
            throw new IllegalArgumentException(format("Страна %s неизвестна", country));
        }
    }

    private boolean isKnownCountry(String country) {
        boolean isKnown = false;
        for (String knownCountry : knownCounries) {
            if (knownCountry.equalsIgnoreCase(country)) {
                isKnown = true;
                break;
            }
        }
        return isKnown;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
