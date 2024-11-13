package Lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();


        System.out.println("Factorial: " + factorial(number));


        System.out.println("Recursion factorial: " + recursionFactorial(number));

    }

    // basic method
    public static long factorial (int n) {
        long res = 1;
        for (int i = n; i >= 1; i--) {
            res *= i;
        }
        return res;
    }

    // recursion method
    public static long recursionFactorial (int n) {
        if (n <= 1) return 1;
        return n * recursionFactorial(--n);
    }
}
