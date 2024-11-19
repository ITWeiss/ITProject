package Lesson6.Task1;

public class MotorTransport extends WheeledTransport {

    private String typeEngine;

    public MotorTransport(int quantityWheels, int speed, String typeEngine) {
        super(quantityWheels, speed);
        this.typeEngine = typeEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    @Override
    public void service() {
        super.service();
        String secondStr = String.format("Тип двигателя: %s.", typeEngine);
        System.out.println(secondStr);

    }
}
