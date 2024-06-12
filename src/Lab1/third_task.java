package Lab1;
// lab1
// third task

import java.util.Scanner;

public class third_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = name of class, Scanner is smth like function to read
        System.out.println("Enter number: ");

        int total_distance = sc.nextInt(); // read int by user
        int hours1 = sc.nextInt();// read second num
        int hours2 = sc.nextInt();
        int distance1 = 20;
        int distance2 = total_distance - distance1;


        if((distance1 / hours1) > (distance2 / hours2)) {
            System.out.println("Before");
        }else{
            System.out.println("After");
        }
        }
    }
        //System.out.println("Username is: " + num + " " + num2); // example