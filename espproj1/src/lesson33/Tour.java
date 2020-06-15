package lesson33;

import java.util.Objects;

public class Tour {
    private String code;
    private String country;
    private String dayCount;
    private int cost;

    public Tour(String code, String country, String dayCount, Integer cost) {
        this.code = code;
        this.country = country;
        this.dayCount = dayCount;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "code='" + code + '\'' +
                ", country='" + country + '\'' +
                ", dayCount='" + dayCount + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return Objects.equals(code, tour.code) &&
                Objects.equals(country, tour.country) &&
                Objects.equals(dayCount, tour.dayCount) &&
                Objects.equals(cost, tour.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, country, dayCount, cost);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDayCount() {
        return dayCount;
    }

    public void setDayCount(String dayCount) {
        this.dayCount = dayCount;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
