package Lesson7.Task2;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double areaRectangle = length * width;
        System.out.printf("The area of the rectangle - %.2f\n\n", areaRectangle);
    }

    @Override
    public void draw() {
        System.out.printf("Draw a rectangle with sides %d and %d.\n", (int) length, (int) width);
    }

}
