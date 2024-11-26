package Lesson8.Task1;

public class Car extends MotorTransport {

    private String brand;
    private String model;

    public Car(int quantityWheels, int speed, String typeEngine, String brand, String model) {
        super(quantityWheels, speed, typeEngine);
        this.brand = brand;
        this.model = model;

    }

    public void setMark(String mark) {
        this.brand = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void service() {
        super.service();
        System.out.printf("Car serviced: %s %s.\n\n", brand, model);
        status();
    }

    private void status() {
        System.out.println("Your car is fully serviced.\n");
    }

}
