package ServiceCompanyInterviewQuestions;

public class RemoveCharacterAPPLE {
    public static String removeCharacter(String input, char ch) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();
       // String s="";

        for (char c : input.toCharArray()) {  // *** IMP for (char c : input.toCharArray())
            if (c != ch) {
                result.append(c);              // ** IMP result.append(c);
              //  s= s+c;
            }
        }
       // System.out.println(s);
        return result.toString();  // ** IMP toString
    }

    public static void main(String[] args) {
        System.out.println(removeCharacter("hello world", 'o')); // Output: "hell wrld"
        System.out.println(removeCharacter("java programming", 'a')); // Output: "jv progrmming"
        System.out.println(removeCharacter("abcdefg", 'z')); // Output: "abcdefg"
    }
}
