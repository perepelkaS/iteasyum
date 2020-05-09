package lesson8dz;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainTour {
    public static void main(String[] args) {
        Tour[] tours = new Tour[10];
        Scanner scanner = new Scanner(System.in);

        Tour zeroTour = new Tour();
        zeroTour.code = "Anapa1";
        zeroTour.name = "Полетели в Анапу";
        zeroTour.desc = "Особо и нечего";
        zeroTour.country = "Россия";
        zeroTour.startDate = new Date(); //текущая дата
        zeroTour.dayCount = 10;
        zeroTour.cost = 50_000;

        Tour firstTour = new Tour();
        firstTour.code = "Newyork2";
        firstTour.name = "Полетели в Нью-Йорк";
        firstTour.desc = "Особо и нечего 2";
        firstTour.country = "США";
        firstTour.startDate = new Date(); //текущая дата
        firstTour.dayCount = 15;
        firstTour.cost = 150_000;

        Tour secondTour = new Tour();
        secondTour.code = "Paris3";
        secondTour.name = "Полетели в Париж";
        secondTour.desc = "Особо и нечего 3";
        secondTour.country = "Франция";
        secondTour.startDate = new Date(); //текущая дата
        secondTour.dayCount = 20;
        secondTour.cost = 100_000;

        Tour thirdTour = new Tour();
        thirdTour.code = "Ankara4";
        thirdTour.name = "Полетели в Анкару";
        thirdTour.desc = "Особо и нечего 4";
        thirdTour.country = "Турция";
        thirdTour.startDate = new Date(); //текущая дата
        thirdTour.dayCount = 25;
        thirdTour.cost = 110_000;

        tours[0] = zeroTour;
        tours[1] = firstTour;
        tours[2] = secondTour;
        tours[3] = thirdTour;


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
                    Tour SearchCode = deleteInputCode(scanner);
                    deleteCode(tours, SearchCode);
                    break;
                case 4:
                    Tour SearchTour = searchInputCountry(scanner);
                    addSearchTours(tours, SearchTour);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Неизвестный код" + userInput);
            }

        }
    }

    private static void deleteCode(Tour[] tours, Tour searchCode) {
        Tour[] result = new Tour[tours.length];
        int l = 1;
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                return;
            }
            boolean d = tours[i].code.equals(searchCode.code);
            if (d == true) {
                for ( int j = 0; j < i; j++) {
                    result[j] = tours[i - l];
                    l++;
                }
                for ( int j = i + 1; j < tours.length; j++) {
                    result[j - 1] = tours[i + 1];
                    i++;
                }
            }
            printTours(result);
        }
    }

    private static Tour deleteInputCode(Scanner scanner) {
        Tour tour = new Tour();
        System.out.print(" Введите код тура для удаления > ");
        tour.code = scanner.nextLine();

        return tour;
    }

    private static void addSearchTours(Tour[] tours, Tour searchTour) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                return;
            }

            boolean d = tours[i].country.equals(searchTour.country);
            if (d == true) {
                printTour(tours[i]);
            }
        }
    }

    private static Tour searchInputCountry(Scanner scanner) {
        Tour tour = new Tour();
        System.out.print(" Введите страну для поиска > ");
        tour.country = scanner.nextLine();

        return tour;
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
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(dateFormat.format(tour.startDate) + " " + tour.name + " [" + tour.code + "]");
        System.out.println(tour.desc);
        System.out.println(
                "Страна: " + tour.country + " " +
                        "Число дней: " + tour.dayCount + " " +
                        "Стоимость: " + tour.cost
        );

    }
}
