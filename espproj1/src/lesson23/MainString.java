package lesson23;

import java.util.Date;

public class MainString {
    public static void main(String[] args) {
        String template = "Hello, %s! At %s";
        String result = String.format(template, "Home", new Date());
        System.out.println(result);

        String result2 = new StringBuilder()
                .append(1)
                .append(new Date())
                .append('&')
                .reverse()
                .deleteCharAt(5)
                .toString();

        System.out.println("result2 = " + result2);
    }
}
