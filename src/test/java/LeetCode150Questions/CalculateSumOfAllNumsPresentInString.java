package LeetCode150Questions;

/*
Given a string S containing alphanumeric characters, The task is to calculate the sum of all numbers
present in the string.
Examples: Input:  1abc23  Output: 24
Explanation: 1 + 23 = 24

Input:  geeks4geeks Output: 4
Input:  1abc2x30yz67 Output: 100
 */
public class CalculateSumOfAllNumsPresentInString {
    /*
    Follow the below steps to implement the idea:
    1. Create an empty string temp and an integer sum.
    2. Iterate over all characters of the string.
    3. If the character is a numeric digit add it to temp.
    4. Else convert temp string to number and add it to sum, empty temp.
    5. Return sum + number obtained from temp.

     */
    public static int calculateSumOfAllNumsPresentInString(String s) {

        String temp = "0";
        int sum = 0;
        char[] chars = s.toCharArray();  // *** IMP
        for (int i = 0; i < chars.length; i++) {

            if (Character.isDigit(chars[i]))

                temp = temp + chars[i];

            else {
                sum = sum + Integer.parseInt(temp);  // *** IMP
                temp = "0";  // *** IMP
            }
        }
        sum = sum + Integer.parseInt(temp);


        return sum;
    }

    public static void main(String[] args) {
        //String str = "geeks4geeks";
        String str = "1abc23";

        System.out.println(calculateSumOfAllNumsPresentInString(str));


    }
}
