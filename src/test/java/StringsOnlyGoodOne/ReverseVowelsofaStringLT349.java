package StringsOnlyGoodOne;

public class ReverseVowelsofaStringLT349 {

    public static String reverseOnlyVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();

        while (start < end) {
            if (!checkOvewel(chars[start])) {
                start++;
            } else if (!checkOvewel(chars[end])) {
                end--;
            } else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }


        return String.valueOf(chars);
    }


    public static boolean checkOvewel(char c) {

        c = Character.toLowerCase(c);


        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        //String s = "IceCreAm";
        String s = "leetcode";

        System.out.println(reverseOnlyVowels(s));
    }
}
