//import java.util.Scanner;
//import Lab2.Circle;
//import Lab2.Rectangle;
//import Lab3.Square;
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int xCoordinate = scanner.nextInt();
//        int yCoordinate = scanner.nextInt();
//        int radius = scanner.nextInt();
//
//        Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);
//        System.out.println(myCircle);
//
//        System.out.println("Площадь: " + myCircle.getArea());
//        System.out.println("Длина окружности: " + myCircle.getCircumference());
//        System.out.println("Центры (x, y)");
//        int xCoordinate2 = scanner.nextInt();
//        int yCoordinate2 = scanner.nextInt();
//        System.out.println("Радиус:");
//        int radius2 = scanner.nextInt();
//
//        Circle secondCircle = new Circle(xCoordinate2, yCoordinate2, radius2);
//
//        System.out.println(secondCircle);
//        System.out.println("Площадь: " + secondCircle.getArea());
//        System.out.println("Длина: " + secondCircle.getCircumference());
//
//        double distance = myCircle.getDistanceTo(secondCircle);
//        System.out.println("Дистанция между центрами двух кругов " + distance);
//
//        System.out.println("Левые и правые нижние x1, y1, x2, y2: ");
//        double rx1 = scanner.nextDouble();
//        double ry1 = scanner.nextDouble();
//        double rx2 = scanner.nextDouble();
//        double ry2 = scanner.nextDouble();
//
//        Rectangle firstRectangle = new Rectangle(rx1, ry1, rx2, ry2);
//        System.out.println(firstRectangle);
//        System.out.println("Площадь: " + firstRectangle.getArea());
//        System.out.println("Периметр: " + firstRectangle.getPerimeter());
//
//        System.out.println("Enter coord. left top and right bottom points of rect(x1 y1 x2 y2):");
//        double rx3 = scanner.nextDouble();
//        double ry3 = scanner.nextDouble();
//        double rx4 = scanner.nextDouble();
//        double ry4 = scanner.nextDouble();
//
//        Rectangle secondRectangle = new Rectangle(rx3, ry3, rx4, ry4);
//        System.out.println(secondRectangle);
//        System.out.println("Плоащдь: " + secondRectangle.getArea());
//        System.out.println("Периметр: " + secondRectangle.getPerimeter());
//
//        double rectangleDistance = firstRectangle.getDistanceToTheCenterOf(secondRectangle);
//        System.out.println("Дистанция между 2 центрами прямоугольников: " + rectangleDistance);
//
//        scanner.close();
//
//        scanner.close();
//    }
//}


// lab 3
//import Lab3.Square;
//import Lab2.Rectangle;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the top-left coordinates and side length of the square:");
//        int xTopLeftCoordinate = scanner.nextInt();
//        int yTopLeftCoordinate = scanner.nextInt();
//        int sideLength = scanner.nextInt();
//
//        Square square = new Square(xTopLeftCoordinate, yTopLeftCoordinate, sideLength);
//
//        System.out.println("Площадь: " + square.getArea());
//        System.out.println("Периметр: " + square.getPerimeter());
//        System.out.println("Цвет: " + square.getColor());
//        System.out.println("Закрашен: " + square.isFilled());
//
//        System.out.println("Enter the new color:");
//        String newColor = scanner.next();
//        square.setColor(newColor);
//
//        System.out.println("Цвет: " + square.getColor());
//    }
//}

// Lab4


import Lab3.Square;
import Lab2.Rectangle;
import Lab2.Circle;
import Lab3.MyShape;
import java.util.HashMap;
import java.util.Scanner;
//public class Main {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        HashMap<MyShape, String> myHashMap = new HashMap<>();
//        Circle myCircle = new Circle(0, 0, 1);
//        Rectangle myRectangle = new Rectangle(0, 1, 1, 0);
//        Square mySquare = new Square(0, 1, 1);
//
//        myHashMap.put(myCircle, "CIRCLE");
//        myHashMap.put(myRectangle, "RECTANGLES");
//        myHashMap.put(mySquare, "SQUARES");
//
//        System.out.println("INITIAL - " + myHashMap.size() + " " + myHashMap.get(myCircle));
//
//        Circle circleWithSameAttributes = new Circle(0, 0, 2);
//        myHashMap.put(circleWithSameAttributes, "SAME CIRCLES");
//        System.out.println("ADDED CIRCLE WITH SAME ATTRIBUTES - " + myHashMap.size() + " " + myHashMap.get(myCircle));
//    }
//
//}

