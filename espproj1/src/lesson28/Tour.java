package lesson28;

import java.util.Date;
import java.util.Objects;

public class Tour {
    private String code;
    private String name;
    private String desc;
    private String country;
    private Date startDate;
    private int dayCount;
    private int cost;

    @Override
    public String toString() {
        return "Tour{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", country='" + country + '\'' +
                ", startDate=" + startDate +
                ", dayCount=" + dayCount +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return dayCount == tour.dayCount &&
                cost == tour.cost &&
                Objects.equals(code, tour.code) &&
                Objects.equals(name, tour.name) &&
                Objects.equals(desc, tour.desc) &&
                Objects.equals(country, tour.country) &&
                Objects.equals(startDate, tour.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, desc, country, startDate, dayCount, cost);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
