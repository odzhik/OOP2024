package Lab1;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n, m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (double x = n; x <= m; x += 0.5) {
            double y = (-2.4 * x * x) + (5 * x) - 3;
            System.out.printf("%.1f      %.2f\n" , x, y);
        }
    }
}
