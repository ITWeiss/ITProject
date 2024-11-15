package Lesson5;

public class Book {


    private String title;
    private Author author;
    private int yearPublication;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.yearPublication = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublication(int year) {
        this.yearPublication = year;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", year=" + yearPublication +
                '}';
    }
}
