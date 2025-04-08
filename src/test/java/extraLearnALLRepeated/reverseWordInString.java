package extraLearnALLRepeated;

public class reverseWordInString {

    public static void main(String[] args) {

        String s = "the sky is blue ";

        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {

        s = s.trim();
        String rev="";

        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {

            rev = words[i] +" "+rev;
        }

        System.out.println(rev);

        return rev;
    }
}
