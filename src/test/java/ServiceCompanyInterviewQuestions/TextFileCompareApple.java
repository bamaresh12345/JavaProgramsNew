package ServiceCompanyInterviewQuestions;

    import java.io.*;
import java.util.*;

    public class TextFileCompareApple {

        public static void compareFiles(String file1, String file2) throws IOException {
            // BufferedReader to read files line by line
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));

            String line1 = null;
            String line2 = null;
            int lineNumber = 1;

            boolean filesAreEqual = true;

            // Read both files line by line and compare
            while ((line1 = reader1.readLine()) != null || (line2 = reader2.readLine()) != null) {
                if (line1 == null) {
                    System.out.println("File2 has extra line " + lineNumber + ": " + line2);
                    filesAreEqual = false;
                } else if (line2 == null) {
                    System.out.println("File1 has extra line " + lineNumber + ": " + line1);
                    filesAreEqual = false;
                } else if (!line1.equals(line2)) {
                    System.out.println("Difference at line " + lineNumber + ":");
                    System.out.println("File1: " + line1);
                    System.out.println("File2: " + line2);
                    filesAreEqual = false;
                }

                lineNumber++;
            }

            if (filesAreEqual) {
                System.out.println("The files are identical.");
            }

            // Close the readers
            reader1.close();
            reader2.close();
        }

        public static void main(String[] args) {
            // File paths
            String file1 = "file1.txt";  // Replace with the path of the first file
            String file2 = "file2.txt";  // Replace with the path of the second file

            try {
                compareFiles(file1, file2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


}
