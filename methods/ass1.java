import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentTestScores {
       private static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
    public static void main(String[] args) {
        // Input and output file names
        String inputFileName = "text.txt";
        String outputFileName = "testavg.out";

        try {
            // Read input from the file
            Scanner scanner = new Scanner(new File(inputFileName));

            // Create FileWriter for output
            FileWriter writer = new FileWriter(outputFileName);

            // Read and process each student's data
            while (scanner.hasNext()) {
                String firstName = scanner.next();
                String lastName = scanner.next();
                double[] testScores = new double[5];

                // Read test scores
                for (int i = 0; i < 5; i++) {
                    testScores[i] = scanner.nextDouble();
                }

                // Calculate average test score
                double average = calculateAverage(testScores);

                // Output to the file
                writer.write("Student Name: " + firstName + " " + lastName + "\n");
                writer.write("Test Scores: ");
                for (double score : testScores) {
                    writer.write(score + " ");
                }
                writer.write("\nAverage Test Score: " + String.format("%.2f", average) + "\n\n");
            }

            // Close the scanner and writer
            scanner.close();
            writer.close();

            System.out.println("Data processed successfully. Results written to " + outputFileName);
        } catch (FileNotFoundException e) {
            System.err.println("Error: Input file not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error writing to output file.");
            e.printStackTrace();
        }
    }

 
}
