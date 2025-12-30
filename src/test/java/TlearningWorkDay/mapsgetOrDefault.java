package TlearningWorkDay;

import java.util.*;

public class mapsgetOrDefault {

    public static void mapsGetOrDefault(String s)
    {
        s = s.replaceAll(" " , "");
        Map<Character,Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch, 0)+1);

        }

        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.print( entry.getKey() +"" + entry.getValue());
               // System.out.println("Dup char : " + entry.getKey() + " Dup count : " + entry.getValue());
            }

        }

        System.out.println("********map.KeySet()**********************");
        for (Character ch : map.keySet())
        {
            if(map.get(ch) > 1)
            System.out.print( ch +"" + map.get(ch));   //*****IMP

        }

      /*  System.out.println("********map.KeySet()**********************");  // NOT WORK only we nca print Vlaues
        for (Integer i : map.values())
        {
            if(map.get(i) > 1)
            {
                if(map.containsKey('b'))
                {
                    System.out.println("count --> b : " + map.get(i) );
                }
            }

        }*/


        // System.out.println(map);
// Only print values
        for (Integer i : map.values())
        {
            System.out.println("Vlues :  " + i);

        }

    }
    public static void main(String[] args) {

        String  s = "aaabbbbccdddaas";;

        mapsGetOrDefault(s);


    }
}
