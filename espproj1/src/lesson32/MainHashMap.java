package lesson32;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        int colorCode = 1;
        String colorText = "";
        switch (colorCode) {
            case 1:
                colorText = "red";
                break;
            case 2:
                colorText = "green";
                break;
            default:
                colorText = "unknow";

        }
        Map<Integer, String> mapping = new HashMap<>();
        mapping.put(1, "red");
        mapping.put(2, "green");
        colorText=mapping.getOrDefault(colorCode, "unknow");
    }
}
