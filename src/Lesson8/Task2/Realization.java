package Lesson8.Task2;

import java.util.ArrayList;

public class Realization {

    public static void main(String[] args) {

        Manager manager1 = new Manager("John", 4000, 1.65);
        Manager manager2 = new Manager("Ann", 4000, 1.78);
        Developer developer1 = new Developer("Zoe", 5000, 5);
        Developer developer2 = new Developer("Marko", 5000, 7);

        ArrayList<Employee> employees =new ArrayList<>();
        employees.add(manager1);
        employees.add(developer1);
        employees.add(manager2);
        employees.add(developer2);

        for (Employee employee : employees) {
            System.out.printf("%s's payment: %.2f.\n", employee.getName(), employee.calculatePayment());
        }
    }

}
