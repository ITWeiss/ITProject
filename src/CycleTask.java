import java.util.Scanner;

public class CycleTask {
    public static void main(String[] args) {
        // While

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Еnter a number:");
            int i = scanner.nextInt();
            if (i >= 0) {
                sum += i;
            } else {
                System.out.println("The sum of the numbers: " + sum);
                break;
            }
        }

    }
}