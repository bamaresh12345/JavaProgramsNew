package ServiceCompanyInterviewQuestions;

import java.io.*;
import java.nio.file.*;

public class LogFileParserIMPApple {

    public static void extractErrors(String inputFile, String outputFile, String keyword) {
        // Create the input and output file readers and writers
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Check if the line contains the specified keyword (e.g., "ERROR")
                if (line.contains(keyword)) {
                    // Write the line to the output file
                    writer.write(line);
                    writer.newLine(); // Add a newline after each line
                }
            }
            System.out.println("Error messages extracted successfully.");
        } catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Specify the input and output file paths
        String inputFile = "application.log";  // Replace with the path to your log file
        String outputFile = "error_messages.txt";  // Output file where errors will be saved
        String keyword = "ERROR";  // Keyword to filter error messages

        // Call the method to extract errors
        extractErrors(inputFile, outputFile, keyword);
    }
}
