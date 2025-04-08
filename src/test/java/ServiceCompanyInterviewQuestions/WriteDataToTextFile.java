package ServiceCompanyInterviewQuestions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("C:\\Users\\bamar\\OneDrive\\Documents\\RestAssuredFraemWorkBakkana\\JavaPrograms\\target\\Resources\\DestFile.txt");

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello for tesitng\n");
        bw.write("this is 2nd line\n");
        bw.write("this is thried line\n");

        bw.close();




    }
}
