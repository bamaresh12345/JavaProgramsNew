package ServiceCompanyInterviewQuestions;

public class ReverseStringWithPresevingSpaces {

    public static String ReverseStringPreserveSpaces(String s) {

        int start = 0;  // ** IMP

        char[] chars = s.toCharArray();

        int end = chars.length - 1;  // ** IMP

        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++;
            } else if (!Character.isLetter(chars[end])) {
                end--;
            } else {
                char c = chars[start];
                chars[start] = chars[end];
                chars[end] = c;
                start++;
                end--;
            }
        }

        String newStr = String.valueOf(chars);   // **8 IMP
        return newStr;

    }

    public static void main(String[] args) {
        String s = "I Am Not String";  //g ni rtS toNmAI

        System.out.println(ReverseStringPreserveSpaces(s));
    }
}
