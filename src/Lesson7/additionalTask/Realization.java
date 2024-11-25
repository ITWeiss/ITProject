package Lesson7.additionalTask;

public class Realization {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[]{new Car(true), new Car(false), new Truck(true), new Truck(false)};

        vehicleProcessing(vehicles);

    }

    public static void vehicleProcessing(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
            if (vehicle instanceof Car car) {
                car.playMusic();
                System.out.println();
            } else if (vehicle instanceof Truck truck) {
                truck.loadCargo();
                System.out.println();
            } else {
                System.out.println("Vehicle specifics not defined.\n");

            }
        }
    }

}
