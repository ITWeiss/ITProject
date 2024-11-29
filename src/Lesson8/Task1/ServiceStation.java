package Lesson8.Task1;

public class ServiceStation {

    public void visitServiceStation(Transport transport) {
        if (transport != null) {
            transport.service();
        } else {
            System.out.println("The object type is not defined.");
        }

    }
}
