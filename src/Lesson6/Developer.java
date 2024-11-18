package Lesson6;

public class Developer extends Employee{
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void work() {
        System.out.println("Software development.");
    }

    @Override
    public void position() {
        System.out.println("Position: developer.");
    }
}
