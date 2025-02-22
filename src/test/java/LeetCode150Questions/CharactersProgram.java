package LeetCode150Questions;

public class CharactersProgram {


    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String str = "Te1s@t!3 is     is$t   Man?ual";
        int count = 0, alphanum = 0, upperCase = 0, lowerCase = 0, whiteSpace = 0, uppercaseletter = 0, lowercaseletter = 0, specialchars = 0;
        char[] chars = str.toCharArray();

        String s = "" + chars;
        System.out.println(String.valueOf(chars)); // String.ValueOf(chars)  --> to convert chars to String

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isDigit(chars[i])) //  OR if(Character.isDigit(c))
            {
                count++;
                System.out.println(c);
            }

            if (Character.isAlphabetic(c)) {
                System.out.println("AlphaNum : " + c);
                alphanum++;
            }

            if (Character.isUpperCase(c)) {
                System.out.println("UpperCase?  : " + c);
                upperCase++;
            }

            if (Character.isLowerCase(c)) {
                System.out.println("isLowerCase?  : " + c);
                lowerCase++;
            }

            if (Character.isDigit(c) || Character.isAlphabetic(c)) {
                System.out.println("Alphanumeric?  : " + c);
                alphanum++;
            }


            if (Character.isWhitespace(c)) {

                System.out.println("Whilte space : " + c);
                whiteSpace++;

            }

            //System.out.println("converted to  UPPER CASE : " + Character.toUpperCase(c));
            //  System.out.println("converted to  lowercase : " + Character.toLowerCase(c));

            if (c >= 'A' && c <= 'Z') {
                uppercaseletter++;
            }

            if (c >= 'a' && c <= 'z') {
                lowercaseletter++;
            }

            //Character.toLowerCase(c)

            if (!(Character.isAlphabetic(c)) && !(Character.isDigit(c)) && !(Character.isWhitespace(c)))  // IMP
            {
                System.out.println("specialchars : " + specialchars);
                System.out.println("special char is  : " + c);
                specialchars++;
            }

        }
        System.out.println("Total Whilte space : " + whiteSpace);

        System.out.println(" Total  UPPER CASE letters : " + uppercaseletter);
        System.out.println(" Total  LOWER CASE letters : " + lowercaseletter);
        System.out.println(" Total  SPECAIL  letters : " + specialchars);


        String str1 = "Pr!ogr#am%m*in&g Lan?#guag(e";
        //str1 = str1.toLowerCase();

        String str2 = str1.replaceAll("[^a-zA-Z0-9 ]", "");

        System.out.println(str2);

        String s3 = "";

        char[] chars1 = str.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            if (Character.isAlphabetic(chars1[i]) || Character.isSpace(chars1[i])) {
                s3 = s3 + chars1[i];
            }
        }

        System.out.println(s3);

    }

}


