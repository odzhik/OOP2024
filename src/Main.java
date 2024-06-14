import java.util.Scanner;
import Lab2.Circle;
import Lab2.Rectangle;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xCoordinate = scanner.nextInt();
        int yCoordinate = scanner.nextInt();
        int radius = scanner.nextInt();

        Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);
        System.out.println(myCircle);

        System.out.println("Площадь: " + myCircle.getArea());
        System.out.println("Длина окружности: " + myCircle.getCircumference());
        System.out.println("Центры (x, y)");
        int xCoordinate2 = scanner.nextInt();
        int yCoordinate2 = scanner.nextInt();
        System.out.println("Радиус:");
        int radius2 = scanner.nextInt();

        Circle secondCircle = new Circle(xCoordinate2, yCoordinate2, radius2);

        System.out.println(secondCircle);
        System.out.println("Площадь: " + secondCircle.getArea());
        System.out.println("Длина: " + secondCircle.getCircumference());

        double distance = myCircle.getDistanceTo(secondCircle);
        System.out.println("Дистанция между центрами двух кругов " + distance);

        System.out.println("Левые и правые нижние x1, y1, x2, y2: ");
        double rx1 = scanner.nextDouble();
        double ry1 = scanner.nextDouble();
        double rx2 = scanner.nextDouble();
        double ry2 = scanner.nextDouble();

        Rectangle firstRectangle = new Rectangle(rx1, ry1, rx2, ry2);
        System.out.println(firstRectangle);
        System.out.println("Площадь: " + firstRectangle.getArea());
        System.out.println("Периметр: " + firstRectangle.getPerimeter());

        System.out.println("Enter coord. left top and right bottom points of rect(x1 y1 x2 y2):");
        double rx3 = scanner.nextDouble();
        double ry3 = scanner.nextDouble();
        double rx4 = scanner.nextDouble();
        double ry4 = scanner.nextDouble();

        Rectangle secondRectangle = new Rectangle(rx3, ry3, rx4, ry4);
        System.out.println(secondRectangle);
        System.out.println("Плоащдь: " + secondRectangle.getArea());
        System.out.println("Периметр: " + secondRectangle.getPerimeter());

        double rectangleDistance = firstRectangle.getDistanceToTheCenterOf(secondRectangle);
        System.out.println("Дистанция между 2 центрами прямоугольников: " + rectangleDistance);

        scanner.close();

        scanner.close();
    }
}

