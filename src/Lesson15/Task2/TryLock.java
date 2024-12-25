package Lesson15.Task2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {

    private static final ReentrantLock resourceA = new ReentrantLock();

    private static final ReentrantLock resourceB = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1: пытаюсь захватить ресурс A");
            if (resourceA.tryLock()) {
                System.out.println("Thread 1: успешно захватил ресурс A");

                try {
                    TimeUnit.MILLISECONDS.sleep(100);

                    System.out.println("Thread 1: пытаюсь захватить ресурс B");
                    if (resourceB.tryLock(500, TimeUnit.MILLISECONDS)) {
                        try {
                            System.out.println("Thread 1: успешно захватил ресурс B");
                            TimeUnit.MILLISECONDS.sleep(200);
                        } finally {
                            resourceB.unlock();
                            System.out.println("Thread 1: освободил ресурс B");
                        }
                    } else {
                        System.out.println("Thread 1: не удалось захватить ресурс B, продолжаю без него.");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    resourceA.unlock();
                    System.out.println("Thread 1: освободил ресурс A");
                }
            } else {
                System.out.println("Thread 1: не удалось захватить ресурс A, завершаем работу.");
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2: пытаюсь захватить ресурс B");
            if (resourceB.tryLock()) {
                System.out.println("Thread 2: успешно захватил ресурс B");

                try {
                    TimeUnit.MILLISECONDS.sleep(500);

                    System.out.println("Thread 2: пытаюсь захватить ресурс A");
                    if (resourceA.tryLock(300, TimeUnit.MILLISECONDS)) {
                        try {
                            System.out.println("Thread 2: успешно захватил ресурс A");
                            TimeUnit.MILLISECONDS.sleep(150);
                        } finally {
                            resourceA.unlock();
                            System.out.println("Thread 2: освободил ресурс A");
                        }
                    } else {
                        System.out.println("Thread 2: не удалось захватить ресурс A, продолжаем без него.");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    resourceB.unlock();
                    System.out.println("Thread 2: освободил ресурс B");
                }
            } else {
                System.out.println("Thread 2: не удалось захватить ресурс B, завершаем работу.");
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Работа завершена.");
    }

}
