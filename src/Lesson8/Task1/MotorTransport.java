package Lesson8.Task1;

public abstract class MotorTransport extends WheeledTransport {

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
        System.out.printf("Engine type: %s.\n", typeEngine);
    }
}
