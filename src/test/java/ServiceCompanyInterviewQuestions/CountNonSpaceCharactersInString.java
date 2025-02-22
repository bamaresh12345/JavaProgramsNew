package ServiceCompanyInterviewQuestions;

public class CountNonSpaceCharactersInString {

    public static int countNonSpaceCharactersInString(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {

            if (Character.isLetter(chars[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "This is String";

        System.out.println(countNonSpaceCharactersInString(s));
    }
}
