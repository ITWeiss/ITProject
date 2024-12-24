package Lesson15.Task1;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionExample {
    public static AtomicInteger atomicInteger = new AtomicInteger(0);


//  private static int counter = 0; (возникает race condition)

//  public static synchronized void increment() { (ограничение доступа к общему ресурсу через synchronized)
//        counter++;
//    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                atomicInteger.incrementAndGet();
                // increment();
                // counter++;
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.printf("Counter : %d\n", atomicInteger.get());
    }

}
