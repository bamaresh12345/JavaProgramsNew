package TlearningWorkDay;

import org.checkerframework.checker.units.qual.C;

import java.util.*;

public class duplicatecahrscountOne {


    private static void duplicatecharCount(String str) {

        Map<Character,Integer> map = new HashMap<>();
        String strnew="";
        int count=0;
        for (int i=0; i<str.length(); i++)
        {char ch = str.charAt(i);

            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
               count++;
            }
            else
            {

                map.put(ch,1);
                 strnew = strnew + ch;  //+ Integer.toString(count);


            }

            if(count > 0)
            System.out.println(strnew+ Integer.toString(count));

        }


    }

    private static void duplicatecharCount2(String str) {

       int left=0, right=0;
       int count=0;
       String strn="";

       for (right=1; right<str.length(); right++)
       {
           if(str.charAt(left)==str.charAt(right))
           {
               count++;
           }
           else
           {
               strn = strn+ str.charAt(left) + count;
               left++;
              // count=0;
           }
       }

        System.out.println(strn);
    }

    public static void main(String[] args) {

        String str = "abbbbccddaaab";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            // count consecutive characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // print char followed by count
            System.out.print(str.charAt(i) + "" + count);

            // reset count
            count = 1;
        }


        int[] arr = {1,1,1,2,2,3,3,3,3,4,5,5,6};

        int counter=0;
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++)
        {
            if(i < arr.length-1 && arr[i]== arr[i+1])
            {
                continue;
            }
            else
            {
                arr[counter++] = arr[i];
                list.add(arr[i]);
            }

        }

        while (counter < arr.length)
        {
            arr[counter++]=0;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }

    }



