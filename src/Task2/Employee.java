package Task2;

public class Employee {

    private String name;
    protected int salary;

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
        return String.format("Employee's name: %s. Salary: %d", name, salary);
    }
}
