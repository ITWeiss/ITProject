package Lesson15.Task3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreBasedSolution {

    private static final Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new TaskRunner("Поток 1"));
        Thread thread2 = new Thread(new TaskRunner("Поток 2"));

        thread1.start();
        thread2.start();
    }

    private static class TaskRunner implements Runnable {
        private final String name;
        private final int maxAttempts = 10;

        public TaskRunner(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                try {
                    // Запрашиваем разрешение у семафора
                    if (semaphore.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(name + ": Получено разрешение, выполняю задачу");

                        doTask();

                        semaphore.release();
                        System.out.println(name + ": Задача выполнена, семафор освобожден");
                        return; // Завершение работы потока
                    } else {
                        System.out.println(name + ": Не удалось получить разрешение, попытка " + attempt);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println(name + ": Превышено максимальное количество попыток (" + maxAttempts + "), завершаем работу.");
        }

        private void doTask() throws InterruptedException {

            TimeUnit.MILLISECONDS.sleep(5000);
        }
    }

}
