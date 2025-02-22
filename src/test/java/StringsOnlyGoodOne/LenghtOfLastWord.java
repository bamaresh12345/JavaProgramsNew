package StringsOnlyGoodOne;

public class LenghtOfLastWord {

    public static int lengthofLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) { // learnt

            if (s.charAt(i) != ' ') {
                count++;
                System.out.println(s.charAt(i));
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";

        System.out.println(lengthofLastWord(s));
    }
}
