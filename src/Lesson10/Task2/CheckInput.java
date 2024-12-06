package Lesson10.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0; // Переменная для хранения введенного числа
        boolean validInput = false; // Проверка корректности ввода

        while (!validInput) {
            try {
                // Просим пользователя ввести число
                System.out.println("Insert a number: ");
                number = scanner.nextInt();
                validInput = true; // Если введено число, устанавливаем значение true
            } catch (InputMismatchException e) {
                System.out.println("Input error. Try again.");
                scanner.nextLine(); // Очищаем некорректный ввод
            }
        }

        scanner.close();
        // Умножаем число на 2 и выводим результат
        int result = number * 2;
        System.out.printf("Result: %d", result);
    }

}
