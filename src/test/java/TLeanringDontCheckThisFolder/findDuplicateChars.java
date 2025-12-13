package TLeanringDontCheckThisFolder;

import java.util.*;

public class findDuplicateChars {


    public static void findDuplicatechars(String str){

        str = str.replaceAll(" ", "");

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1) {
                System.out.println("Dup char--> " + entry.getKey()+ "Dup count :  " + entry.getValue());
            }
        }

    }

public static void main(String args[])
{

    String str = "Better Butter";

    findDuplicatechars(str);


}
}
