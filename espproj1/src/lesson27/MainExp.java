package lesson27;

public class MainExp {
    public static void main(String[] args) {
        int a = (7 + 11) * 89;
        boolean cond = a % 2 == 0;
        String text = cond ? "Четное" : "Нечетное";
        System.out.println(convert(a, cond, c -> "Один вариант"));
        System.out.println(convert(a, cond, c -> c ? "Четное" : "Нечетное"));
    }

   static String convert(int a, boolean cond, StringForCondition converter) {
        return a + " : " + cond + " : " + converter.asString(cond);
    }
}
