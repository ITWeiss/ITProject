package Lesson15.Task3;

public class LiveLockExample {

    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int attempts = 0;
                final int maxAttempts = 10;

                while (attempts < maxAttempts) {
                    if (!flag) {
                        System.out.println("Thread 1: Флаг свободен, устанавливаем его");
                        flag = true;

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                        System.out.println("Thread 1: Задача выполнена, освобождаем флаг");
                        flag = false;
                        break;
                    } else {
                        System.out.println("Thread 1: Флаг занят, уступаем выполнение");
                        attempts++;
                        Thread.yield();
                    }
                }

                if (attempts >= maxAttempts) {
                    System.out.println("Thread 1: Превышено максимальное количество попыток (" + maxAttempts + "), завершаем работу.");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int attempts = 0;
                final int maxAttempts = 5;

                while (attempts < maxAttempts) {
                    if (!flag) {
                        System.out.println("Thread 2: Флаг свободен, устанавливаем его");
                        flag = true;

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                        System.out.println("Thread 2: Задача выполнена, освобождаем флаг");
                        flag = false;
                        break;
                    } else {
                        System.out.println("Thread 2: Флаг занят, уступаем выполнение");
                        attempts++;
                        Thread.yield();
                    }
                }

                if (attempts >= maxAttempts) {
                    System.out.println("Thread 2: Превышено максимальное количество попыток (" + maxAttempts + "), завершаем работу.");
                }
            }
        });

        thread1.start();
        thread2.start();
    }


}
