package lesson32dz;

public class Tour {
    private String code;
    private String country;
    private int cost;
    private int dayCount;

    public Tour(String code, String country, int cost, int dayCount) {
        this.code = code;
        this.country = country;
        this.cost = cost;
        this.dayCount = dayCount;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "code='" + code + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", dayCount=" + dayCount +
                '}' + '\'';
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }
}
