package lesson35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainHist {

//    static class CustomRes implements AutoCloseable {
//
//        @Override
//        public void close() throws Exception {
//            System.out.println("Close custom res");
//        }
//    }

    public static void main(String[] args) {
        //classic();
        tryWithRes();
    }

//    static void myRes() {
//        try (C){
//
//        }
//    }

    static void tryWithRes() {
        try (
            FileInputStream in = new FileInputStream("files/sourse.txt");
            FileOutputStream out = new FileOutputStream("files/target.txt")
        ) {
            byte[] buffer = new byte[255];
            int count;
            while ((count = in.read(buffer)) != -1) {
                out.write(buffer, 0, count);
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //старый вариант
    static void classic() {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {

            in = new FileInputStream("files/sourse.txt");
            out = new FileOutputStream("files/target.txt");

            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
