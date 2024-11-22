package Lesson7.Task2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        final double p = 3.14;
        double squareNumber;
        squareNumber = Math.pow(radius, 2);
        System.out.printf("The area of the circle - %.2f.\n\n", squareNumber);
    }

    @Override
    public void draw() {
        System.out.printf("Draw a circle with radius %d.\n", (int) radius);
    }

}
