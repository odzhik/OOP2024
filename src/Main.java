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


//import Lab5.*;
//
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



//import Lab5.*;
//
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
//        System.out.println("Element at index 1: " + node.getElement().getName());
//
//        AnimalArrayList arrayList = new AnimalArrayList();
//
//        list.addAll(arrayList);
//        list.printList();
//        System.out.println("Size: " + list.getSize());
//    }
//}

//import java.util.Arrays;
//import Lab7.Worker;
//import Lab7.Programmer;
//import Lab7.Teacher;
//
//public class Main {
//    public static void main(String[] args) {
//        Worker[] workers = new Worker[10];
//        workers[0] = new Programmer("Artoty", 5000, 100, 0.4, 1.5);
//        workers[1] = new Programmer("Yergen", 4500, 90, 0.35, 1.2);
//        workers[2] = new Programmer("Biba", 6000, 110, 0.3, 1.8);
//        workers[3] = new Programmer("Emir", 5200, 95, 0.32, 1.6);
//        workers[4] = new Programmer("Baqbergen", 4800, 105, 0.33, 1.7);
//        workers[5] = new Teacher("Yerbol", 4000, 80, 0.3, 0.05);
//        workers[6] = new Teacher("Danil", 4200, 85, 0.25, 0.04);
//        workers[7] = new Teacher("Madi", 3800, 120, 0.9, 0.03);
//        workers[8] = new Teacher("Karim", 4100, 82, 0.28, 0.06);
//        workers[9] = new Teacher("Olzhas", 3900, 78, 0.27, 0.05);
//
//
//        double totalWork5Hours = 0;
//        double totalWork10Hours = 0;
//
//        for (Worker worker : workers) {
//            totalWork5Hours += worker.toWork(5);
//            totalWork10Hours += worker.toWork(10);
//        }
//
//
//        System.out.println("Total work done by all workers in 5 hours: " + totalWork5Hours + " KJ");
//        System.out.println("Total work done by all workers in 10 hours: " + totalWork10Hours + " KJ");
//
//        System.out.println("Total work done by each worker in 10 hours:");
//        for (Worker worker : workers) {
//            System.out.println(worker.getFullName() + ": " + worker.toWork(10) + " KJ");
//        }
//
//        Worker maxPowerWorker = null;
//        double maxPower = Double.MIN_VALUE;
//
//        for (Worker worker : workers) {
//            if (worker.getPower() > maxPower) {
//                maxPower = worker.getPower();
//                maxPowerWorker = worker;
//            }
//        }
//
//        if (maxPowerWorker != null) {
//            System.out.println("Worker with maximum power: " + maxPowerWorker.getFullName());
//        }
//
//        Worker maxWorkDoneWorker = null;
//        double maxWorkDone = Double.MIN_VALUE;
//
//        for (Worker worker : workers) {
//            double workDone = worker.toWork(10);
//            if (workDone > maxWorkDone) {
//                maxWorkDone = workDone;
//                maxWorkDoneWorker = worker;
//            }
//        }
//
//        if (maxWorkDoneWorker != null) {
//            System.out.println("Worker with maximum work done in 10 hours: " + maxWorkDoneWorker.getFullName());
//        }
//        Worker leastEfficientWorker = null;
//        double minWorkDone = Double.MAX_VALUE;
//        for (Worker worker : workers) {
//            double workDone = worker.toWork(10);
//            if (workDone < minWorkDone) {
//                minWorkDone = workDone;
//                leastEfficientWorker = worker;
//            }
//        }
//        if (leastEfficientWorker != null) {
//            System.out.println( leastEfficientWorker.getFullName());
//
//        }
//    }
//}
//

