package lesson31;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("green");

        System.out.println("size " + colors.size());
        System.out.println("all " + colors);
    }
}
