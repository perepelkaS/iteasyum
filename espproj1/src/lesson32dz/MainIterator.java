package lesson32dz;

public class MainIterator {
    public static void main(String[] args) {
        ArrayIterator<Integer> iter = new ArrayIterator<>(new Integer[][]{{1, 2}, {1, 3}, {2,5}});

        while (iter.hasNext()) {
            Integer element = iter.next();
            System.out.println(element);
        }
    }
}
