package lesson33dz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainHM1 {

    static class Tour {
        private String country;
        private int dayCount;

        public Tour(String country, int dayCount) {
            this.country = country;
            this.dayCount = dayCount;
        }

        @Override
        public String toString() {
            return "Tour{" +
                    "country='" + country + '\'' +
                    ", dayCount=" + dayCount +
                    '}';
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getDayCount() {
            return dayCount;
        }

        public void setDayCount(int dayCount) {
            this.dayCount = dayCount;
        }
    }

    public static void main(String[] args) {
        Comparator<Tour> complexComparator = (a, b) -> {
          int r1 = a.getCountry().compareTo(b.getCountry());
          if(r1 != 0) {
              return r1;
          }

          int r2 = a.getDayCount() - b.getDayCount();
              return r2;
        };

        Comparator<Tour> tourComparator = new ComplexComparator<>(Arrays.asList(
                (a, b) -> a.getCountry().compareTo(b.getCountry()),
                (a, b) -> a.getDayCount() - b.getDayCount()
        ));

        List<Tour> test = Arrays.asList(
          new Tour("Russia", 60),
          new Tour("Ispania", 7),
          new Tour("Russia", 3),
          new Tour("Cuba", 14)
        );
        test.sort(complexComparator);
        System.out.println("result = " + test);
    }
}
