package lesson22;

public class MainImmutable {
    public static void main(String[] args) {
        String str = "123";
        System.out.println("str = " + str.hashCode());
        str = str.concat("456");
        System.out.println("str2 = " + str.hashCode());

        int a = 5;
        Integer aObj = new Integer(5);
        Integer bObj = a;

        final int b = 7;

        ImmutablePoint p = new ImmutablePoint(1, 1);
        System.out.println("p = " + p);
        ImmutablePoint q = p.addX(13);
        System.out.println("q = " + q);
    }
}
