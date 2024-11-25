package Lesson7.additionalTask;

public class Truck extends Vehicle {

    private boolean isLoaded;

    public Truck(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    public void loadCargo() {
        if (isLoaded) {
            System.out.println("The cargo is loaded.");
        } else {
            System.out.println("the cargo is not loaded.");
        }
    }

    @Override
    public void drive() {
        System.out.println("The truck is moving.");
    }

}
