package lesson36;

import java.util.ArrayList;
import java.util.List;

public class MainCounter {
    static final int MAX_THREAD_COUNT = 1000;

    static synchronized int incrementAndGet() {
        return ++count;
    }

    static synchronized int get() {
        return count;
    }

    static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>(MAX_THREAD_COUNT);
        // создание потоков
        for (int i = 1; i <= MAX_THREAD_COUNT; i++) {
            Thread thread = new Thread(() -> {
                int newCount = incrementAndGet();
                System.out.println(Thread.currentThread().getName() + ": " + newCount);
            });
            thread.setName("counter-" + i);
            threads.add(thread);
        }
        // старт потоков
        for (Thread thread: threads) {
            thread.start();
        }
        // ожидание завершение выполнение потоков
        for (Thread thread: threads) {
            thread.join();
        }

        System.out.println("Программа завершена " + get());
    }

    private final Object lockObject = new Object();
    private int a;
    int incrementAndGet1() {
        int newValue;
        synchronized (lockObject) {
            newValue = ++a;
        }
        return newValue;
    }

}
