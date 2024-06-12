package Lab1;

import java.util.Scanner;

public class sixth_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter n: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0)
                    break;
            }
        }

        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += 1.0 / i;

        System.out.println(sum);
    }
}