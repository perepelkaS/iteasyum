package lesson25dz;

import lesson25.Person;

import java.util.Objects;

public class Buyer implements Cloneable {
    private String name;
    private String address;

    public Buyer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Покупатель{" +
                "Имя = '" + name + '\'' +
                ", Адрес = '" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buyer buyer = (Buyer) o;
        return Objects.equals(name, buyer.name) &&
                Objects.equals(address, buyer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public Buyer clone() {
        try {
            Buyer result = (Buyer) super.clone();
            return result;
        } catch (CloneNotSupportedException ignore) {
            throw new AssertionError(ignore);
        }
    }

    public Buyer(Buyer orig) {
        this.name = orig.name;
        this.address = orig.address;
    }
}
