package extraLearnALLRepeated;

import java.util.*;
public class countWords {

    public static void main(String[] args) {

        System.out.println("Enter string");
      // Scanner sc = new Scanner(System.in);

       // String s = sc.nextLine();  // use nextLine() not next()

  String s = "  this os i    for   tehisthtg alka";
       // System.out.println(s);
        s = s.trim();
         int c=1;  // *8 IMP
        for (int i = 0; i < s.length(); i++) {

            if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
            {
                c++;
            }
        }

        System.out.println("c" +c);

        String[] words = s.split(" +");
         int count=0;
        for (int i = 0; i < words.length; i++) {

            if(words.length==0)
            {
                continue;
            }
            else
            {
                count++;
                System.out.println(words[i]);
            }
        }

        System.out.println("words cnt " +count);


    }
}
