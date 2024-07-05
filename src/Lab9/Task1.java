package Lab9;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Task1 <file name>");
            return;
        }

        String fileName = args[0];
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            Scanner scanner = new Scanner(new FileReader(fileName));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;
                charCount += line.length();

                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Num of characters: " + charCount);
        System.out.println("Num of words: " + wordCount);
        System.out.println("Num of lines: " + lineCount);
    }
}


