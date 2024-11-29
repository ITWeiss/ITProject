package Lesson8.Task1;

public abstract class WheeledTransport implements Transport{

    private int quantityWheels;
    private int speed;

    public WheeledTransport() {
    }

    public WheeledTransport(int quantityWheels, int speed) {
        this.quantityWheels = quantityWheels;
        this.speed = speed;
    }

    public int getQuantityWheels() {
        return quantityWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setQuantityWheels(int quantityWheels) {
        this.quantityWheels = quantityWheels;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void service() {
        String commonStr = String.format("Wheels serviced: %d.", quantityWheels);
        System.out.println(commonStr);
    }
}
