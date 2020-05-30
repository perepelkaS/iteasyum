package lesson25dz;

import lesson25.Person;

import java.util.Objects;

public class Address implements Cloneable {
    private String country;
    private String city;
    private String street;

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Адрес {" +
                "Страна = '" + country + '\'' +
                ", Город = '" + city + '\'' +
                ", Улица = '" + street + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(country, address.country) &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, street);
    }

    @Override
    public Address clone() {
        try {
            Address result = (Address) super.clone();
            return result;
        } catch (CloneNotSupportedException ignore) {
            throw new AssertionError(ignore);
        }
    }

    public Address(Address orig) {
        this.country = orig.country;
        this.city = orig.city;
        this.street = orig.street;
    }
}
