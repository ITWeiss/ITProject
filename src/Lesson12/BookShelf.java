package Lesson12;

import java.util.ArrayList;

public class BookShelf {

    private ArrayList<String> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public void addBook(String bookName) {
        if (bookName != null && !bookName.isEmpty()) {
            books.add(bookName);
        }
    }

    public void removeBook(String bookName) {
        books.remove(bookName);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The shelf is empty");
        } else {
            for (String book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        BookShelf shelf1 = new BookShelf();

        shelf1.addBook("To Kill a Mockingbird");
        shelf1.addBook("One Flew Over the Cuckoo's Nest");
        shelf1.addBook("Pride and Prejudice");

        shelf1.listBooks();

        shelf1.removeBook("One Flew Over the Cuckoo's Nest");

        shelf1.listBooks();

        BookShelf shelf2 = new BookShelf();
        shelf2.listBooks();

    }
}
