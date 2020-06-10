package lesson32;

public class MainArrayIterator {
    public static void main(String[] args) {
        ArrayIterator<String> strIterator = new ArrayIterator<>(new String[] {
                "hi", "hello"
        });

        while (strIterator.hasNext()) {
            String element = strIterator.next();
            System.out.println(element);
        }

        ArrayIterator<Integer> intIterator = new ArrayIterator<>(new Integer[] {
                1, 2
        });
        while (intIterator.hasNext()) {
            Integer element = intIterator.next();
            System.out.println(element);
        }
    }
}
