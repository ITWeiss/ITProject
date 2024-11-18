package Task2;

public class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void work() {
        System.out.println("Project management.");
    }

    @Override
    public void position() {
        System.out.println("Position: manager.");
    }
}
