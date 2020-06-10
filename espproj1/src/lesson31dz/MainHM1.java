package lesson31dz;

import java.util.Date;

public class MainHM1 {
    public static void main(String[] args) {
        ValueHolder<Integer> result = new ValueHolder<>();
        if (calc(1, 2, 3, result) == 0) {
            System.out.println("result = " + result.getValue());
        } else {
            System.out.println("анные ошибочны");
        }

        ValueHolder<String> strResult = new ValueHolder<>();
        generateString(strResult);
        System.out.println("str: " + strResult.getValue());
    }

    private static void generateString(ValueHolder<String> strResult) {
        strResult.setValue("generated at " + new Date());
    }

    //result = (a + b) / c
    static int calc(int a, int b, int c, ValueHolder<Integer> result) {
        if (c == 0) {
            return -1;
        }
       result.setValue((a + b) / c);
        return 0;
    }

}
