package Lesson14.UniqueValues;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchUniqueValues {
    public static void main(String[] args) {

        List<String> name = List.of("Arthur", "Aaron", "Eric", "Robert", "Arthur", "Eric");

        // Уникальные значения
        name.stream().distinct().forEach(System.out::println);

        // Количество значений
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String names : name) {
            nameCounts.put(names, nameCounts.getOrDefault(names, 0) + 1);
        }
        nameCounts.forEach((n, v) -> System.out.printf("%s, value: %d\n", n, v));

        // Алфавитный порядок
        name.stream().sorted().forEach(System.out::println);
    }

}