// Lab5

import Lab5.*;

//public class Main {
//    public static void main(String[] args) {
//        AnimalArrayList animalArrayList = new AnimalArrayList();
//        Animal cat = new Cat("Markiz");
//        Animal cat1 = new Cat("Boris");
//        Animal cat2 = new Cat("Boris1");
//        Animal dog = new Dog("Baron");
//        animalArrayList.add(cat);
//        animalArrayList.add(cat1);
//        animalArrayList.add(cat2);
//        animalArrayList.add(dog);
//        System.out.println(animalArrayList.get(1));
//        Animal newDog = new Dog("Reks");
//        animalArrayList.set(1, newDog);
//        for (int i = 0; i < animalArrayList.getSize(); i++) {
//            Animal currentAnimal = animalArrayList.get(i);
//            System.out.println("Animal " + currentAnimal.getName() + " says ");
//            currentAnimal.sound();
//
//        }
//        animalArrayList.clear();
//    }
//}
//


// lab 6

//public class Main {
//    public static void main(String[] args) {
//        AnimalLinkedList list = new AnimalLinkedList();
//        list.add(new Animal("Dog"));
//        list.add(new Animal("Cat"));
//
//        list.printList();
//        System.out.println("Size: " + list.getSize());
//
//        AnimalLinkedList.Node node = list.findNodeByIndex(1);
//        System.out.println("Element at index 1: " + node.getElement().getName()); // Выводит: Element at index 1: Cat
//
//        AnimalArrayList arrayList = new AnimalArrayList();
//
//        list.addAll(arrayList);
//        list.printList();
//        System.out.println("Size: " + list.getSize());
//    }
//}

import java.util.Arrays;
import Lab7.Worker;
import Lab7.Programmer;
import Lab7.Teacher;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[10];
        workers[0] = new Programmer("Alice", 5000, 100, 0.4, 1.5);
        workers[1] = new Programmer("Bob", 4500, 90, 0.35, 1.2);
        workers[2] = new Programmer("Charlie", 6000, 110, 0.3, 1.8);
        workers[3] = new Programmer("David", 5200, 95, 0.32, 1.6);
        workers[4] = new Programmer("Eve", 4800, 105, 0.33, 1.7);
        workers[5] = new Teacher("Frank", 4000, 80, 0.3, 0.05);
        workers[6] = new Teacher("Grace", 4200, 85, 0.25, 0.04);
        workers[7] = new Teacher("Hank", 3800, 75, 0.35, 0.03);
        workers[8] = new Teacher("Ivy", 4100, 82, 0.28, 0.06);
        workers[9] = new Teacher("Jack", 3900, 78, 0.27, 0.05);

        // Calculate the total work done by all workers in 5 hours
        double totalWork5Hours = Arrays.stream(workers).mapToDouble(worker -> worker.toWork(5)).sum();
        System.out.println("Total work done by all workers in 5 hours: " + totalWork5Hours + " KJ");

        // Calculate the total work done by all workers in 10 hours
        double totalWork10Hours = Arrays.stream(workers).mapToDouble(worker -> worker.toWork(10)).sum();
        System.out.println("Total work done by all workers in 10 hours: " + totalWork10Hours + " KJ");

        // Print total work done by each worker in 10 hours
        System.out.println("Total work done by each worker in 10 hours:");
        Arrays.stream(workers).forEach(worker -> {
            System.out.println(worker.getFullName() + ": " + worker.toWork(10) + " KJ");
        });

        // Find the worker with the maximum power
        Worker maxPowerWorker = Arrays.stream(workers).max((w1, w2) -> Double.compare(w1.getPower(), w2.getPower())).orElse(null);
        if (maxPowerWorker != null) {
            System.out.println("Worker with maximum power: " + maxPowerWorker);
        }

        // Find the worker with the maximum work done in 10 hours
        Worker maxWorkDoneWorker = Arrays.stream(workers).max((w1, w2) -> Double.compare(w1.toWork(10), w2.toWork(10))).orElse(null);
        if (maxWorkDoneWorker != null) {
            System.out.println("Worker with maximum work done in 10 hours: " + maxWorkDoneWorker);
        }
    }
}
