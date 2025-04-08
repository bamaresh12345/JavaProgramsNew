package ServiceCompanyInterviewQuestions;

public class ReverseString2 {

    public static String reverseString(String s) {


        if(s.length()==0 || s== null)
        {
            return "not valid String, Pelase enter correct String";
        }

        //==============To reverse String  , even with Space itworks fine
        String rev = "";
        for (int i = 0; i < s.length(); i++) {

            rev = s.charAt(i) + rev;
        }

        //==============To reverse String===== entire string
//f you want to remove extra spaces and print a cleaned-up version, you should use:
        //" +" is a regular expression that matches one or more spaces.
        String[] words = rev.split(" +");  // rev.split(" *") // it splits all chars indudually eg: t h e
        String rev2 = "";
        for (int i = 0; i < words.length; i++) {

            rev2 =  words[i] +" "+ rev2;
        }


        return rev2;
    }

    public static void main(String[] args) {
        String s = "This is for Testing";

        System.out.println(reverseString(s));
    }

}
