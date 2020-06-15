package lesson33;

import java.util.*;

public class MainHashMap {
    public static void main(String[] args) {
        Map<String, Integer> countryAndCountMap = new HashMap<>();
        countryAndCountMap.put("Russia", 28);
        countryAndCountMap.put("Cuba", 2);
        countryAndCountMap.put("Ispania", 5);
        countryAndCountMap.put("USA", null);

        System.out.println(countryAndCountMap.get("Russia"));
        System.out.println(countryAndCountMap.getOrDefault("USA", 0));
        System.out.println(countryAndCountMap.getOrDefault("Italia", 0));

        Integer targetValue = countryAndCountMap.get("key");
        if (targetValue != null) {
            //что-то делаем
        }
        System.out.println("Все страны о которых мы знаем: " + countryAndCountMap.keySet());
        int tourCount = 0;
        for (Integer countryCount: countryAndCountMap.values()) {
            if (countryCount != null) {
                tourCount = tourCount = countryCount;
            }
        }
        System.out.println("Общее число туров = " + tourCount);

        System.out.println("Покажи всё: ");
        /*
        / плохая работа - двойная работа, сначало получаеи ключи, потом ищем пару
        for (String country: countryAndCountMap.keySet()) {
            Integer count = countryAndCountMap.get(country);
            System.out.println(country + ":" + count);
        }
         */
        for (Map.Entry<String, Integer> countryAndCount: countryAndCountMap.entrySet()) {
            System.out.println(countryAndCount.getKey() + ": " + countryAndCount.getValue());
        }

        List<String> colors = Arrays.asList("red", "green", "green", "blue");
        List<String> uniqueColors = unique(colors);
        System.out.println("Уникальные цвета: " + uniqueColors);

        Set<String> uniqueColorSet = new HashSet<>();
        for (String color: colors) {
            uniqueColorSet.add(color);
        }
        System.out.println("Уникальные цвета коллекции: " + uniqueColorSet);

        List<Integer> numbers = Arrays.asList(1, 2, 45, 567, 454, 4545, 567, 2);
        Map<Integer, Integer> statMap = new HashMap<>();
        for (Integer number: numbers) {
            Integer currentCount = statMap.get(number);
            statMap.put(number, (currentCount == null) ? 1 : currentCount + 1);
        }
        System.out.println("Stat: " + statMap);
    }

    private static List<String> unique(List<String> colors) {
        Map<String, Boolean> map = new HashMap<>();
        for (String color: colors) {
            map.put(color, Boolean.TRUE);
        }
        return new ArrayList<>(map.keySet());
    }
}
