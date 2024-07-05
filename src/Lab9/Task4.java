import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Olzhas\\IdeaProjects\\OOP\\src\\Lab9\\SortedStrings.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            List<String> strings = new ArrayList<>();

            // Read strings from the file into a list
            while (scanner.hasNextLine()) {
                strings.add(scanner.nextLine());
            }

            // Check if strings are sorted in increasing order
            boolean sorted = true;
            for (int i = 0; i < strings.size() - 1; i++) {
                if (strings.get(i).compareTo(strings.get(i + 1)) > 0) {
                    // Strings are not in increasing order
                    System.out.println("Strings are not sorted:");
                    System.out.println(strings.get(i));
                    System.out.println(strings.get(i + 1));
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("Strings in the file are sorted in increasing order.");
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
