import java.util.Scanner;

public class СonditionalСonstruction {
    public static void main(String[] args) {
        // Условная конструкция Switch-case
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 число:");
        int val1 = scanner.nextInt();

        System.out.println("Введите 2 число:");
        int val2 = scanner.nextInt();

        System.out.println("Введите оператор:");
        String action = scanner.next();

        int res;

        switch (action) {
            case "+":
                res = val1 + val2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = val1 - val2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = val1 * val2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (val2 == 0)
                    System.out.println("Ошибка! Деление на ноль не имеет смысла.");
                else {
                    res = val1 / val2;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Вы что-то не то ввели...");

        }

    }
}