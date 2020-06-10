package lesson31dz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainHM3 {
    public static void main(String[] args) {
        System.out.println(nCopy(3, "hi"));
        System.out.println(nCopy(5, 23));
    }

    static <T> List<T> nCopy(int n, T value) {
        if (n < 0) {
            return Collections.emptyList();
        }
        List<T> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(value);
        }
        return result;

    }
}
