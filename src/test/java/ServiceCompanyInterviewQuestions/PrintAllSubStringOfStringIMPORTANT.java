package ServiceCompanyInterviewQuestions;

public class PrintAllSubStringOfStringIMPORTANT {

    public static void main(String[] args) {

        String s = "hello";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {  //<=  ****

                String subStr = s.substring(i, j);

                System.out.println(subStr);

            }

        }


    }
}