//import Lab8.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Country country1 = new Country("Kyrgyzstan");
//        Country country2 = new Country("Kazakstan");
//        Country country3 = new Country("China");
//
//        ResortPlace resort1 = new ResortPlace("Hotel1", "Bishkek");
//        ResortPlace resort2 = new ResortPlace("Hotel2", "Bishkek");
//        ResortPlace resort3 = new ResortPlace("Hotel3", "city3");
//        ResortPlace resort4 = new ResortPlace("Hotel4", "Bishkek");
//        ResortPlace resort5 = new ResortPlace("Hotel5", "City5");
//
//        for (int i = 1; i <= 5; i++) {
//            resort1.addTourist(new Tourist("Tourist" + i, 100));
//            resort2.addTourist(new Tourist("Tourist" + (i + 5), 200));
//            resort3.addTourist(new Tourist("Tourist" + (i + 10),  300));
//            resort4.addTourist(new Tourist("Tourist" + (i + 15), 400));
//            resort5.addTourist(new Tourist("Tourist" + (i + 20), 500));
//        }
//
//        country1.addResort(resort1);
//        country1.addResort(resort2);
//        country1.addResort(resort3);
//        country1.addResort(resort4);
//        country1.addResort(resort5);
//
//        country2.addResort(new ResortPlace("Hotel6", "Karaganda"));
//        country2.addResort(new ResortPlace("Hotel7", "Almaty"));
//        country2.addResort(new ResortPlace("Hotel8", "Astana"));
//        country2.addResort(new ResortPlace("Hotel9", "Kostanay"));
//        country2.addResort(new ResortPlace("Hotel10", "Zhezkazgan"));
//
//        country3.addResort(new ResortPlace("Hotel11", "Beijing"));
//        country3.addResort(new ResortPlace("Hotel12", "Shanghai"));
//        country3.addResort(new ResortPlace("Hotel13", "Pekin"));
//        country3.addResort(new ResortPlace("Hotel14", "city4"));
//        country3.addResort(new ResortPlace("Hotel15", "city5"));
//
//        Continent continent = new Continent("Asia");
//        continent.addCountry(country1);
//        continent.addCountry(country2);
//        continent.addCountry(country3);
//
//        System.out.println("Total Income of All Countries in Continent: " + continent.getTotalIncomeOfAllResorts() );
//
//        Country mostProfitableCountry = continent.getTheMostProfitableCountry();
//        System.out.println("Most Profitable Country: " + mostProfitableCountry.getName());
//
//        ResortPlace mostProfitableResort = mostProfitableCountry.getResortWithMaxIncome();
//        System.out.println("Most Profitable Resort in Most Profitable Country: " + mostProfitableResort.getName());
//    }
//}



import Lab10.*;
public class Main {
    public static void main(String[] args) {
        Battery[] toshibaBatteries = {
                new ToshibaBattery(1.5, 2.0, 1000, 100),
                new ToshibaBattery(1.5, 1.5, 900, 90),
                new ToshibaBattery(1.8, 2.5, 800, 80),
                new ToshibaBattery(1.6, 2.0, 700, 70),
                new ToshibaBattery(1.4, 1.3, 600, 60)
        };

        Battery[] duracellBatteries = {
                new DuracellBattery(1.9, 1.8, 100, 1.3),
                new DuracellBattery(1.7, 2.0, 1100, 1.3),
                new DuracellBattery(1.5, 2.0, 1000, 1.6),
                new DuracellBattery(1.3, 1.9, 900, 1.9),
                new DuracellBattery(1.1, 2.1, 105, 1.2)
        };
        FlashLight[] flashLights = {
                new FlashLight(toshibaBatteries),
                new FlashLight(duracellBatteries),
                new FlashLight(toshibaBatteries),
                new FlashLight(duracellBatteries),
                new FlashLight(toshibaBatteries)
        };

        for (int i = 0; i < flashLights.length; i++) {
            System.out.println("Flashlight " + (i + 1) + " Lifetime: " + flashLights[i].getTotalLifeTime());
        }

        FlashLight maxLifetimeFlashlight = flashLights[0];
        for (int i = 1; i < flashLights.length; i++) {
            if (flashLights[i].getTotalLifeTime() > maxLifetimeFlashlight.getTotalLifeTime()) {
                maxLifetimeFlashlight = flashLights[i];
            }
        }

        System.out.println("\nFlashlight with Maximum Lifetime:");
        System.out.println("Total Lifetime: " + maxLifetimeFlashlight.getTotalLifeTime());
    }
}
