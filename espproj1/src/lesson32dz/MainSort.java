package lesson32dz;

import java.util.*;

public class MainSort {
    public static void main(String[] args) {
        Tour a1 = new Tour("a123", "Russia", 512321, 30);
        Tour a2 = new Tour("a234", "Cuba", 7645, 15);
        Tour a3 = new Tour("a3432", "Russia", 1, 20);
        Tour a4 = new Tour("a3245", "Cuba", 897987, 25);
        List<Tour> sort1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        sort1.add(a1);
        sort1.add(a2);
        sort1.add(a3);
        sort1.add(a4);

            menu("1 - Отсортировать по дням");
            menu("2 - Отсортировать по стране");
            menu("3 - Отсортировать по цене");
            System.out.println("Выбери >");

        int userInput = scanner.nextInt();
        scanner.nextLine();
        switch (userInput) {
            case 1:
                sortDayCount(sort1);
            case 2:
                sortCountry(sort1);
            case 3:
                sortCost(sort1);
        }

}

    private static void sortCost(List<Tour> sort1) {
        Comparator Cost = new SortCost();
        Collections.sort(sort1, Cost);
        System.out.println(sort1);
    }

    private static void sortCountry(List<Tour> sort1) {
        Comparator Country = new SortCountry();
        Collections.sort(sort1,Country);
        System.out.println(sort1);
    }

    private static void sortDayCount(List<Tour> sort1) {
        Comparator dayCount = new SortDayCount();
        Collections.sort(sort1, dayCount);
        System.out.println(sort1);
    }

    private static void menu(String s) {
        System.out.println(s);
    }
    }
