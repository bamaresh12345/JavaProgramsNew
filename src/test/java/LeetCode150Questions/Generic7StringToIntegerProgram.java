package LeetCode150Questions;

public class Generic7StringToIntegerProgram {

    public static void main(String[] args) {

        String str = "1234";

        int result = Integer.parseInt(str); // using Integer.parseInt()
        // int result2 = Integer.valueOf(str); //using Integer.valueOf()

        System.out.println(result);

        int k = 123;
        String s = "Amar" + k; //Convert Integer to String  just concanate with +

        String s1 = "Testing";
        char[] chars = s1.toCharArray();
        System.out.println(chars[2]);
        System.out.println(chars.toString());  //gives [C@6aaa5eb0  will not work

        //1st way of converting Char Array to String -->  String s3 = new String(chars);
        String s3 = new String(chars);

        System.out.println("String s3 = new String(chars) " + s3);

        //1st way of converting Char Array to String    -->  String.valueOf(chars)
        System.out.println("String.valueOf(chars)--> " + String.valueOf(chars));

    }
}
