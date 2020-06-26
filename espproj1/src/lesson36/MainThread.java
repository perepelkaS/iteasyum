package lesson36;

public class MainThread {
    public static void main(String[] args) {
        // 0. Переопределить метод run у Thread
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("active state " + Thread.currentThread().getState());
                System.out.println(Thread.currentThread().getName());
            }
        };

        System.out.println("before state " + thread.getState());
        thread.setName("my-first-thread");
        thread.start();
        System.out.println("after state " + thread.getState());


        // 1. Использовать Runnable
        Runnable codeForThread = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread runnableThread = new Thread(codeForThread);
        runnableThread.setName("runnable-thread");
        runnableThread.start();

        // 2. Lambda
        Thread lambdaThread = new Thread(() -> System.out.println("Можно и так"));
        lambdaThread.setName("lambda-thread");
        lambdaThread.start();

        System.out.println(Thread.currentThread().getName());
    }
}
