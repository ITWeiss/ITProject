package Lesson8.Task1;

public class Bicycle extends WheeledTransport {

    private String typeBicycle;

    public Bicycle(int quantityWheels, int speed, String typeBicycle) {
        super(quantityWheels, speed);
        this.typeBicycle = typeBicycle;
    }

    public String getTypeBicycle() {
        return typeBicycle;
    }

    public void setTypeBicycle(String typeBicycle) {
        this.typeBicycle = typeBicycle;
    }

    @Override
    public void service() {
        super.service();
        System.out.printf("Bicycle type: %s.\n\n", typeBicycle);
        status();
    }

    private void status() {
        System.out.println("Your bicycle is fully serviced.\n");
    }
}
