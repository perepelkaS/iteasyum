package lesson36;

public class MainProblem {
    static boolean doWork = true;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
           int i = 0;
           while (doWork) {
               i++;
           }
           System.out.println("Колличество повторений: " + i);
        });
        thread.start();
        Thread.sleep(500);
        doWork = false;
        System.out.println("Работа завершина");
    }
}
