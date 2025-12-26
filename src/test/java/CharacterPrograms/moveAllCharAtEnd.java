package CharacterPrograms;

import java.util.Arrays;

public class moveAllCharAtEnd {


    public static void moveAllCharstoEnd(String str)
    {
        char[] chars = str.toCharArray();
        int count=0;
        for (int i=0; i<chars.length; i++)
        {
            if(chars[i]!='a')
            {
                chars[count++] = chars[i];
            }

        }

        for (int i=count; i<chars.length; i++)
        {
            chars[count++]='a';
        }

        System.out.println(chars);
    }

    public static void moveAllCharstoStart(String str)
    {
        System.out.println("new " + str);
        char[] chars = str.toCharArray();
        int count=chars.length-1;
        for (int i=chars.length-1; i>=0; i--)
        {
            if(chars[i]!='a')
            {
                chars[count--] = chars[i];
            }

        }

        for (int i=count; count>=0; i--)  // reverse to zero ***
        {
            chars[count--]='a';    // count--  ** IMP
        }

        System.out.println(chars);

    }

    public static void main(String[] args) {
        String str = "affdassdffaertahjkaaadfgfgaasdfgdfgaa";

        moveAllCharstoEnd(str);
        moveAllCharstoStart(str);
    }
}
