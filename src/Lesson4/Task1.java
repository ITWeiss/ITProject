package Lesson4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();


        System.out.println("Result: " + result(number));


        System.out.println("Result: " + recursionResult(number));

    }


    // basic method
    public static int result(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // recursion method
    public static int recursionResult(int n) {
        if (n <= 0) return 0;
        return n + recursionResult(--n);
    }
}
