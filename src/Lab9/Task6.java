package Lab9;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = input.nextLine();

        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            Map<Character, Integer> letterCount = new HashMap<>();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase();
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
                    }
                }
            }

            for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}