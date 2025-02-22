package ServiceCompanyInterviewQuestions;

public class FindLargestStringInGivenString {
    public static String largestString(String s) {
        String[] words = s.split(" ");
        String largestString = words[0];

        for (int i = 1; i < words.length; i++) {


            if (words[i].length() > largestString.length()) {
                largestString = words[i];
            }
        }

        return largestString;

    }


    public static void main(String[] args) {

        String s = "this is for tesitng";

        System.out.println(smallestString(s));
        System.out.println(largestString(s));
    }


    public static String smallestString(String s) {
        String[] words = s.split(" ");
        String smallestString = words[0];   // *** IMP

        for (int i = 1; i < words.length; i++) {


            if (words[i].length() < smallestString.length()) {   // *** IMP
                smallestString = words[i];   // *** IMP
            }
        }

        return smallestString;

    }
}
