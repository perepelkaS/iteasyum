package lesson31dz;

import java.util.Comparator;

public class MainCompare {
    public static void main(String[] args) {
        Tour a = new Tour("code1", "Anapa", "Rus");
        Tour b = new Tour("code2", "Cuba", "Cuba");
        System.out.println(a.compareTo(b));

        Comparator<Tour> countryComparator = new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                return o1.getCountry().compareTo(o2.getCountry());
            }
        };
        System.out.println(countryComparator.compare(a, b));

        Comparator<Tour> countryComparatorByLambda =
                (one, two) ->one.getCountry().compareTo(two.getCountry());
    }
}
