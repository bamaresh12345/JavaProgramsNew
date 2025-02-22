package ServiceCompanyInterviewQuestions;

public class SwapTwoStringsWithSubString {

    /* FORMULA  s2 = B = (A+B)-B
          s1 = s2.length -->  strarting will give

     */
    public static void main(String[] args) {
        String s1 = "AB";
        String s2 = "CDE";

        s1 = s1 + s2; //ABCDE
        s2 = s1.substring(0, s1.length() - s2.length()); //s2 = AB
        s1 = s1.substring(s2.length());
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);

    }
}
