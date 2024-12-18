package Lesson13.Students;

import java.util.*;

public class StudentGradesManager {

    private static Scanner scanner = new Scanner(System.in);
    private static final Map<String, List<Integer>> students = new HashMap<>();

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addGradeToStudent();
                    break;
                case 3:
                    showStudentsAndAverageGrades();
                    break;
                case 4:
                    System.out.println("Completion of work.");
                    break;
                default:
                    System.out.println("Wrong choice. Try again.");
            }
        } while (choice != 4);
    }

    private static void showMenu() {
        System.out.println("Educational magazine:");
        System.out.println("1. Added student");
        System.out.println("2. Add student's grade");
        System.out.println("3. Show students and their average grades");
        System.out.println("4. Exit");
    }

    private static int getUserChoice() {
        System.out.println("Your choice: ");
        return scanner.nextInt();
    }

    private static void addStudent() {
        scanner.nextLine();
        System.out.print("Insert student's name: ");
        String studentName = scanner.nextLine();

        if (students.containsKey(studentName)) {
            System.out.println("Student with this name already exists.\n");
        } else {
            students.put(studentName, new ArrayList<>());
            System.out.println("Student added.");
        }
    }

    private static void addGradeToStudent() {
        scanner.nextLine();
        System.out.print("Insert student's name: ");
        String studentName = scanner.nextLine();

        if (students.containsKey(studentName)) {
            System.out.print("Insert grade: ");
            int grade = scanner.nextInt();
            students.get(studentName).add(grade);
            System.out.println("Grade added.");

        } else {
            System.out.println("Student with that name is not on the list\n.");
        }
    }

    private static void showStudentsAndAverageGrades() {
        if (students.isEmpty()) {
            System.out.println("There are no students.");
            return;
        }
        System.out.println("Students list and their average grades:");
        for (Map.Entry<String, List<Integer>> entry : students.entrySet()) {
            double average = calculateAverage(entry.getValue());
            System.out.printf("%s: %.2f%n", entry.getKey(), average);
        }
    }

    private static double calculateAverage(List<Integer> grades) {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

