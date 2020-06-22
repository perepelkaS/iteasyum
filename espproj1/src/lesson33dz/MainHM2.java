package lesson33dz;

import java.util.*;

public class MainHM2 {
    private static final int ITEM_COUNT = 100;

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>(ITEM_COUNT);

        for (int i = 0; i < ITEM_COUNT; i++) {
            numbers.add(random.nextInt(300));
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> stat = new HashMap<>();
        for (Integer number: numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            Integer count = stat.get(number);
            stat.put(number, count == null ? 1: count + 1);
        }

        System.out.println("numbers = " + numbers);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("stat = " + stat);

//        List<Integer> sortedCounts = new ArrayList<>(stat.values());
//        sortedCounts.sort(Integer::compareTo);
//        System.out.println("sorted counts: " + sortedCounts);

        List<Map.Entry<Integer, Integer>> pairs = new ArrayList<>(stat.entrySet());
        pairs.sort((a, b) -> (b.getValue() - a.getValue()));
        System.out.println("sorted pairs: " + pairs);
        System.out.println("1: " + pairs.get(0));
        System.out.println("2: " + pairs.get(1));
        System.out.println("3: " + pairs.get(2));
    }
}
