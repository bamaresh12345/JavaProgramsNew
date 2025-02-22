package ServiceCompanyInterviewQuestions;

public class ReverseString2 {

    public static String reverseString(String s) {
        String rev = "";
        for (int i = 0; i < s.length(); i++) {

            rev = s.charAt(i) + rev;
        }

        return rev;
    }

    public static void main(String[] args) {
        String s = "This is a string";

        System.out.println(reverseString(s));
    }

}
