package Lesson5;

public class Task1 {

    public static void main(String[] args) {


        Author author1 = new Author("Jack", "London");
        Author author2 = new Author("Ayn", "Rand");

        Book book1 = new Book("Martin Eden", author1, 1908);
        Book book2 = new Book("Atlas Shrugged", author2, 1967);




        System.out.println(book1);
        System.out.println(book2);

        book1.setYearPublication(1909);
        System.out.println("The correct year of publication -  " + book1.getYearPublication() + ".");



        book2.setYearPublication(1957);
        System.out.println("The correct year of publication -  " + book2.getYearPublication() + ".");

    }
}
