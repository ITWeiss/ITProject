package Lesson7.Task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the type of object:\nInsert 1 or bicycle\nInsert 2 or car\nInsert 3 or truck");
        String choice = scanner.next();

        WheeledTransport transport = new WheeledTransport();

        if (choice.equals("1") || choice.equals("bicycle")) {
            transport = new Bicycle(2, 73, "Track");
            System.out.println("\nYour choice is bicycle.\n");
        } else if (choice.equals("2") || choice.equals("car")) {
            transport = new Car(4, 196, "Petrol", "Ford", "Focus");
            System.out.println("\nYour choice is car.\n");
        } else if (choice.equals("3") || choice.equals("truck")) {
            transport = new Truck(12, 110, "Diesel", 18);
            System.out.println("\nYour choice is truck.\n");
        } else {
            System.out.println("Incorrect value is selected.");
        }

        scanner.close();
        visitServiceStation(transport);
    }

    public static void visitServiceStation(WheeledTransport typeTransport) {
        if (typeTransport instanceof Bicycle bicycle) {
            bicycle.service();
            bicycle.status();
        } else if (typeTransport instanceof Car car) {
            car.service();
            car.status();
        } else if (typeTransport instanceof Truck truck) {
            truck.service();
            truck.status();
        } else {
            System.out.println("The object type is not defined.\n");
        }
    }

}
