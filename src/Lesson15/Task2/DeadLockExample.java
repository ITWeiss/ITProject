package Lesson15.Task2;

public class DeadLockExample {

    private static final Object recourseA = new Object();
    private static final Object recourseB = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            synchronized (recourseA) {
                System.out.println("Thread 1: Locked recourse A");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (recourseB) {
                    System.out.println("Thread 1: Locked recourse B");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (recourseA) {
                System.out.println("Thread 2: Locked recourse B");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (recourseB) {
                    System.out.println("Thread 2: Locked recourse A");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}
