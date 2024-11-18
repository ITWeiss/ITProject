package Task1;

public class WheeledTransport {

    private int quantityWheels;
    private int speed;

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
        String commonStr = String.format("Обслужено колёс: %d.", quantityWheels);
        System.out.println(commonStr);
    }
}
