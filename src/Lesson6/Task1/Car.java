package Lesson6.Task1;

public class Car extends MotorTransport {

    private String brand;
    private String model;

    public Car(int quantityWheels, int speed, String typeEngine, String mark, String model) {
        super(quantityWheels, speed, typeEngine);
        this.brand = mark;
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
        String firstStr = String.format("Обслужен автомобиль: %s %s.", brand, model);
        System.out.println(firstStr);
        System.out.println();
    }

}
