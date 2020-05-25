package lesson24;

import java.util.Date;
import java.util.Objects;

public class Tour {
    private String code;
    private String name;
    private String desc;
    private Date startDate;
    private String country;
    private int dayCount;
    private int cost;

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
                Objects.equals(startDate, tour.startDate) &&
                Objects.equals(country, tour.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, desc, startDate, country, dayCount, cost);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", startDate=" + startDate +
                ", country='" + country + '\'' +
                ", dayCount=" + dayCount +
                ", cost=" + cost +
                '}';
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
