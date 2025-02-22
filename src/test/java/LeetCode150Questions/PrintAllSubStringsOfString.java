package LeetCode150Questions;

public class PrintAllSubStringsOfString {

    public static boolean findAllStrings(String[] words, String sub) {
        boolean allFound = true;
        for (String s : words) {
            if (!s.contains(sub)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String[] words = {"hello", "yellow", "mellow"};

        String s = words[1];
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            String substr = s.substring(i, s.length());

            b = findAllStrings(words, substr);

            String substr2 = s.substring(i, s.length());

            if (b) {
                System.out.println("smallest subStrong of all " + substr);
                break;
            }
        }

        if (b == false) {
            System.out.println("smallest subStrong of all not found ");
        }

    }
}
