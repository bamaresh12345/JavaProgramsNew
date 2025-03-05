package LeetCode150Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Generic3StringBuilderProgram {
/*
java.lang.Object
 ↳ java.lang
    ↳ Class StringBuilder

    The code demonstrates the usage of multiple StringBuilder methods like
    sb.reverse(), sb.append(" "),   sb.insert(13, " Java"),  sb.replace(0, 5, "Welcome to"),  sb.delete(8, 14),
     sb.substring(5, 10), sb.charAt(5)  etc.
     sb.toString(); sb.length(), sb.setCharAt(5, 'X');

    Initial StringBuilder: GeeksforGeeks
After append: GeeksforGeeks is awesome!
After insert: GeeksforGeeks Java is awesome!
After replace: Welcome toforGeeks Java is awesome!
After delete: Welcome eeks ...
 */
    public static void main(String[] args) {

        // Create a new StringBuilder with the
        // initial content "GeeksforGeeks"
        StringBuilder sb = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial StringBuilder: " + sb);

        // 1. Append a string to the StringBuilder
        sb.append(" is awesome!");
        System.out.println("After append: " + sb); //GeeksforGeeks is awesome!

        // 2. Insert a substring at a specific position
        sb.insert(13, " Java");
        System.out.println("After insert: " + sb);  //GeeksforGeeks Java is awesome!

        // 3. Replace a substring with another string
        sb.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sb);  //Welcome toforGeeks Java is awesome!

        // 4. Delete a substring from the StringBuilder
        sb.delete(8, 14);
        System.out.println("After delete: " + sb);  //Welcome eeks Java is awesome!

        // 5. Reverse the content of the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);   //!emosewa si avaJ skee emocleW **** IMP

        // 6. Get the current capacity of the StringBuilder
        int capacity = sb.capacity();
        System.out.println("Current capacity: " + capacity);  // 60

        // 7. Get the length of the StringBuilder
        int length = sb.length();
        System.out.println("Current length: " + length); //29

        // 8. Access a character at a specific index
        char charAt5 = sb.charAt(5);
        System.out.println("Character at index 5: " + charAt5); // e

        // 9. Set a character at a specific index
        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);   //!emosXwa si avaJ skee emocleW

        // 10. Get a substring from the StringBuilder
        String substring = sb.substring(5, 10);
        System.out.println("Substring (5 to 10): " + substring);  //Xwa s

        // 11. Find the index of a specific substring
        sb.reverse(); // Reversing back to original order for search
        int indexOfGeeks = sb.indexOf("Geeks");
        System.out.println("Index of 'Geeks': " + indexOfGeeks); // -1

        // 12. Delete a character at a specific index
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);  //Welcoe eeks Java is awXsome!

        // 13. Convert the StringBuilder to a String
        String result = sb.toString();
        System.out.println("Final String: " + result);   //Welcoe eeks Java is awXsome!
    }
}
