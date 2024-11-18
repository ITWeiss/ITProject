package Task1;

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
        String firstStr = String.format("Обслужен велосипед тип: %s.", typeBicycle);
        System.out.println(firstStr);
        System.out.println();
    }
}
