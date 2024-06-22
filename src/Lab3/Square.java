package Lab3;
import Lab2.Rectangle;

public class Square extends Rectangle {

    // Default constructor
    public Square() {
        super(); // Calls the default constructor of Rectangle
    }

    // Constructor with Square parameters
    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength) {
        super(xTopLeftCoordinate, yTopLeftCoordinate, xTopLeftCoordinate + sideLength, yTopLeftCoordinate - sideLength);
    }

    // Constructor with Square and MyShape parameters
    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength, String color, boolean filled) {
        super(xTopLeftCoordinate, yTopLeftCoordinate, xTopLeftCoordinate + sideLength, yTopLeftCoordinate - sideLength, color, filled);
    }

    // Method to get the side length of the square
    public double getSideLength() {
        return getLength();
    }

    // toString method
    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + getSideLength() +
                "} which is a subclass of " + super.toString();
    }
}