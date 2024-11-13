package Lesson4;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert number: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci number is " + fibonacciNumber(n) + ".");
        System.out.println("Fibonacci number is " + recursionFibonacci(n) + ".");

    }


    // Числа Фибаначчи
    public static long fibonacciNumber(int n) {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static long recursionFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        } else {
            return recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
        }
    }

}
