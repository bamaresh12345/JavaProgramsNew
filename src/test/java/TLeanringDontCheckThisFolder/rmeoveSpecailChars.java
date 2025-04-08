package TLeanringDontCheckThisFolder;

import java.util.Arrays;

public class rmeoveSpecailChars {

    public static void main(String[] args) {
        String s = "T(*)*his ifr*(o tesitng*(&&)(";

        s= s.replaceAll("[^A-Za-z0-9 ]", "");

        System.out.println(s);


        String s1 = "Java                    Programming    selenium  autmation";

        String s3 =s1.replace(" " ,"");
        System.out.println(s3);

        String s10 = "Java                    Programming    selenium  autmation";
/*
s10.split(" +")  ---. + is very imp
[Java, , , , , , , , , , , , , , , , , , , , Programming, , , , selenium, , autmation]
 Java                    Programming    selenium  autmation
 Java                    Programming    selenium  autmation

 */
        String[] s2 = s10.split(" +"); // ** IMP
        System.out.println(Arrays.toString(s2));
         String newStr="";
        for (int i = 0; i < s2.length; i++) {

            newStr = newStr + " " + s2[i];
        }

        System.out.println(newStr);
        String newStr1="";

        for (int i = 0; i < s2.length; i++) {

            String sr1 = s2[i].trim();

            newStr1 = newStr1 + " " + sr1;
        }

        System.out.println(newStr1);
    }
}
