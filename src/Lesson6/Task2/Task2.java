package Lesson6.Task2;

public class Task2 {
    public static void main(String[] args) {

        Employee[] employees = {
                new Manager("Alex", 82400), new Developer("John", 120000), new Developer("Sam", 144500)
        };

        printEmployees(employees);

    }

    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
            employee.position();
            employee.work();
            System.out.println();
        }
    }
}
