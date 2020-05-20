package lesson23;

public class MainHM1 {
    public static void main(String[] args) {
        String test = " пОбЕДа ";
        System.out.println(test.trim().substring(0, 1));
        System.out.println("\"" + test + "\" -> \"" + normalize(test) + "\"");
    }

    private static String normalize(String str) {
        if (str == null) {
            return null;
        }
        String trimmed = str.trim();
        return trimmed.substring(0, 1).toUpperCase() +
                trimmed.substring(1).toLowerCase();
    }
}
