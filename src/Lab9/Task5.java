package Lab9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Olzhas\\IdeaProjects\\OOP\\src\\Lab9\\Salary.txt";
        String[] ranks = {"assistant", "associate", "full"};
        Random rand = new Random();

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = ranks[rand.nextInt(ranks.length)];
                double salary = 0;

                switch (rank) {
                    case "assistant":
                        salary = 50000 + (rand.nextDouble() * 30000);
                        break;
                    case "associate":
                        salary = 60000 + (rand.nextDouble() * 50000);
                        break;
                    case "full":
                        salary = 75000 + (rand.nextDouble() * 55000);
                        break;
                }

                pw.printf("%s %s %s %.2f%n", firstName, lastName, rank, salary);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
