package ServiceCompanyInterviewQuestions;

public class ReverseEachWordInString {

    public static String reverseEachWordInString(String s) {
        String[] words = s.split(" ");
        String revString2 = "";
        String revString1 = "";


        for (int i = 0; i < words.length; i++) {

            String revWord = "";   // Very IMP***


            for (int j = 0; j < words[i].length(); j++) {

                revWord = words[i].charAt(j) + revWord;    // Very IMP***

            }
            revString1 = revString1 + " " + revWord;  // Very IMP***
            //  revString2 = revWord + " " + revString2;  // Very IMP***

        }

        System.out.println("Reversed string : " + revString1);
        //System.out.println("Reversed string : " + revString2);


        return revString1;
    }

    public static void main(String[] args) {
        String s = "Java is good prgrgramming langugage";

        System.out.println(reverseEachWordInString(s));
    }
}
