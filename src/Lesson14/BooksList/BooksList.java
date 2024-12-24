package Lesson14.BooksList;

import Lesson14.StreamAPI.Person;

import java.util.*;
import java.util.stream.Collectors;

public class BooksList {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Гамлет", "Уильям Шекспир", 700),
                new Book("Граф Монте‑Кристо", "Александр Дюма", 1050),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 800),
                new Book("Война и мир", "Лев Толстой", 600),
                new Book("Три мушкетёра", "Александр Дюма", 450),
                new Book("Король Лир", "Уильям Шекспир", 700),
                new Book("О дивный новый мир", "Олдос Хаксли", 850),
                new Book("Скотный двор", "Джордж Оруэлл", 350),
                new Book("Над пропастью во ржи", "Джером Сэлинджер", 600),
                new Book("1984", "Джордж Оруэлл", 1000)
        );

        // Самая дорогая книга
        Book maxPrice = books.stream()
                .max(Comparator.comparing(Book::getPrice)).orElse(null);

        // Самая дешевая книга
        Book minPrice = books.stream()
                .min(Comparator.comparing(Book::getPrice)).orElse(null);

        System.out.printf("Max price:\n%s\n", maxPrice);
        System.out.printf("Min price:\n%s\n", minPrice);

        // Уникальные авторы
        Set<String> authors = books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.toSet());

        System.out.println(authors);

        // Общая стоимость книг
        int sum = books.stream()
                .mapToInt(Book::getPrice)
                .sum();

        System.out.println(sum);

        // Список книг стомостью больше 500
        List<Book> filteredPriceLess500 = books.stream()
                .filter(book -> book.getPrice() > 500)
                .collect(Collectors.toList());

        System.out.println(filteredPriceLess500);
    }


}
