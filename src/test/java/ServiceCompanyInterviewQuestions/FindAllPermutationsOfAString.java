package ServiceCompanyInterviewQuestions;

public class FindAllPermutationsOfAString {


    private static void StringPermutation(String permutation, String input) {
        if (input.length() == 0) {
            System.out.println(permutation);
        } else {
            for (int i = 0; i < input.length(); i++)


                StringPermutation(permutation + input.charAt(i),
                        input.substring(0, i) + input.substring(i + 1, input.length()));
        }


    }

    public static void main(String[] args) {

        String s = "JSP";
        System.out.println("Permutation of String: " + s);
        StringPermutation("", s);



        /*
        Permutation of String: JSP
            JSP
            JPS
            SJP
            SPJ
            PJS
            PSJ
         */
    }
}
