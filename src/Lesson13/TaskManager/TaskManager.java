package Lesson13.TaskManager;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> tasks = new LinkedList<>();

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
             choice = getUserInput();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    moveTask();
                    break;
                case 5:
                    System.out.println("Completion of work.");
                    break;
                default:
                    System.out.println("Wrong choice. Try again.");
            }
        } while (choice != 5);

    }

    private static void showMenu() {
        System.out.println("Task Manager:");
        System.out.println("1. Added task");
        System.out.println("2. Show task list");
        System.out.println("3. Remove task");
        System.out.println("4. Move task");
        System.out.println("5. Exit");
    }

    private static int getUserInput() {
        System.out.println("Your choice: ");
        return scanner.nextInt();
    }

    private static void addTask() {
        scanner.nextLine(); // Очищаем буфер после ввода числа
        System.out.print("Insert task: ");
        String taskDescription = scanner.nextLine();
        tasks.add(taskDescription);
        System.out.println("Task added.");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            System.out.println("Task list:");
            for (int i = 0; i < tasks.size(); i++) {
                int number = i + 1;
                System.out.printf("%d. %s\n", number, tasks.get(i));
            }
        }
    }

    private static void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            viewTasks();
            System.out.print("Insert task's index to remove: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
                System.out.println("Task remove.");
            } else {
                System.out.println("Incorrect index.");
            }
        }
    }

    private static void moveTask() {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            viewTasks();
            System.out.print("Insert task's index to move: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < tasks.size()) {
                System.out.print("Insert the direction of movement (up/down): ");
                scanner.nextLine(); // Очищаем буфер после ввода числа
                String direction = scanner.nextLine();
                if ("up".equalsIgnoreCase(direction)) {
                    if (index > 0) {
                        swapTasks(index, index - 1);
                        System.out.println("Task moved up.");
                    } else {
                        System.out.println("You cannot move the task above the first position.");
                    }
                } else if ("down".equalsIgnoreCase(direction)) {
                    if (index < tasks.size() - 1) {
                        swapTasks(index, index + 1);
                        System.out.println("Task moved down.");
                    } else {
                        System.out.println("You cannot move the task above the last position.");
                    }
                } else {
                    System.out.println("Incorrect direction of movement.");
                }
            } else {
                System.out.println("Incorrect index.");
            }
        }
    }

    private static void swapTasks(int firstIndex, int secondIndex) {
        String temp = tasks.get(firstIndex);
        tasks.set(firstIndex, tasks.get(secondIndex));
        tasks.set(secondIndex, temp);
    }
}
