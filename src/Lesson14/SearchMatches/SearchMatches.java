package Lesson14.SearchMatches;

import java.util.Comparator;
import java.util.List;

public class SearchMatches {
    public static void main(String[] args) {

        List<String> words = List.of("Planet", "Key", "Call", "Builder", "Pie");

        boolean a = words.stream().anyMatch(word -> word.startsWith("A"));
        System.out.println(a);

        boolean b = words.stream().anyMatch(word -> word.startsWith("B"));
        System.out.println(b);

        boolean c = words.stream().anyMatch(word -> word.startsWith("C"));
        System.out.println(c);

        boolean wordLength = words.stream().allMatch(word -> word.length() >= 5);
        System.out.println(wordLength);

        String maxWord2 = words.stream()
                .max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(maxWord2);
    }
}
