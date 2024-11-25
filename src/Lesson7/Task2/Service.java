package Lesson7.Task2;

public class Service {

    public static void shapeProcessing(Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Circle circle) {
                shape.draw();
                circle.calculateArea();
            } else if (shape instanceof Rectangle rectangle) {
                shape.draw();
                rectangle.calculateArea();
            } else {
                System.out.println("The shape is not defined.");
            }
        }

    }

    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{new Circle(5), new Circle(9), new Rectangle(15.3, 8), new Rectangle(11, 14.5)};

        shapeProcessing(shapes);

    }
}
