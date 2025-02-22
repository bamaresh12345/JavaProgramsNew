package ServiceCompanyInterviewQuestions;

public class SwaptwoStringWithSubString {

    public static void swapTwoStringWithSubString(String s1, String s2) {
        System.out.println("S1 String before swap--> " + s1);
        System.out.println("S2 String before swap--> " + s2);


        s1 = s1 + s2;   //abcde

        s2 = s1.substring(0, s1.length() - s2.length()); //

        s1 = s1.substring(s2.length());

        System.out.println("S1 String after swap--> " + s1);
        System.out.println("S2 String after swap--> " + s2);
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "cde";

        swapTwoStringWithSubString(s1, s2);
        swapTwoStringWithSubStringStringBuilder(s1, s2);


    }

    public static void swapTwoStringWithSubStringStringBuilder(String s11, String s22) {
        String s1 = "Hello";
        String s2 = "world";

        StringBuilder sb = new StringBuilder(s1);

        sb.append(s2);

        s2 = sb.substring(0, s1.length());
        s1 = sb.substring(s2.length());
        System.out.println("S1 String after swap--> " + s1);
        System.out.println("S2 String after swap--> " + s2);

    }
}
