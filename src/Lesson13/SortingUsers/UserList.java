package Lesson13.SortingUsers;

import java.util.*;

public class UserList {
    private static List<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        users.add(new User("Ivan", 34));
        users.add(new User("Alexey", 28));
        users.add(new User("Petr", 42));
        users.add(new User("Oleg", 16));

        int choice;
        do {
            showMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    sortByName();
                    break;
                case 2:
                    sortByAge();
                    break;
                case 3:
                    showUsersList();
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
        System.out.println("Menu:");
        System.out.println("1. Sorting by name");
        System.out.println("2. Sorting by age");
        System.out.println("3. Show list");
        System.out.println("4. Exit");
    }

    private static int getUserChoice() {
        System.out.println("Your choice: ");
        return scanner.nextInt();
    }

    private static void sortByName() {
        Collections.sort(users, Comparator.comparing(User::getName));
        System.out.println("Users sorting by name.");
    }

    private static void sortByAge() {
        Collections.sort(users, Comparator.comparing(User::getAge));
        System.out.println("Users sorting by age.");
    }

    private static void showUsersList() {
        if (users.isEmpty()) {
            System.out.println("Users list is empty.");
        } else {
            System.out.println("Current list of users:");
            for (User user : users) {
                System.out.println(user.toString());
            }
        }
    }
}

