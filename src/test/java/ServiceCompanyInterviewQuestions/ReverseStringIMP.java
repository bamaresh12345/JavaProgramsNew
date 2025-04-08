package ServiceCompanyInterviewQuestions;

public class ReverseStringIMP {

    public static String reverseString(String s) {


        if(s == null || s.length()==0 || s.isEmpty() || s.isBlank() ) // ** IMP***
        {
            return "not valid String, Pelase enter correct String";
        }

       //==============To reverse String , SPACE is also considered
        String rev = "";
        for (int i = 0; i < s.length(); i++) {

            rev = s.charAt(i) + rev;
        }

        //==============To reverse String===== entire string

        String[] words = rev.split(" +");
        String rev2 = "";
        for (int i = 0; i < words.length; i++) {

            rev2 =  words[i] +" "+ rev2;
        }


        return rev2;
    }

    public static void main(String[] args) {
        String s = "This is for Testing";
       // String s = null;

        System.out.println(reverseString(s));
    }

}
