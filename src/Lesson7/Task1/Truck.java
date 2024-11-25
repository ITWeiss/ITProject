package Lesson7.Task1;

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
        super.service();
        System.out.printf("Truck load capacity: %d tons.\n\n", payload);
    }

    public final void status() {
        System.out.println("Your truck is fully serviced.");
    }
}
