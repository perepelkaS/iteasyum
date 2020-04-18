package lesson2;

public class MainColor {

    static final int GREEN_CODE = 1; // определение константы


    public static void main(String[] args) {
        int colorCode = GREEN_CODE;
        String colorText = "";
        if (colorCode == GREEN_CODE) {
            colorText = "green";
        } else if (colorCode == 2) {
            colorText = "red";
        } else if (colorCode == 3) {
            colorText = "blue";
        } else {
            colorText = "?";
        }
        System.out.println("if code = " + colorCode + "; text = " + colorText);


        switch (colorCode) {
            case 1:
                colorText = "green";
                break;
            case 2:
                colorText = "red";
                break;
            case 3:
                colorText = "blue";
                break;
            default:
                colorText = "?";
        }
        System.out.println("switch code = " + colorCode + "; text = " + colorText);
    }
}
