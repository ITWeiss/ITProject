package Lesson6;

public class WheeledTransport {

    int quantityWheels;
    int speed;

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
        String commonStr = String.format("Количество колес: %d.", quantityWheels);
        System.out.println(commonStr);
    }
}
