package LearnToCode;

/*
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same
 */
public class ValidParanthesesIMPORTANT {
    /*
     1. get the length of the string
     2. run while loop till length of string >0
     3. assign string s to temp variable
     4. replace string s with "[]" or {} or () if exsits
     5. check the length of temp and string s ,
     6. if both are matching exit the while loop
     7. check the length of string s
     8. if s lenth is equal to zero return true
     9. else return false
     */
    public static boolean validParantheses(String s) {
        String temp = "";

        while (s.length() > 0) {
            temp = s;

            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");

            if (s.length() == temp.length())
                break;

        }

        if (s.length() == 0)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        //String s = "()[]{}";
        //String s = "()[]{}";
        //String s = "(]";
        String s = "([])";

        System.out.println(validParantheses(s));
    }
}
