package ServiceCompanyInterviewQuestions;

import java.util.*;

public class PalindromeSortApple {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to sort the list of palindromes
    public static List<String> palindromeSort(String[] array) {
        List<String> palindromes = new ArrayList<>();

        // Add palindromes to the list
        for (String str : array) {
            if (isPalindrome(str)) {
                palindromes.add(str);
            }
        }

        // Sort the list of palindromes in lexicographical order
        Collections.sort(palindromes);

        return palindromes;
    }

    public static void main(String[] args) {
        String[] input = {"madam", "racecar", "hello", "level", "world", "refer"};

        System.out.println("Input Strings: " + Arrays.toString(input));
        List<String> result = palindromeSort(input);

        System.out.println("Sorted Palindromes: " + result);
    }
}
