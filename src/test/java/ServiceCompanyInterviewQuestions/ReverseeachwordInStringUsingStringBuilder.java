package ServiceCompanyInterviewQuestions;

public class ReverseeachwordInStringUsingStringBuilder {

    public static StringBuilder reverseEachWordInStringReturnType(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String w : words) {
            StringBuilder revWord = new StringBuilder(w);
            result.append(revWord.reverse()).append(" "); // SAME  // *** IMP frist append and reverse .append
        }
        return result;  //** IMP
    }


    public static String reverseEachWordInStringReturn(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String w : words) {
            StringBuilder revWord = new StringBuilder(w);
            result.append(revWord.reverse()).append(" ");  // *** IMP frist append and reverse .append
        }
        return result.toString(); //** IMP
    }


    public static void main(String[] args) {
        String s = "Hello World Java";

        System.out.println(reverseEachWordInStringReturnType(s)); // Output: "olleH dlroW avaJ"
        System.out.println(reverseEachWordInStringReturn(s)); // Output: "olleH dlroW avaJ"
        System.out.println(reverseEachWord(s)); // Output: "olleH dlroW avaJ"
    }

    public static String reverseEachWord(String s) {
        String[] words = s.split(" ");
        String revStr = "";

        for (int i = 0; i < words.length; i++) {
            String revWord = "";

            for (int j = 0; j < words[i].length(); j++) { // *** IMP words[i] i****

                revWord = words[i].charAt(j) + revWord;    // *** IMP words[i] i **** && charAt(j)  j***
            }
            revStr = revStr + " " + revWord;    // *** IMP words[i] i **** && charAt(j)  j***
        }
        return revStr.trim();
    }
}
