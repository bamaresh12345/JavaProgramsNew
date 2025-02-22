package StringsOnlyGoodOne;

public class CountNumberOfWordsInString {

    public static void main(String[] args) {

        String s = "this is   fror   asdfasdf tesitng  ";
        s = s.trim();

        String[] words = s.split(" +");
        System.out.println("total words in string : " + words.length);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println("total words in string with space : " + count);
    }
}
