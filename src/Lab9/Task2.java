package Lab9;

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String fileName = "LabWork9.txt";
        Random rand = new Random();

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 100; i++) {
                pw.print(rand.nextInt(100) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);
    }
}
