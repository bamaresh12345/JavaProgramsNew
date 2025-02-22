package StringsOnlyGoodOne;

public class ValidAnagram {

    public static boolean validAnagram(String s, String t) {

        //base case
        if (s.length() != t.length())
            return false;

        s = s.toLowerCase();
        t = t.toLowerCase();

        int[] ch = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 'a']++;
            ch[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != 0)
                return false;

        }

        return true;

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaraM";

        System.out.println(validAnagram(s, t));
    }
}
