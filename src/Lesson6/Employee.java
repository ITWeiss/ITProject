package Lesson6;

public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return 0;
    }

    public void work() {
        System.out.println("The employee is working.");
    }

    public void position() {
        System.out.println("Position is: not defined.");
    }

    @Override
    public String toString() {
        String str1 = String.format("Employee's name: %s. Salary: %d", name, salary);
        return str1;
    }
}
