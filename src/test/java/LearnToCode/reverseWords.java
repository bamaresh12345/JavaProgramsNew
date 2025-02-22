package LearnToCode;

public class reverseWords {

    public static void main(String[] args) {
        String s = "The year is 2025, and technology has advanced significantly over the past decade. 85% of households in developed countries have access to the internet";


        String[] words = s.split(" ");

        String revWord = "";

        String revStr = "";

        for (int i = 0; i < words.length; i++) {
            String s1 = words[i];

            for (int j = 0; j < s1.length(); j++) {
                revWord = s1.charAt(j) + revWord;
                System.out.println(revWord);
            }

            revStr = " " + revWord + " ";
            revWord = "";
            System.out.println(revStr);

        }


        System.out.println(" Reverserd String is : " + revStr);


    }
}
