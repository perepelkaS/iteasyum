package lesson22;

public class MainString {
    public static void main(String[] args) {
        String a = new String("123");
        String b = "123";
        String c = "123";
        System.out.println("a==b: " + (a == b));
        System.out.println("b==c: " + (b == c));

        String c1 = a + b; // a.concat(b)
        System.out.println(c1);
        System.out.println(a.isEmpty());
        System.out.println("\"\"" + "".isEmpty());
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf('2'));
        System.out.println(a.indexOf('a'));
        System.out.println("LeNgtH".toLowerCase());
        System.out.println("LeNgtH".toUpperCase());
        System.out.println("    tur   ".trim());
    }
}
