package ServiceCompanyInterviewQuestions;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class FileCopy {

    public static void main(String[] args) throws IOException {


        System.out.println(System.getProperty("user.dir")); // always gives till head of main Project Folder
        String srcFile = System.getProperty("user.dir") + "\\target\\Resources\\sourceFile.txt";
        String destFile = System.getProperty("user.dir") + "\\target\\Resources\\DestFile.txt";

        File srcFile1= new File(srcFile);  // ** IMP for
        File destFile1= new File(destFile);

       // Files.copy(srcFile1.toPath(),destFile1.toPath()); // ** toPath() will get this method only /* File srcFile1= new File(srcFile);

        FileUtils.copyFile(srcFile1,destFile1); // works fine , only if you File File srcFile1= new File(srcFile);

        System.out.println("copy is success");
        System.out.println("print file data " + destFile1.toString()); //C:\Users\bamar\OneDrive\Documents\RestAssuredFraemWorkBakkana\JavaPrograms\target\Resources\DestFile.txt
        System.out.println("print file data " + destFile1.getAbsolutePath()); //C:\Users\bamar\OneDrive\Documents\RestAssuredFraemWorkBakkana\JavaPrograms\target\Resources\DestFile.txt
        System.out.println("print file data " + destFile1.getAbsoluteFile()); //C:\Users\bamar\OneDrive\Documents\RestAssuredFraemWorkBakkana\JavaPrograms\target\Resources\DestFile.txt
        System.out.println("print file data " + destFile1.isFile());   //ture
        System.out.println("print file data " + destFile1.getName()); //DestFile.txt
        System.out.println("print file data " + destFile1.lastModified()); //1740497529699
        System.out.println("print file data " + destFile1.canWrite());  //true
        System.out.println("print file data " + destFile1.canRead()); //ture

        //==============================MOETHOD 2=================

        srcFile ="C:\\Users\\bamar\\OneDrive\\Documents\\RestAssuredFraemWorkBakkana\\JavaPrograms\\target\\Resources\\source2.txt";
        File sourceFile = new File(srcFile);

        File destinationFile = new File(destFile);

        FileInputStream inputStream=null;
        FileOutputStream outputStream = null;

        inputStream = new FileInputStream(sourceFile);
        outputStream = new FileOutputStream(destinationFile);

       byte[] buffer = new byte[1024];  // byte[] is array use []***
        int length=0;

        while((length = inputStream.read(buffer))!= -1) // *** brackets are ere imp****
        {
            outputStream.write(buffer,0,length);
        }

        System.out.println("Success");

        //==============================Compare two text files =================
        BufferedReader reader1 = new BufferedReader(new FileReader(srcFile1));
        BufferedReader reader2 = new BufferedReader(new FileReader(destFile1));

        String line1 = reader1.readLine();
        String line2 = reader2.readLine();

        boolean eqauleLines=true;
        int lineNum=1;
        while(line1!=null || line2!= null)
        {
            if(line1==null || line2 == null)
            {
                eqauleLines = false;
                break;
            } else if ( !line1.equalsIgnoreCase(line2)) {
                eqauleLines = false;
                break;
            }

            line1 = reader1.readLine();
            line2 = reader2.readLine();
            lineNum++;

        }

        if(eqauleLines)
        {
            System.out.println("two files are same ");
        }
        else
        {
            System.out.println("two fiels are different ");
        }

        reader1.close();
        reader2.close();
    }



}
