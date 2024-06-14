package Lab2;

public class Rectangle {
    double x1, y1; //
    double x2, y2; //


    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //find Area
    public double getArea() {
        return Math.abs((x2 - x1) * (y2 - y1));
    }

    // find Perimetr
    public double getPerimeter() {
        return 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }

    // distance from first to second center of 2 rectangles
    public double getDistanceToTheCenterOf(Rectangle anotherRectangle) {
        double xCenter1 = (this.x1 + this.x2) / 2;
        double yCenter1 = (this.y1 + this.y2) / 2;

        double xCenter2 = (anotherRectangle.x1 + anotherRectangle.x2) / 2;
        double yCenter2 = (anotherRectangle.y1 + anotherRectangle.y2) / 2;

        double dx = xCenter1 - xCenter2;
        double dy = yCenter1 - yCenter2;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //
    @Override
    public String toString() {
        return "Rectangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}