package Lab3;
import Lab2.Circle;
import Lab2.Rectangle;
public class MyShape {
    public String color;
    public boolean filled;

    public MyShape() {
        this.color = "red";
        this.filled = true;
    }

    public MyShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "MyShape{" + "color='" + color + '\'' + ", isFilled=" + filled + '}';
    }
}