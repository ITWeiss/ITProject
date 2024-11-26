package Lesson8.Task2;

public class Developer extends Employee {

    private int completedProjects;

    public Developer(String name, double baseSalary, int completedProjects) {
        super(name, baseSalary);
        this.completedProjects = completedProjects;
    }


    @Override
    public double calculatePayment() {
        return baseSalary + 500 * completedProjects;
    }
}
