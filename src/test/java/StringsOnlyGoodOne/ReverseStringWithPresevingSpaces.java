package StringsOnlyGoodOne;

public class ReverseStringWithPresevingSpaces {

    public static String ReverseStringPreserveSpaces(String s) {

        int start = 0;

        char[] chars = s.toCharArray();
        int end = chars.length - 1;

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
        String newstr = new String(chars);  // ** IMP****
        System.out.println("new str --> " + newstr);

        return String.valueOf(chars);

    }

    public static void main(String[] args) {
        String s = "I Am Not String";

        System.out.println(ReverseStringPreserveSpaces(s));
    }
}
