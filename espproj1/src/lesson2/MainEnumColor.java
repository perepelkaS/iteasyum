package lesson2;

public class MainEnumColor {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        String text = "";
        switch (color) {
            case GREEN:
                text = "green";
                break;
            case RED:
                text = "red";
                break;
            case BLUE:
                text = "blue";
                break;
            default:
                text = "?";
        }
        System.out.println("color = " + color + " text = " + text);
    }
}
