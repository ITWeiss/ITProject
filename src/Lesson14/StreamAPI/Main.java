package Lesson14.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 23),
                new Person("Jane", "Brown", 18),
                new Person("Robert", "Adams", 14),
                new Person("Aaron", "Allen", 6),
                new Person("Mary", "Hampton", 39),
                new Person("Joseph", "Walker", 14),
                new Person("Billy", "Harris", 23),
                new Person("Arthur", "Moore", 47),
                new Person("Kyle", "Rogers", 6),
                new Person("Eric", "Hodges", 39)

        );

        // Младше 18 лет
        List<Person> filtered = people.stream()
                .filter(person -> person.getAge() < 18)
                .toList();

        filtered.forEach(System.out::println);

        // Люди с возрастом больше 30
        List<String> personList = people.stream()
                .filter(person -> person.getAge() >= 30)
                .map(person -> person.getName() + " " + person.getSurname())
                .toList();

        personList.forEach(System.out::println);

        // Наибольший возраст
        Person maxAge = people.stream()
                .max(Comparator.comparing(Person::getAge)).orElse(null);

        System.out.println(maxAge);

        // Группировка по возрасту
        Map<Integer, List<Person>> groupedByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        groupedByAge.forEach((age, group) -> {
            System.out.println("Age: " + age);
            group.forEach(System.out::println);
        });

        // Средний возраст
        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println("Average age: " + averageAge);
    }
}
