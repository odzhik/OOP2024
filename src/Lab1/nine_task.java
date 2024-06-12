package Lab1;

import java.util.Scanner;

public class nine_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        String n = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int w = Integer.parseInt(n.substring(i, i+1));
            sum += w;

        }
        System.out.println(sum);
    }
}