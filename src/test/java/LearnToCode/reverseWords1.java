package LearnToCode;

public class reverseWords1 {

    public static void main(String[] args) {
        String s = "The year is 2025";


        String[] words = s.split(" ");

        String revWord = "";

        String revStr = "";

        for (int i = 0; i < words.length; i++) {


            for (int j = 0; j < words[i].length(); j++) {
                revWord = words[i].charAt(j) + revWord;
                // System.out.println(revWord);
            }

            revStr = revStr + " " + revWord + " ";
            revWord = "";
            // System.out.println(revStr);

        }


        System.out.println(" Reverserd String is : " + revStr);


    }
}
