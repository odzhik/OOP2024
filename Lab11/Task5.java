package Lab11;

import java.util.*;

class Point implements Comparable<Point> {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x != other.x) {
            return Integer.compare(this.x, other.x);
        }
        return Integer.compare(this.y, other.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.y != p2.y) {
            return Integer.compare(p1.y, p2.y);
        }
        return Integer.compare(p1.x, p2.x);
    }
}

public class Task5 {

    public static void main(String[] args) {
        ArrayList<Point> points = generateRandomPoints(100);

        Collections.sort(points);
        System.out.println("x-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }

        points.sort(new CompareY());
        System.out.println("\n y-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }
    }

    private static ArrayList<Point> generateRandomPoints(int numPoints) {
        Random random = new Random();
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < numPoints; i++) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            points.add(new Point(x, y));
        }
        return points;
    }
}

