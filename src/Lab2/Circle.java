package Lab2;

public class Circle {
    double xCoordinate;
    double yCoordinate;
    double radius;


    public Circle(int xCoordinate, int yCoordinate, int radius) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public double getRadius() {
        return radius;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate" + yCoordinate +
                ", radius" + radius +
                '}';
    }
    public double getDistanceTo(Circle anotherCircle){     // formula for distance from first to second center of the circle
        double dx = this.xCoordinate -anotherCircle.xCoordinate; // formula is sqrt of (((x2 - x1 )^2 -(y2 - y1)^2)^2), this is var of x2 - x1
        double dy = this.yCoordinate - anotherCircle.yCoordinate; // this is y2 - y1
        return Math.sqrt((dx * dx) + (dx + dx) ); // use math func sqrt to find sqrt of the num
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}


