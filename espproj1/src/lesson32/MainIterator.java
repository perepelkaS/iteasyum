package lesson32;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static java.util.Arrays.asList;

public class MainIterator {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        for (int i = 0; i< a.length; i++) {
            int element = a[i];
            System.out.println(element);
        }

        Collection<Integer> b = new ArrayList<>(asList(1, 2, 3, 4));
        Iterator<Integer> iterator = b.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }

        for (Integer element: b) {
            System.out.println(b);
        }
    }
}
