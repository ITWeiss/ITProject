package Lesson8.Task1;

import java.util.ArrayList;

public class Realization {

    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle(2, 56, "mountain");
        Bicycle bicycle2 = new Bicycle(2, 73, "track");
        Car car1 = new Car(4, 190, "petrol", "Kia", "Sportage");
        Car car2 = new Car(4, 210, "petrol", "Ford", "Focus");
        Truck truck1 = new Truck(12, 140, "diesel", 12);
        Truck truck2 = new Truck(12, 130, "diesel", 9);

        ArrayList<WheeledTransport> transports = new ArrayList<>();
        transports.add(bicycle1);
        transports.add(bicycle2);
        transports.add(car1);
        transports.add(car2);
        transports.add(truck1);
        transports.add(truck2);

        ServiceStation serviceStation = new ServiceStation();

        for (WheeledTransport transport : transports) {
            serviceStation.visitServiceStation(transport);
        }
    }

}
