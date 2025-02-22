package LearnToCode;

/*125. Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric
characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1: Input: s = "A man, a plan, a canal: Panama" Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/

public class ValidPalindromeIMPORTANT {
    /*
      1. Convert given string into lowercase using toLowerCase() method
      2. replace all non-alphanumeirc chars with no chars ""
      3. run for loop till end of string length and
      4. reverse the each char using revrse string
      5. check if reverse string is matching with acutal string
      6. if yes return true else return flase
     */
    public static boolean validPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^0-9A-Za-z]", "");
        String rev = "";

        for (int i = 0; i < s.length(); i++) {

            rev = s.charAt(i) + rev;
        }
        System.out.println(rev + " <-- rev and s --> " + s);
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
