package Lesson6;

public class Truck extends MotorTransport {

    private int payload;

    public Truck(int quantityWheels, int speed, String typeEngine, int payload) {
        super(quantityWheels, speed, typeEngine);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public void service() {
        String firstStr = String.format("Обслужен грузовик грузоподъемностью: %d.", payload);
        System.out.println(firstStr);
        super.service();
        System.out.println();
    }
}
