package Lesson5;

public class Author {


    private String name;
    private String lastName;



    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
