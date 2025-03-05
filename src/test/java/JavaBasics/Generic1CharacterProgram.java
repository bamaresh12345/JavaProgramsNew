package JavaBasics;

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
            Character.isDigit(int)
            Character.isLetter(int)
            Character.isLetterOrDigit(int)
            Character.isLowerCase(int)
            Character.isUpperCase(int)
           Character.isWhitespace(c)
            Character.toLowerCase(c)
            Character.toUpperCase(c)
            Character.toString(c)

              c = Character.toLowerCase(c)

              char c1 = 0;  // *** INILIZATION to ZERO ** IS VERY IMP


          String s1 =  Character.toString(c) // ** Converts to String object;


         */
               c='B';
               //String s21="Amar";
              // char[] chars1 = s21.toCharArray();

        Character.isLetter(c);
        Character.isDigit(c);
        Character.isWhitespace(c);
        Character.toLowerCase(c);
        Character.toUpperCase(c);
        Character.isAlphabetic(c);
        Character.isWhitespace(c);
        String s1 = Character.toString(c);
        System.out.println(s1);

        Character.isLetterOrDigit(c);

        String str = "Te1s@t!3 is     is$t   Man?ual";
        int count=0,alphanum=0,upperCase=0,lowerCase=0,whiteSpace=0,uppercaseletter=0 , lowercaseletter=0,specialchars=0;
        char[] chars = str.toCharArray();

        String s = "" + chars;
        System.out.println(String.valueOf(chars)); // String.ValueOf(chars)  --> to convert chars to String

        for(int i =0; i < chars.length; i++)
        {
            char c1= chars[i];
            if(Character.isDigit(chars[i])) //  OR if(Character.isDigit(c))
            {
                count++;
                System.out.println(c1);
            }

            if(Character.isAlphabetic(c1))
            {	System.out.println("AlphaNum : " + c1);
                alphanum++;
            }

            if(Character.isUpperCase(c1))
            {
                System.out.println("UpperCase?  : " + c1);
                upperCase++;
            }

            if(Character.isLowerCase(c1))
            {
                System.out.println("isLowerCase?  : " + c1);
                lowerCase++;
            }

            if(Character.isDigit(c1) || Character.isAlphabetic(c1) )
            {
                System.out.println("Alphanumeric?  : " + c1);
                alphanum++;
            }


            if(Character.isWhitespace(c1))
            {

                System.out.println("Whilte space : " + c1);
                whiteSpace++;

            }

            //System.out.println("converted to  UPPER CASE : " + Character.toUpperCase(c));
            //  System.out.println("converted to  lowercase : " + Character.toLowerCase(c));

            if(c1 >='A' && c1 <='Z')
            {
                uppercaseletter++;
            }

            if(c1 >='a' && c1 <='z')
            {
                lowercaseletter++;
            }

            //Character.toLowerCase(c)

            if(!(Character.isAlphabetic(c1)) && !(Character.isDigit(c1)) && !(Character.isWhitespace(c1)))  // IMP
            {
                System.out.println("specialchars : " +specialchars);
                System.out.println("special char is  : " + c1);
                specialchars++;
            }

        }
        System.out.println("Total Whilte space : " + whiteSpace);

        System.out.println(" Total  UPPER CASE letters : " + uppercaseletter);
        System.out.println(" Total  LOWER CASE letters : " + lowercaseletter);
        System.out.println(" Total  SPECAIL  letters : " + specialchars);




        String str1="Pr!ogr#am%m*in&g Lan?#guag(e";
        //str1 = str1.toLowerCase();

        String str2 = str1.replaceAll("[^a-zA-Z0-9 ]", "");

        System.out.println(str2);

        String s3 = "";

        char[] chars1 = str.toCharArray();

        for(int i=0; i<chars.length-1; i++)
        {
            if(Character.isAlphabetic(chars1[i]) || Character.isSpace(chars1[i]))
            {
                s3 = s3 + chars1[i];
            }
        }

        System.out.println(s3);


    }
}
