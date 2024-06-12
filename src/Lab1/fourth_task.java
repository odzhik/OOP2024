package Lab1;

import java.util.Scanner;

public class fourth_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = name of class, Scanner is smth like function to read
        System.out.println("Enter number: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float equation = (5 * x * x) - (7 * x) + 2;

        if(equation == y){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
