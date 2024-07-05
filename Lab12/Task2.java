package Lab12;

import java.util.Stack;

public class Task2 {

    public static void main(String[] args) {
        Stack<Integer> primeStack = new Stack<>();
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                primeStack.push(number);
                count++;
            }
            number++;
        }

        while (!primeStack.isEmpty()) {
            System.out.print(primeStack.pop() + " ");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
