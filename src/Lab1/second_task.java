package Lab1;
// second task
import java.util.Scanner;

public class second_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = name of class, Scanner is smth like function to read
        System.out.println("Enter number: ");

        String num = sc.nextLine();

        int first_digits = 0;
        int second_digits = 0;

        for(int i = 0; i < 3; i++) {
            int cur = Integer.parseInt(num.substring(i,i+1));
            first_digits = first_digits + cur;
        }
        for(int i = 3; i < 6; i++) {
            int cur = Integer.parseInt(num.substring(i,i+1));
            second_digits = second_digits + cur;
        }
        if (first_digits == second_digits) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println(first_digits + " " + second_digits);
    }
}