package Lesson7.additionalTask;

public class Car extends Vehicle {

    private boolean isMusicOn;

    public Car(boolean isMusicOn) {
        this.isMusicOn = isMusicOn;
    }

    public void playMusic() {
        if (isMusicOn) {
            System.out.println("The music in the car is on.");
        } else {
            System.out.println("The music in the car is turned off.");
        }
    }

    @Override
    public void drive() {
        System.out.println("The car is moving.");
    }

}
