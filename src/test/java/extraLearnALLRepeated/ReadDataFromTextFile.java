package extraLearnALLRepeated;


import java.io.*;

public class ReadDataFromTextFile {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\Users\\bamar\\OneDrive\\Documents\\RestAssuredFraemWorkBakkana\\JavaPrograms\\target\\Resources\\patchRequestBody.txt");

        BufferedReader bf = new BufferedReader(fr);

        String line="";

        while((line= bf.readLine())!=null)
        {
            System.out.println("line value " +line);
        }

        bf.close();
        fr.close();

        FileWriter fl = new FileWriter("C:\\Users\\bamar\\OneDrive\\Documents\\RestAssuredFraemWorkBakkana\\JavaPrograms\\target\\Resources\\patchRequestBody.txt");

        BufferedWriter bf1 = new BufferedWriter(fl);

        String line2 = "" ;

             bf1.write("Hello this isfor testing");




        bf1.close();
        fl.close();



    }
}
