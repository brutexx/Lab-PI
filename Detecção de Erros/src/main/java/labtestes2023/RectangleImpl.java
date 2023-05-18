package main.java.labtestes2023;

public class RectangleImpl implements Rectangle {
    private double length;
    private double width;

    public RectangleImpl(double length, double width) throws InvalidRectangle {
        if (length <= 0 || width <= 0) {
            throw new InvalidRectangle();
        }

        this.length = length;
        this.width = width;
    };

    public double getLength() {
        return length;
    };

    public double getWidth() {
        return width;
    };

    public double calculateArea() {
        return length * width;
    };

    public double calculatePerimeter() {
        return 2 * (length + width);
    };
}
