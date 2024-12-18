package Lesson13.PhoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private static Scanner scanner = new Scanner(System.in);
    static HashMap<String, String> contacts = new HashMap<>();

    public static void main(String[] args) {

        String choice;

        do {
            showMenu();
            choice = scanner.next();
            switch (choice) {
                case "1" -> addContact();
                case "2" -> findPhoneNumber();
                case "3" -> deleteContact();
                case "4" -> showAllContacts();
                case "5" -> System.out.println("Completion of work.");
                default -> System.out.println("Wrong choice. Try again.");
            }
        } while (!choice.equals("5"));
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add a contact");
        System.out.println("2. Find the phone number");
        System.out.println("3. Delete the contact");
        System.out.println("4. Show all contacts");
        System.out.println("5. Exit");
        System.out.println("Select an action:");
    }

    public static void addContact() {
        System.out.print("Insert name: ");
        String name = scanner.next().trim();
        if (contacts.containsKey(name)) {
            System.out.printf("Contact with name \"%s\" already exists.", name);
            return;
        }

        System.out.print("Insert phone number: ");
        String phoneNumber = scanner.next().trim();

        contacts.put(name, phoneNumber);
        System.out.println("Contact successfully added.");

    }

    public static void findPhoneNumber() {
        System.out.print("Insert name: ");
        String name = scanner.next().trim();
        if (!contacts.containsKey(name)) {
            System.out.printf("Contact with name \"%s\" not found.\n", name);
            return;
        }

        String phoneNumber = contacts.get(name);
        System.out.printf("%s's phone number: %s.\n", name, phoneNumber);
    }

    public static void deleteContact() {
        System.out.print("Insert name: ");
        String name = scanner.next().trim();
        if (!contacts.containsKey(name)) {
            System.out.printf("Contact with name \"%s\" not found.\n", name);
            return;
        }

        contacts.remove(name);
        System.out.printf("Contact %s - successfully remove.\n", name);

    }

    private static void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phone directory is empty.\n");
        }

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.printf("%s: %s.\n", entry.getKey(), entry.getValue());
        }
    }
}


