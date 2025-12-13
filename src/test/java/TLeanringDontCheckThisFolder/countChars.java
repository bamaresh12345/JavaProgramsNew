package TLeanringDontCheckThisFolder;

import java.util.HashMap;
import java.util.Map;

public class countChars {

    public static void duplicateElements(String[] arr)
    {
        if(arr.length ==0)
        {
            System.out.println("Arr emp");
        }
        else {
        Map<String,Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++)
        {
            String  s = arr[i];
            if(map.containsKey(s))
            {
                map.put(s, map.get(s)+1);
            }
            else
            {
                map.put(s,1);
            }

        }

        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.println("dup key -> " +entry.getKey() +" Dup val " + entry.getValue());
            }
        }

}

    }
    public static void main(String[] args) {
        String[] arr = {"java","c","paython","java","c","java","test"};

        duplicateElements(arr);
    }
}
