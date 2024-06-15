package Lab2;
import Lab3.MyShape;

public class Circle extends MyShape {
    private double xCoordinate;
    private double yCoordinate;
    private double radius;


    // Default constructor
    public Circle() {
        super(); // Calls the default constructor of MyShape
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.radius = 1;

    }

    // Constructor with Circle parameters
    public Circle(int xCoordinate, int yCoordinate, int radius) {
        super(); // Calls the default constructor of MyShape
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
        String color;
        boolean filled;
    }

    // Constructor with Circle and MyShape parameters
    public Circle(int xCoordinate, int yCoordinate, int radius, String color, boolean filled) {
        super(color, filled); // Calls the parameterized constructor of MyShape
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    // Getters and setters for Circle properties
    public double getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", radius=" + radius +
                "} which is a subclass of " + super.toString();
    }

    // Method to calculate distance to another circle
    public double getDistanceTo(Circle anotherCircle) {
        double dx = this.xCoordinate - anotherCircle.xCoordinate;
        double dy = this.yCoordinate - anotherCircle.yCoordinate;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
