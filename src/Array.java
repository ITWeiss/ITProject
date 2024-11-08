import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Массивы: сортировка и создание метода
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 4 числа: ");

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Sorting values: ");

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Minimal value: " + minValue(arr));
        System.out.println("Max value: " + maxValue(arr));

    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}