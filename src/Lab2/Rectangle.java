package Lab2;
import Lab3.MyShape;
public class Rectangle extends MyShape {
    private double x1, y1;
    private double x2, y2;

    public Rectangle() {
        super();
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 1;
        this.y2 = -1;
    }

    public Rectangle(
            double x1,
            double y1,
            double x2,
            double y2
    ) {
        super(); // Calls the default constructor of MyShape
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(
            double x1,
            double y1,
            double x2,
            double y2,
            String color,
            boolean filled
    ) {
        super(color, filled); // Calls the parameterized constructor of MyShape
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Getters and setters for Rectangle properties
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    // Method to calculate length
    public double getLength() {
        return Math.abs(x2 - x1);
    }

    // Method to calculate width
    public double getWidth() {
        return Math.abs(y2 - y1);
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                "} which is a subclass of " + super.toString();
    }

    // Method to calculate area
    public double getArea() {
        return getLength() * getWidth();
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    // Method to calculate distance to the center of another rectangle
    public double getDistanceToTheCenterOf(Rectangle anotherRectangle) {
        double xCenter1 = (this.x1 + this.x2) / 2;
        double yCenter1 = (this.y1 + this.y2) / 2;

        double xCenter2 = (anotherRectangle.x1 + anotherRectangle.x2) / 2;
        double yCenter2 = (anotherRectangle.y1 + anotherRectangle.y2) / 2;

        double dx = xCenter1 - xCenter2;
        double dy = yCenter1 - yCenter2;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

