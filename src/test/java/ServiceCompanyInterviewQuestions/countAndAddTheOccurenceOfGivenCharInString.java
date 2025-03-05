package ServiceCompanyInterviewQuestions;

public class countAndAddTheOccurenceOfGivenCharInString {

    public static int countOccurenceOfChar(String s, char c) {
        int count = 0;
        String s2 = s;
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
                newStr = newStr + s.charAt(i) + count;  //  OUTPUT --> a1ma2resha3
            } else {
                newStr = newStr + s.charAt(i);  //  OUTPUT --> a1ma2resha3
            }

        }
        System.out.println("New Stirng " + s2);
        s2 = s2.replace("a", "1");


        System.out.println("New Stirng " + newStr);
        System.out.println("New replaceAll Stirng " + s2);
        return count;

    }

    public static void main(String[] args) {

        String s = "amaresha";

        char c = 'a';

        System.out.println(countOccurenceOfChar(s, c));
    }
}
