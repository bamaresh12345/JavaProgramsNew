package TLeanringDontCheckThisFolder;

import java.io.*;
import java.util.Scanner;

public class ReadDataFormTextFile {

    public static void main(String[] args) throws IOException {

        //Method 1 Reading file  --> java.io.* Package

        FileReader fr = new FileReader("C:\\Users\\bamar\\OneDrive\\Documents\\RestAssuredFraemWorkBakkana\\JavaPrograms\\target\\Resources\\putAPIRequestBody.txt");

        BufferedReader bf = new BufferedReader(fr);
        String s = "";
        while (bf.readLine() != null) {
            System.out.println(bf.readLine());
             s = bf.readLine();
            if(s!=null && s.contains("checkout"))
            {
                System.out.println("elelment found");
            }

        }

        bf.close();


        //Method 2 Reading file uisng File  --> java.io.* Package
        File file = new File("C:\\Users\\bamar\\OneDrive\\Documents\\RestAssuredFraemWorkBakkana\\JavaPrograms\\target\\Resources\\putAPIRequestBody.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

        sc.close();



    }
}
