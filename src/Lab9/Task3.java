package Lab9;

import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Olzhas\\IdeaProjects\\OOP\\src\\Lab9\\LabWork9.txt";
        String wordToRemove = "";

        try (Scanner scanner = new Scanner(new File(fileName));
             PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {

            StringBuilder content = new StringBuilder();

            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append(System.lineSeparator());
            }

            String updatedContent = content.toString().replaceAll("\\b" + wordToRemove + "\\b", "");
            writer.print(updatedContent);

            System.out.println("Occurrences of \"" + wordToRemove + "\" removed and file updated.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

