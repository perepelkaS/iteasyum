package lesson31dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainHM2 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("hi");
        a.add("hello");

        List<String> b = Arrays.asList("home", "word", "world");
        List<String> result = join(a, b);
        System.out.println("result" + result);

        List<Integer> intResult = join(Arrays.asList(1, 2, 3), Arrays.asList(9));
        System.out.println(intResult);

    }

    static <T> List<T> join(List<T> a, List<T> b) {
        List<T> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;

    }
}
