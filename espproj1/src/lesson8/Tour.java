package lesson8;

import java.util.Date;

public class Tour {
    String code;// уникальный код
    String name;// короткое название
    String desc;// описание
    Date startDate;//дата вылета
    String country;// страна
    int dayCount;// число дней тура
    int cost; // стоимость тура

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
}
