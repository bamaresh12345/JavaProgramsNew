package TlearningWorkDay;

public class ReverseVowel {

  public static String reverseVowels(String s)
  {
      int left=0;
      int right = s.length()-1;

      char[] chars = s.toCharArray();

      while(left <right)
      {
          if(!isVowel(chars[left]))
          {
              left++;
          }
          else if(!isVowel(chars[right]))
          {
              right--;
          }
          else
          {
              char t =  chars[left];
              chars[left] = chars[right];
              chars[right] = t;
              left++;
              right--;
          }

      }

      System.out.println(chars);
      return s;

  }

  public static boolean isVowel(char c)
  {
      c = Character.toLowerCase(c);

      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
          return true;
      else
          return false;

  }
    public static void main(String[] args) {

        String s = "IceCreAm"; //  Output: "AceCreIm"

        System.out.println(reverseVowels(s));
    }

}
