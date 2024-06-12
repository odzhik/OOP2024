package Lab1;

import java.util.Scanner;

public class fifth_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = name of class, Scanner is like a function to read

        System.out.println("Enter integers (0 to stop):");

        int number, sum = 0;

        // Loop until user enters 0
        do {
            number = sc.nextInt();

            // Check if odd and add to sum
            if (number % 2 != 0) {
                sum += number;  // Add only odd numbers
            }
        } while (number != 0);

        System.out.println("Sum of odd numbers: " + sum);

        sc.close();
    }
}


