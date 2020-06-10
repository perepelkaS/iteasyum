package lesson31dz;

import java.util.Objects;

public class Tour implements Comparable<Tour>{
    private String code;
    private String name;
    private String country;

    public Tour(String code, String name, String country) {
        this.code = code;
        this.name = name;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return Objects.equals(code, tour.code) &&
                Objects.equals(name, tour.name) &&
                Objects.equals(country, tour.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, country);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public int compareTo(Tour o) {

       return code.compareTo(o.code);
    }
}
