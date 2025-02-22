package StringsOnlyGoodOne;

public class reverseWordsinaString {

    public static String reverseWordsInString(String s) {
        s = s.trim();
        String[] words = s.split(" +");
        String rev = "";
        for (int i = 0; i < words.length; i++) {

            rev = words[i] + " " + rev;
        }

        return rev.trim();
    }

    public static void main(String[] args) {
        //String s = "  hello world  ";
        String s = "the sky is blue";

        System.out.println(reverseWordsInString(s));

    }
}
