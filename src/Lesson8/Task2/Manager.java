package Lesson8.Task2;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePayment() {
        return baseSalary * bonus;
    }
}
