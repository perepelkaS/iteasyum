package lesson33;

import java.util.*;

public class MainHM2 {

    private static class SortMetod {
        private final String name;
        private final Comparator<Tour> comparator;

        public SortMetod(String name, Comparator<Tour> comparator) {
            this.name = name;
            this.comparator = comparator;
        }

        public String getName() {
            return name;
        }

        public Comparator<Tour> getComparator() {
            return comparator;
        }
    }


    public static void main(String[] args) {
        List<Tour> tours = new ArrayList<>();
        tours.add(new Tour("1", "Russia", "14", 70_000));
        tours.add(new Tour("2", "Ispania", "7", 50_000));
        tours.add(new Tour("3", "Cuba", "28", 100_000));
        tours.add(new Tour("4", "Italia", "5", 40_000));

        List<SortMetod> sortMetods = Arrays.asList(
                new SortMetod("Country", (a,b) -> a.getCountry().compareTo(b.getCountry())),
                        new SortMetod("dayCount", (a,b) -> a.getDayCount().compareTo(b.getDayCount())),
                        new SortMetod("Cost", (a,b) -> a.getCost() - b.getCost())
        );

        Scanner scanner = new Scanner((System.in));

        boolean g = true;
        while (true) {
//            menu("1 - Country");
//            menu("2 - dayCount");
//            menu("3 - Cost");
//            menu("4 - Exit");

            for (int i = 1; i < sortMetods.size(); i++) {
                menu(i + " - " + sortMetods.get(i - 1).getName());
            }
            System.out.println("> ");
            int code = scanner.nextInt();

            if (code>=1 && code<=sortMetods.size()) {
                tours.sort(sortMetods.get(code).getComparator());
                for (Tour  tour: tours) {
                    System.out.println(tour);
                }
            } else if (code == (sortMetods.size() + 1)) {
                g = false;
            } else {
                System.out.println("Error" + code);
            }

        }

    }
    static void menu(String str) {
        System.out.println(str);
    }
}
