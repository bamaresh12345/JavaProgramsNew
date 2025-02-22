package ArraysStringsLeetCodeFinal;

/* 125 Valid Palandrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
 all non-alphanumeric characters,
 it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Input: s = "A man, a plan, a canal: Panama" Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

 */
public class ValidPalindromeLeetCode125 {


    public static boolean validPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^0-9A-Za-z]", "");
        String rev = "";
        for (int i = 0; i < s.length(); i++) {

            rev = s.charAt(i) + rev;

        }
        System.out.println(rev);
        System.out.println(s);

        if (rev.equals(s))
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s));

    }
}
