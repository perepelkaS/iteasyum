package lesson2;

public class MainCalc {
    public static void main(String[] args) {
        // однострочный комментарий
        /*
        Метод считает процент кэшбека:
        если премиум клиент, то 15%
        клиент от 18 до 22 лет, то 11%
        клиент от 23 до 35 лет и это первая транзакция, то 7%
        клиент от 60, то 10%
        */

        boolean isPremium = false;
        int age = 18;
        int transactionIndex = 1;
        int percent = 0;

        // && - логическое И
        // || - логическое ИЛИ

        if (isPremium) {
            percent = 15;
        } else if ((18 <= age) && (age <= 22)) {
            percent = 11;
        } else if ((23 <= age) && (age <= 35) && (transactionIndex == 1)) {
            percent = 7;
        } else if (age >= 60) {
            percent = 7;
        }
        System.out.println("percent =" + percent);
    }
}
