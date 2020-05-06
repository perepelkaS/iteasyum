package lesson8;

public class Citizen {
    String name;
    int age;
    String inn;

    @Override // говорим компилятору что хотим переопределить toString
    public String toString() {
        return "Гражданин {" +
                "имя: " + name +
                ", возвраст: " + age +
                ", ИНН: " + inn +
                "}";
    }
}
