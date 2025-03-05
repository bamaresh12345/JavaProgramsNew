package ServiceCompanyInterviewQuestions;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortTextFilewithSinleColumn {

    public static void main(String[] args) throws IOException {

        /*
            BufferedReader reader = null;
            BufferedWriter writer = null;
         BufferedReader reader = new BufferedReader(new FileReader(destFile));
          writer = new BufferedWriter(new FileWriter(destFile));

         */

        BufferedReader reader = null;
        BufferedWriter writer = null;

        String destFile = System.getProperty("user.dir") + "\\target\\Resources\\DestFile.txt";

        //Create an ArrayList object to hold the lines of input file
        ArrayList<String> lines = new ArrayList<>();
        try {
            //Creating BufferedReader object to read the input file

            reader = new BufferedReader(new FileReader(destFile));

            //Reading all the lines of input file one by one and adding them into ArrayList
            String currentLine = reader.readLine();

            while (currentLine != null) {
                lines.add(currentLine);

                currentLine = reader.readLine();
            }

            //Sorting the ArrayList
            Collections.sort(lines);

            //Creating BufferedWriter object to write into output file
            writer = new BufferedWriter(new FileWriter(destFile));

            //Writing sorted lines into output file
            for (String line : lines) {
                writer.write(line);

                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("successfuly sort the file ");
        reader.close();
        writer.close();

    }
}
