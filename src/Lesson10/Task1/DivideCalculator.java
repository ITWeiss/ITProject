package Lesson10.Task1;

import java.util.Scanner;

public class DivideCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.format("Division result is %d.", result);
        } catch (ArithmeticException arithmeticException) {
            System.out.format("Error: %s.\n", arithmeticException.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }

}
