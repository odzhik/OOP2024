package Lab1;
// lab1
// first task
import java.util.Scanner;

public class first_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = name of class, Scanner is smth like function to read
        System.out.println("Enter number: ");

        float num = sc.nextFloat(); // read int by user
        float num2 = sc.nextFloat();// read second num
        //System.out.println("Username is: " + num + " " + num2); // example

        if (num == num2) {
            System.out.println("Two numbers are equal");
        }else if(num>num2){
            System.out.println(num+" is greater than "+ num2);

        }else {
            System.out.println(num+" is less than "+ num2);
        }
    }
}


