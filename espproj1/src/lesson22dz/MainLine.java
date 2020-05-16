package lesson22dz;

public class MainLine {
    public static void main(String[] args) {
        String a = "    пОбЕДА        ";
        line(a);
    }

    private static void line(String a) {
        String b = a.trim();
        char c = b.charAt(0);
        String d = "" + c;
        System.out.print(d.toUpperCase());
        for (int i = 1; i < b.length(); i++) {
            char e = b.charAt(i);
            String j = "" + e;
            System.out.print(j.toLowerCase());
        }
    }
}
