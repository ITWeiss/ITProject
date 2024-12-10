package Lesson11.Book;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return String.format("The book \"%s\" was written %s. Year of publication: %d.", title, author, yearOfPublication);
    }

    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        book1.setYearOfPublication(1997);

        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        book2.setYearOfPublication(2000);

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(book1);
        System.out.println(book2);
    }
}
