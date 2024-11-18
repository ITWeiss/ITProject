package Task1;

public class Task1 {

    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle(2, 40, "mountain");

        Car car1 = new Car(4, 196, "petrol", "Ford", "Focus 3");

        Truck truck1 = new Truck(12, 110, "diesel", 20000);

        visitServiceStation(bicycle1, car1, truck1);

    }

    public static void visitServiceStation(WheeledTransport b, WheeledTransport c, WheeledTransport t) {
        b.service();
        c.service();
        t.service();
    }

}
