package Lesson13.TextAnalyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextAnalyzer {

    public static void main(String[] args) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();

        if (args.length > 0) {
            String fileName = args[0];
            readFromFile(fileName, wordCountMap, uniqueWords);
        } else {
            readFromConsole(wordCountMap, uniqueWords);
        }

        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        printMostFrequentWords(wordCountMap);
    }

    private static void readFromFile(String fileName, Map<String, Integer> wordCountMap, Set<String> uniqueWords) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                String cleanWord = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
                if (!cleanWord.isEmpty()) {
                    uniqueWords.add(cleanWord);
                    wordCountMap.put(cleanWord, wordCountMap.getOrDefault(cleanWord, 0) + 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    private static void readFromConsole(Map<String, Integer> wordCountMap, Set<String> uniqueWords) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the text. Enter 'exit' to complete:");
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            String[] words = line.split("\\s+");
            for (String word : words) {
                String cleanWord = word.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
                if (!cleanWord.isEmpty()) {
                    uniqueWords.add(cleanWord);
                    wordCountMap.put(cleanWord, wordCountMap.getOrDefault(cleanWord, 0) + 1);
                }
            }
        }
        scanner.close();
    }

    private static void printMostFrequentWords(Map<String, Integer> wordCountMap) {

        int maxCount = 0;
        String maxWord = "";

        System.out.println("\nFrequency of occurrence of words:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }

        System.out.printf("\nThe most common words: \"%s\", meets %d times.", maxWord, maxCount);
    }
}

