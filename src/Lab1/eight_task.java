package Lab1;

import java.util.Scanner;

public class eight_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        double sum = 0.0;
        int sign = 1;
        for (int i = 0; i < n; i++) {
            double a = 1.0 / (2 * i + 1);
            sum += sign * a;
            sign *= -1;
        }
        System.out.println(sum);
    }
}