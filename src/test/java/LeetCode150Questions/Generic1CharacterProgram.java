package LeetCode150Questions;

public class Generic1CharacterProgram {

    public static void main(String[] args) {


        char c = 'A';


        System.out.println(c);
        System.out.println((int) c);   // small letter starts from 97 --> a
        System.out.println((int) 'b');   // small letter starts from 98 --> b
        System.out.println((int) 'z');   // small letter ends  with 122 --> z

        System.out.println((int) 'A'); // capital letter starts from 65 --> A
        System.out.println((int) 'B'); // capital letter starts from 66 --> B
        System.out.println((int) 'Z'); // capital letter ends  with 122 --> Z

        System.out.println(c);

        //import java.lang.*
        /* Character  --> is a static class , provides below list of methods
            isDigit(int)
            isLetter(int)
            isLetterOrDigit(int)
            isLowerCase(int)
            isUpperCase(int)
           isWhitespace(c)
            toLowerCase(c)
            toUpperCase(c)
            Character.toString(c)

              c = Character.toLowerCase(c)

              char c1 = 0;  // *** INILIZATION to ZERO ** IS VERY IMP


          String s1 =  Character.toString(c) // ** Converts to String object;


         */

        Character.isLetter(c);

        Character.isDigit(c);
        Character.isWhitespace(c);
        Character.toLowerCase(c);
        Character.toUpperCase(c);
        String s1 = Character.toString(c);
        System.out.println(s1);

        Character.isLetterOrDigit(c);

        //==========================================================================

        String s = "test";

        s.toLowerCase();
        s.toUpperCase();
        s.toCharArray();

        s.toString();

        s.length();

        s.contains("te"); // *** IMP

        s.charAt(1);         // *** IMP

        s.equals("test");              // *** IMP
        s.equalsIgnoreCase("testt");  // *** IMP

        s.concat("tt");                       // *** IMP
        s.replace('t', 'T');
        s.replace("e", "E");
        s.replaceAll("[AEIOUaeiou]", "");   // *** IMP
        s.replaceAll("[^0-9A-Za-z]", "");

        String s2 = s.replace('t', 'T');
        System.out.println(s2);

        String s3 = s.replaceAll("[AEIOUaeiou]", "");
        System.out.println(s3);

        s.indexOf('a');  // ('from char')
        s.indexOf("st");    // ("from String")
        s.indexOf("str", 5); // ("str", fromIndex)

        s.substring(0, s.length() - 2);   // (begining Index Integer, end Index Integer)
        s.substring(3);           // (begining Index Integer)
        s.substring(0, s.length() - 'i');

        s.indexOf("test"); //wok on it
        s.indexOf("test");
        s.indexOf("test");
        s.lastIndexOf("test");
        s.lastIndexOf("test");
        s.lastIndexOf("test");

        s.compareTo("test");


        s.startsWith("AB");
        s.endsWith("AB");

        s.replaceFirst("t1", "t2");


    }
}
