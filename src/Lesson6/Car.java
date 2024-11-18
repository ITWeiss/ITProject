package Lesson6;

public class Car extends MotorTransport {

    private String mark;
    private String model;

    public Car(int quantityWheels, int speed, String typeEngine, String mark, String model) {
        super(quantityWheels, speed, typeEngine);
        this.mark = mark;
        this.model = model;

    }


    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void service() {
        String firstStr = String.format("Обслужен автомобиль: %s %s.", mark, model);
        System.out.println(firstStr);
        super.service();
        System.out.println();
    }

}
