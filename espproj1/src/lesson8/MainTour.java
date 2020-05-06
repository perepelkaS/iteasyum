package lesson8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MainTour {
    public static void main(String[] args) {
        Tour[] tours = new Tour[10];
        Scanner scanner = new Scanner(System.in);

        Tour zeroTour = new Tour();
        zeroTour.code = "anapa1";
        zeroTour.name = "Полетели в Анапу";
        zeroTour.desc = "Особо и нечего";
        zeroTour.country = "Россия";
        zeroTour.startDate = new Date(); //текущая дата
        zeroTour.dayCount = 10;
        zeroTour.cost = 50_000;

        tours[0] = zeroTour;
        tours[1] = zeroTour;

//        System.out.println("zero = " + zeroTour);
//        printTour(zeroTour);
        //printTours(tours);

        while (true) {
            menu("Программа \" Подбор туров\"");
            menu("1 - просмотреть все туры");
            menu("2 - добавить тур");
            menu("3 - удалить тур по коду");
            menu("4 - поиск тура по стране");
            menu("5 - выйти");
            System.out.print("> ");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            switch (userInput) {
                case 1:
                    printTours(tours);
                    break;
                case 2:
                    Tour newTour = inputTour(scanner);
                    addToTours(tours, newTour);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Неизвестный код" + userInput);
            }

        }
    }

    private static void addToTours(Tour[] tours, Tour newTour) {
        for (int i = 0; i < tours.length; i++) {
            if ( tours[i] == null) {
                tours[i] = newTour;
                return;
            }
        }
        System.out.println(" perepolnen ");
    }

    private static Tour inputTour(Scanner scanner) {
        Tour tour = new Tour();
        System.out.print(" Название тура > ");
        tour.name = scanner.nextLine();

        System.out.print("Дата вылета > ");
        String dateStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            tour.startDate = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print(" стоимость тура > ");
        tour.cost = scanner.nextInt();

        return tour;
    }

    private static void menu(String title) {
        System.out.println(title);
    }

    private static void printTours(Tour[] tours) {
        for (Tour tour: tours) {
            if (tour == null) {
                return;
            }
            System.out.println("==================================");
            printTour(tour);
        }
    }

    private static void printTour(Tour tour) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy");
        System.out.println(dateFormat.format(tour.startDate) + " " + tour.name + " [" + tour.code + "]");
        System.out.println(tour.desc);
        System.out.println(
                "Страна: " + tour.country + " " +
                        "Число дней: " + tour.dayCount + " " +
                        "Стоимость: " + tour.cost
        );

    }
}
