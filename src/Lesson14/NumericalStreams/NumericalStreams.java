package Lesson14.NumericalStreams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class NumericalStreams {
    public static void main(String[] args) {

        List<Integer> numbers = new Random().ints(20, 1, 100).boxed().collect(Collectors.toList());

        // Исходный список
        System.out.println(numbers);

        // Список четных чисел
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        // Сумма всех чисел, кратных 5
        int sum = numbers.stream()
                .filter(n -> n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        // Квадрат каждого числа в списке
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squares);

        // Метод anyMatch
        boolean isGreaterThan50 = numbers.stream()
                .anyMatch(n -> n > 50);

        System.out.println(isGreaterThan50);
    }
}